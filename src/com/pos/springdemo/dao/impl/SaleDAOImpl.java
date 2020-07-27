package com.pos.springdemo.dao.impl;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.SaleDAO;
import com.pos.springdemo.entity.Enterprise;
import com.pos.springdemo.entity.Sale;

@Repository
public class SaleDAOImpl implements SaleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Sale> getSales() {
	
		Session currentSession = sessionFactory.getCurrentSession(); 
		
			Query<Sale> theQuery=
					currentSession.createQuery("from Sale", Sale.class);
			
			List<Sale> sales = theQuery.getResultList();
				
		
		return sales;
	}

	@Override
	public List<Sale> getSalesByDate(Date d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sale> getSalesByBranch(int branchId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sale> getSalesByUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sale> getSalesByCustomer(int customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveSale(Sale s) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(s);
	}

	@Override
	public void updateSale(Sale s) {
		
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(s);
	}

	@Override
	public Sale getSale(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Sale.class, id);
	
	}

	@Override
	public void deleteSale(Sale s) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(s);
	}

}
