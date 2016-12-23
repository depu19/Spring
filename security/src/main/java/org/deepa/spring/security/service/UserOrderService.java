package org.deepa.spring.security.service;

import java.util.List;

import org.deepa.spring.model.Order;

public interface UserOrderService {
	
	public void placeUserOrder(Order order);
	
	public List<Order> getAllOrders();
	

}
