package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="tblcustomer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer custNo;
	private String customerName;
	private String address;
	private Boolean isActive;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
	private List<Order> orderList;	
	
	


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(Integer custNo, String customerName, String address,Boolean isActive) {
		super();
		this.custNo = custNo;
		this.customerName = customerName;
		this.address = address;
		this.isActive=isActive;
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
	
	public Boolean getIsActive() {
		return isActive;
	}


	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	@JsonManagedReference
	public List<Order> getOrderList() {
		return orderList;
	}


	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}


	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", customerName=" + customerName + ", address=" + address + "isActive="+isActive+"]";
	}
	
	

}
