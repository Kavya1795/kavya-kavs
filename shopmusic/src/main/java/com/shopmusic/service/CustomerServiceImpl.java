package com.shopmusic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.shopmusic.dao.CustomerDao;
import com.shopmusic.model.Customer;

@Service

public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerDao customerDao;
	public void addCustomer(Customer customer)
	{
		customerDao.addCustomer(customer);
	}
	public List<Customer> viewCustomer() {
		List<Customer> list=customerDao.viewCustomer();
		return list;
	}
}