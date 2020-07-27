package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.OrderDAO;
import com.pos.springdemo.entity.Order;

@Repository
public class OrderDAOImpl implements OrderDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Order> getOrders(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Order> theQuery=
				currentSession.createQuery("from Order where Branch="+id, Order.class);
		
		List<Order> orders = theQuery.getResultList();
			
	
	return orders;
	}

	@Override
	public void saveOrder(Order o) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(o);
	}

	@Override
	public void updateOrder(Order o) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(o);
	}

	@Override
	public Order getOrder(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Order.class, id);
	
	}

	@Override
	public void deleteOrder(Order o) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(o);
	}

}
