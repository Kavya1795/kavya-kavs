package com.shopmusic.dao;

import java.util.List;

import com.shopmusic.model.Customer;

public interface CustomerDao {
	void addCustomer(Customer customer); 
	List<Customer> viewCustomer();
	
	
}
