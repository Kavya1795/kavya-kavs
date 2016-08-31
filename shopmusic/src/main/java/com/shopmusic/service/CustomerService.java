package com.shopmusic.service;

import java.util.List;

import com.shopmusic.model.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	List<Customer> viewCustomer();
	

}
