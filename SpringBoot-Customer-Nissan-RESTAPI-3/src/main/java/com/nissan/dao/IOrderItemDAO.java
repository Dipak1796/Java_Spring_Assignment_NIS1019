package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.OrderItem;

@Repository
public interface IOrderItemDAO extends JpaRepositoryImplementation<OrderItem, Integer> {

}
