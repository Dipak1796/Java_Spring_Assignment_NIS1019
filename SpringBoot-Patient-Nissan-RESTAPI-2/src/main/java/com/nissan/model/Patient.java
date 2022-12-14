package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblpatient")
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer patientId;
	private String patientName;
	private LocalDate dob;
	private String gender;
	@Column(nullable=false)
	private String PhoneNo;
	private String address;
	/*
	@JoinColumn(name="addressId",insertable=false,updatable=false)
	@OneToOne
	private Address address;*/

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Integer patientId, String patientName, LocalDate dob, String gender, String phoneNo,
			String address) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.dob = dob;
		this.gender = gender;
		PhoneNo = phoneNo;
		this.address = address;
	}
	
	

	/*public Patient(Integer patientId, String patientName, LocalDate dob, String gender, String phoneNo,
			Address address) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.dob = dob;
		this.gender = gender;
		PhoneNo = phoneNo;
		this.address = address;
	}*/

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getAddress1() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/*public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", dob=" + dob + ", gender="
				+ gender + ", PhoneNo=" + PhoneNo + ", addressId=" + address + "]";
	}
	
	

}
