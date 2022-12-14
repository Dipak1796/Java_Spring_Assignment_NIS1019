package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.ICustomerDAO;
import com.nissan.model.Customer;

@Service
public class CustomerService implements ICustomerService {

	@Autowired
	ICustomerDAO customerdao;
	
	@Override
	public List<Customer> getAllCustomer() {
		
		return customerdao.findAll();
	}

	@Override
	public Customer getByCustNo(Integer _custNo) {
		Customer customer=customerdao.findById(_custNo).get();
		return customer;
	}

	@Override
	@Transactional
	public Customer addCustomer(Customer customer) {
		return customerdao.save(customer);
	}

}
