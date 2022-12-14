package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblcustomer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer custNo;
	private String customerName;
	private String address;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(Integer custNo, String customerName, String address) {
		super();
		this.custNo = custNo;
		this.customerName = customerName;
		this.address = address;
	}


	public Integer getCustNo() {
		return custNo;
	}


	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", customerName=" + customerName + ", address=" + address + "]";
	}
	
	

}
