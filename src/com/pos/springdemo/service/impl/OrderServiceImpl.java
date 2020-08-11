package com.pos.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.OrderDAO;
import com.pos.springdemo.entity.Order;
import com.pos.springdemo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO oDao;
	
	@Override
	@Transactional
	public List<Order> getOrders(int id) {
		return oDao.getOrders(id);
	}

	@Override
	@Transactional
	public void saveOrder(Order o) {
		oDao.saveOrder(o);
	}

	@Override
	@Transactional
	public void updateOrder(Order o) {
		oDao.updateOrder(o);
	}

	@Override
	@Transactional
	public Order getOrder(int id) {
		return oDao.getOrder(id);
	}

	@Override
	@Transactional
	public void deleteOrder(Order o) {
		oDao.deleteOrder(o);
	}

}
