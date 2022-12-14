package com.nissan.service;

import java.util.List;

import com.nissan.model.Customer;

public interface ICustomerService {
	
	//get All Customer
	public List<Customer> getAllCustomer();
	
	//get Customer By Id
	public Customer getByCustNo(Integer _custNo);
	
	//Customer save
	public Customer addCustomer(Customer customer);
}
