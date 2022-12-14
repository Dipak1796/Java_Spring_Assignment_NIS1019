package com.nissan.service;

import java.util.List;

import com.nissan.model.OrderItem;

public interface IOrderItemService {
	
	//get All List
	public List<OrderItem> getAllOrderItem();

	//GET BY ID
	public OrderItem getOrderItemById(Integer itemId);
	
	//save OrderItem
	public OrderItem addOrderItem(OrderItem orderItem);

}
