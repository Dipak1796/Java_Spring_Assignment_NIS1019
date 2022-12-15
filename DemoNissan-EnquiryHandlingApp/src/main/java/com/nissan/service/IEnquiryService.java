package com.nissan.service;

import java.util.List;

import com.nissan.model.Enquiry;

public interface IEnquiryService {
	
	//add enquiry
	public Enquiry addEnquiry(Enquiry enquiry);
	
	//get All Enquiry
	public List<Enquiry> getAllEnquiry();
	
	//get By EnquiryId
	public Enquiry getByEnquiryId(Integer id);

}
