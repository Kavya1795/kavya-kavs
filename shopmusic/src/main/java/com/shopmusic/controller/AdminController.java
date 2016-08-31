package com.shopmusic.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.shopmusic.model.Customer;
import com.shopmusic.model.Item;
import com.shopmusic.service.CustomerService;
import com.shopmusic.service.ItemService;

@Controller
public class AdminController {

	@Autowired
	CustomerService customerService;

	@Autowired
	ItemService itemService;

	@RequestMapping("/ViewCustomer")
	public ModelAndView viewCustomer() throws JsonGenerationException, JsonMappingException, IOException {
		List<Customer> list = customerService.viewCustomer();
		System.out.println("List is:" + list);
		ObjectMapper mapper = new ObjectMapper();
		String listJSON = mapper.writeValueAsString(list);
		System.out.println(listJSON);
		return new ModelAndView("ViewCustomer", "listOfCustomers", listJSON);
	}

	@RequestMapping("AddItem")
	public ModelAndView addItem() {
		Item item1 = new Item();
		return new ModelAndView("addItem", "item", item1);

	}

	@RequestMapping("/addProduct")
	public ModelAndView register(@Valid @ModelAttribute("item") Item item, BindingResult br,
			@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		itemService.addProduct(item);
		MultipartFile itemimage = item.getFile();

		Path path = Paths.get("C://Users//MRuser//workspace3//shopmusic//src//main//webapp//WEB-INF//resources//images//"+ item.getItemId() + ".jpg");

		if (itemimage != null && !itemimage.isEmpty()) {
			itemimage.transferTo(new File(path.toString()));
			return new ModelAndView("addItem");
		}
		System.out.println("successfully add the product/item details");
		itemService.addProduct(item);
		System.out.println("item name" + item.getItemName());
		return new ModelAndView("addItem");

	}

	@RequestMapping("/deleteItem")
	public String deleteItem(@RequestParam("id") int id) {
		itemService.deleteItem(id);
		return "redirect:/ViewItem";
	}

	@RequestMapping("/ViewItem")
	public ModelAndView viewItem() throws JsonGenerationException, JsonMappingException, IOException {
		List<Item> item = itemService.viewItem();
		ObjectMapper mapper = new ObjectMapper();
		String jsonData = mapper.writeValueAsString(item);
		System.out.println("jsonData" + jsonData);
		return new ModelAndView("ViewProduct", "item", jsonData);
	}

	@RequestMapping("/updateItem")
	public ModelAndView EditItem(@RequestParam("id") int id) {
		System.out.println("id" + id);
		Item item = itemService.getItemById(id);
		System.out.println("Item Name" + item.getItemId());
		return new ModelAndView("oneItem", "item", item);
	}

	@RequestMapping("/updateThisItem")
	public String updateThisItem(@RequestParam("itemId") String itemId, @RequestParam("itemName") String itemName,
			@RequestParam("description") String description, @RequestParam("category") String category,
			@RequestParam("price") String price) {
		int itemid = Integer.parseInt(itemId);
		Item item = itemService.getItemById(itemid);
		item.setItemName(itemName);
		item.setDescription(description);
		item.setCategory(category);
		item.setPrice(Float.parseFloat(price));
		itemService.upadteItem(item);
		return "redirect:/ViewItem";
	}
}
