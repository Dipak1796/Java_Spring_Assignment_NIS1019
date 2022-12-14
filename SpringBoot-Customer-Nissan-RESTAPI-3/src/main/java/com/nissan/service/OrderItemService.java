package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IOrderItemDAO;
import com.nissan.model.OrderItem;
@Service
public class OrderItemService implements IOrderItemService {

	@Autowired
	IOrderItemDAO orderitemdao;
	
	@Override
	public List<OrderItem> getAllOrderItem() {
		
		return orderitemdao.findAll();
	}

	@Override
	public OrderItem getOrderItemById(Integer itemId) {
		
		return orderitemdao.findById(itemId).get();
	}

	@Override
	@Transactional
	public OrderItem addOrderItem(OrderItem orderItem) {
		
		return orderitemdao.save(orderItem);
	}

}
