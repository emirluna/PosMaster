package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.StockDAO;
import com.pos.springdemo.entity.Stock;

@Repository
public class StockDAOImpl implements StockDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Stock> getStocks(int s) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Stock> theQuery=
				currentSession.createQuery("from Stock where branch_id="+s, Stock.class);
		
		List<Stock> stocks = theQuery.getResultList();		
		
		return stocks;
	}


	@Override
	public void saveStock(Stock s) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.save(s);
	}


	@Override
	public void updateStock(Stock s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Stock getStock(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteStock(int id) {
		// TODO Auto-generated method stub
		
	}

}
