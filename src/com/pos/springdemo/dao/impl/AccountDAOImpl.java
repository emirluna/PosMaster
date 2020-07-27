package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.AccountDAO;
import com.pos.springdemo.entity.Account;
import com.pos.springdemo.entity.Users;

@Repository
public class AccountDAOImpl implements AccountDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Account> getAccounts() {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Account> theQuery=
				currentSession.createQuery("from Account", Account.class);
		
		List<Account> accounts = theQuery.getResultList();
			
	
	return accounts;
	}

	@Override
	public void saveAccount(Account A) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(A);
	}

	@Override
	public void updaAccount(Account c) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(c);
	}

	@Override
	public Account getAccount(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Account.class, id);
	}

	@Override
	public Account searchAccount(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(Account a) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(a);
	}

}
