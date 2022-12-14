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
@Table(name="tblorder")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	private Integer custNo;
	private LocalDate orderDate;
	@JoinColumn(name="custNo",insertable=false,updatable=false)
	@ManyToOne
	private Customer customer;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Order(Integer orderId, Integer custNo, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.custNo = custNo;
		this.orderDate = orderDate;
	}


	public Order(Integer orderId, LocalDate orderDate, Customer customer) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customer = customer;
	}


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}


	public Integer getCustNo() {
		return custNo;
	}


	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}


	public LocalDate getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", custNo=" + custNo + ", orderDate=" + orderDate + ", customer="
				+ customer + "]";
	}
	
	
	
	
	
	

}
