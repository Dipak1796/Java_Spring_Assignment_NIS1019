package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblenquiry")
public class Enquiry {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer enquiryId;
	private String candidateName;
	private String address;
	private String email;
	private String phoneNo;
	private LocalDate dob;
	private LocalDate enquiryDate;
	private Integer eligibilityId;
	@JoinColumn(name="eligibilityId",insertable=false,updatable=false)
	@ManyToOne
	private Eligibility eligibility;
	
	private Integer courseId;
	@JoinColumn(name="courseId",insertable=false,updatable=false)
	@ManyToOne
	private Course course;
	
	
	
	
	public Integer getEnquiryId() {
		return enquiryId;
	}
	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getEnquiryDate() {
		return enquiryDate;
	}
	public void setEnquiryDate(LocalDate enquiryDate) {
		this.enquiryDate = enquiryDate;
	}
	public Integer getEligibilityId() {
		return eligibilityId;
	}
	public void setEligibilityId(Integer eligibilityId) {
		this.eligibilityId = eligibilityId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	
	
	

}
