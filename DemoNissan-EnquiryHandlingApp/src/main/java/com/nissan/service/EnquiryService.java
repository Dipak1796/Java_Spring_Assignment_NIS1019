package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IEnquiryDAO;
import com.nissan.model.Enquiry;
@Service
public class EnquiryService implements IEnquiryService {

	@Autowired
	IEnquiryDAO enquirydao;
	@Override
	public Enquiry addEnquiry(Enquiry enquiry) {
		
		return enquirydao.save(enquiry);
	}

	@Override
	public List<Enquiry> getAllEnquiry() {
		
		return enquirydao.findAll() ;
	}

	@Override
	public Enquiry getByEnquiryId(Integer id) {
		
		return enquirydao.findById(id).get();
	}

}
