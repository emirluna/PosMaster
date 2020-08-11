package com.pos.springdemo.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.CustomerDetailDAO;
import com.pos.springdemo.entity.CustomerDetail;
import com.pos.springdemo.entity.Users;

@Repository
public class CustomerDetailDAOImpl implements CustomerDetailDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Override
	public void saveCustomerDetail(CustomerDetail CD) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(CD);
	}

	@Override
	public void updateCustomerDetail(CustomerDetail CD) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(CD);
	}

	@Override
	public CustomerDetail getCustomerDetail(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(CustomerDetail.class, id);
	}

	@Override
	public CustomerDetail searchCustomerDetail(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomerDetail(CustomerDetail cd) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(cd);
	}

}
