package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.PaymentDAO;
import com.pos.springdemo.entity.Payment;

@Repository
public class PaymentDAOImpl implements PaymentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Payment> getPaymentsBranch(int branchId) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
			Query<Payment> theQuery=
					currentSession.createQuery("from Payment where branch_id ="+branchId , Payment.class);
			
			
			List<Payment> payments = theQuery.getResultList();
				
		
		return payments;
	}

	@Override
	public List<Payment> getPaymentsStatus(int status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getPaymentsCustomer(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePayment(Payment p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(p);
	}

	@Override
	public void updatePayment(Payment p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(p);
	}

	@Override
	public Payment getPayment(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Payment.class, id);
	
	}

	@Override
	public Payment searchPayment(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePayment(Payment p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(p);
	}

}
