package com.pos.springdemo.dao.impl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.pos.springdemo.dao.CustomerDAO;
import com.pos.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Customer> theQuery=
				currentSession.createQuery("from Customer", Customer.class);
		
		List<Customer> customers = theQuery.getResultList();
			
	
	return customers;
	}

	@Override
	public void saveCustomer(Customer C) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(C);
	}

	@Override
	public void updateCustomer(Customer C) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(C);
	}

	@Override
	public Customer getCustomer(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Customer.class, id);
	}

	@Override
	public List<Customer> searchCustomer(String name) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
				Query<Customer> theQuery =
						currentSession.createQuery("from Customer where name like '"+name+"%'", Customer.class);
						
		List<Customer> customers = theQuery.getResultList();
		
		
		return customers;
	}

	@Override
	public void deleteCustomer(Customer c) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(c);
	}

}
