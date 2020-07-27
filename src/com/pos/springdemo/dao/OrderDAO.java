package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Order;

public interface OrderDAO {

	public List<Order> getOrders(int id);
	public void saveOrder( );
	public void updateOrder();
	public Order getOrder(int id);
	public Order searchOrder(String name);
	public void deleteOrder(int id);
	
}
