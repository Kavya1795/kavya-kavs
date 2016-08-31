package com.shopmusic.controller;

import java.io.IOException;
import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopmusic.model.Customer;
import com.shopmusic.model.Item;
import com.shopmusic.service.CategoryService;
import com.shopmusic.service.CustomerService;
import com.shopmusic.service.ItemService;


@Controller
public class HomeController
{
	@Autowired
	CategoryService categoryService;
	@Autowired
	ItemService itemService;
	@Autowired
	CustomerService customerService;
	@RequestMapping("/")
	public ModelAndView home() {
		System.out.println("home() method called");
		return new ModelAndView("home");
		
	}
	@RequestMapping("/contact")
	public ModelAndView ContactUs() {
		System.out.println("contactus() method called");
		return new ModelAndView("ContactUs");
		
	}
	@RequestMapping("/about")
	public ModelAndView AboutUs() {
		System.out.println("aboutus() method called");
		return new ModelAndView("AboutUs");
	}
	
	
@RequestMapping("/signUp")
public ModelAndView signUp(){
	System.out.println("signUp(); method called");
Customer customer=new Customer();
	return new ModelAndView("signUp","cust",customer);	
}

@RequestMapping("/login")
public String loginMethod()
{
	System.out.println(" I am in login");
	return "login";
}

@RequestMapping("/logout")
public String logout(HttpServletRequest request)
{
	request.getSession().invalidate();
	System.out.println("logout page called");

	return "logout";
	
}
@RequestMapping("/CustomerCheck")
public ModelAndView customerCheck(Principal principal) throws JsonGenerationException, JsonMappingException, IOException
{
	List<Item> item=itemService.viewItem();
	ObjectMapper mapper=new ObjectMapper();
	String jsonData=mapper.writeValueAsString(item);
	System.out.println("jsonData"+jsonData);
	return new ModelAndView("ViewProductDetails","item",jsonData);
  }
	
@RequestMapping("/ViewSingleItem")
public ModelAndView viewsingleitem(@RequestParam("id") String id)
{
Item item=itemService.getItemById(Integer.parseInt(id));
return new ModelAndView("ViewSingleItem","item",item);
}

@RequestMapping("/AdminCheck")
public ModelAndView adminCheck(Principal principal)
{
	System.out.println("UserName"+principal.getName());
	return new ModelAndView("adminHome");
	
	
}

@RequestMapping("/register")
public ModelAndView register(@Valid@ModelAttribute("cust") Customer customer ,BindingResult br)

{
	
	if(br.hasErrors())
	{
		return new ModelAndView("signUp");
	}
	System.out.println("UserName:"+customer.getUsername());
	System.out.println("Password:"+customer.getPassword());
	System.out.println("EmailId:"+customer.getEmailId());
	customerService.addCustomer(customer);
	return new ModelAndView("signUp");

	
}

@RequestMapping("/category")
public ModelAndView modifyItem(@RequestParam("category") String category) throws JsonGenerationException,JsonMappingException,IOException
{
	List<Item> item=categoryService.getItemByCategory(category);
	ObjectMapper mapper=new ObjectMapper();
	String jsonData=mapper.writeValueAsString(item);
	System.out.println("jsonData"+jsonData);
	return new ModelAndView("piano","item",jsonData);
}
}