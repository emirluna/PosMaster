package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Order;

public interface OrderDAO {

	public List<Order> getOrders(int id);
	public void saveOrder(Order o);
	public void updateOrder(Order o);
	public Order getOrder(int id);
	public void deleteOrder(Order o);
	
}
