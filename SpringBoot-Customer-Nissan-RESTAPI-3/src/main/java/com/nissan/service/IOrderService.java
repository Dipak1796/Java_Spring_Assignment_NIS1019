package com.nissan.service;

import java.util.List;

import com.nissan.model.Order;

public interface IOrderService {
	
	//get All List
	public List<Order> getAllOrder();
	
	//get by id
	public Order getById(Integer orderId);
	
	//add Order
	public Order addOrder(Order order);

}
