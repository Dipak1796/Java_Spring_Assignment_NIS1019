package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblorderitem")
public class OrderItem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer itemId;
	private Integer orderId;
	private String itemName;
	private Integer quantity;
	@JoinColumn(name="orderId",insertable=false,updatable=false)
	@ManyToOne
	private Order order;
	
	
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderItem(Integer itemId, Integer orderId, String itemName, Integer quantity) {
		super();
		this.itemId = itemId;
		this.orderId = orderId;
		this.itemName = itemName;
		this.quantity = quantity;
	}


	public OrderItem(Integer itemId, String itemName, Integer quantity, Order order) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.order = order;
	}


	public Integer getItemId() {
		return itemId;
	}


	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}


	public Integer getOrderId() {
		return orderId;
	}


	public void setOrderNo(Integer orderId) {
		this.orderId = orderId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "OrderItem [itemId=" + itemId + ", orderNo=" + orderId + ", itemName=" + itemName + ", quantity="
				+ quantity + ", order=" + order + "]";
	}
	
	
	

}
