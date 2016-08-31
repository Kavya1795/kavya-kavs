package com.shopmusic.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopmusic.model.Customer;
import com.shopmusic.model.Item;
import com.shopmusic.model.UserRole;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	
@Autowired
SessionFactory sessionFactory;
public void addCustomer(Customer customer) {
	Session session=sessionFactory.getCurrentSession();
	Transaction transaction=session.beginTransaction();
	
	UserRole userRole=new UserRole();
	customer.setEnabled(true);
     session.save(customer);
	userRole.setAuthority("ROLE_USER");
	userRole.setId(customer.getCustomerId());
	session.save(userRole);
	transaction.commit();
	System.out.println("Done the saving customer");
}

public List<Customer> viewCustomer() {
	Session session=sessionFactory.getCurrentSession();
	Transaction transaction=session.beginTransaction();
	List<Customer> list=session.createCriteria(Customer.class).list();
	return list;
}



	
	
}

