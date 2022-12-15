package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Enquiry;
import com.nissan.service.IEnquiryService;

@RestController
@RequestMapping("api/")
public class EnquiryController {
	
	@Autowired
	IEnquiryService enquiryService;
	
	@GetMapping("enquiries")
	public List<Enquiry> getAllEnquiry(){
		return enquiryService.getAllEnquiry();
	}
	
	@GetMapping("enquiries/{_enquiryId}")
	public Enquiry getByEnquiryId(@PathVariable Integer _enquiryId) {
		return enquiryService.getByEnquiryId(_enquiryId);
	}
	
	@PostMapping("enquiries")
	public Enquiry addEnquiry(@RequestBody Enquiry enquiry) {
		return enquiryService.addEnquiry(enquiry);
	}

}
