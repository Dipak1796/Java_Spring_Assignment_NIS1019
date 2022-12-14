package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;
import com.nissan.service.ICustomerService;

@RestController
@RequestMapping("api/")
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	@GetMapping("customers")
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
	}
	
	@GetMapping("customers/{_custNo}")
	public Customer getByCustNo(@PathVariable Integer _custNo) {
		return customerService.getByCustNo(_custNo);
	}
	
	@PostMapping("customers")
	public Customer addCustomer(@RequestBody Customer _customer) {
		return customerService.addCustomer(_customer);
	}

}
