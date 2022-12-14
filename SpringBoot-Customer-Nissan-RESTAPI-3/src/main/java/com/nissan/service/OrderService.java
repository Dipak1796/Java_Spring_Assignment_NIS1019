package com.nissan.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IOrderDAO;
import com.nissan.model.Order;

@Service
public class OrderService implements IOrderService {

	@Autowired
	IOrderDAO orderdao;
	
	@Override
	public List<Order> getAllOrder() {
		
		return orderdao.findAll();
	}

	@Override
	public Order getById(Integer orderId) {
		return orderdao.findById(orderId).get();
	}

	@Override
	@Transactional
	public Order addOrder(Order order) {
		return orderdao.save(order);
	}

}
