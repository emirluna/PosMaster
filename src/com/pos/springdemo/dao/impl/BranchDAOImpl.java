package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.BranchDAO;
import com.pos.springdemo.entity.Branch;
import com.pos.springdemo.entity.Enterprise;

@Repository
public class BranchDAOImpl implements BranchDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Branch> getBranches() {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Branch> theQuery=
				currentSession.createQuery("from Branch", Branch.class);
		
		List<Branch> branches = theQuery.getResultList();
		
		return branches;
	}


	@Override
	public void saveBranch(Branch B) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(B);
	}




	@Override
	public void updateBranch(Branch B) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(B);
	
	}


	@Override
	public void deleteBrnahc(Branch B) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(B);
		
	}


	@Override
	public Branch getBranch(int b) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Branch.class, b);

	}

}








