package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.CategoryDAO;
import com.pos.springdemo.entity.Branch;
import com.pos.springdemo.entity.Category;
import com.pos.springdemo.entity.Configuration;

@Repository
public class CategoryDAOImpl implements CategoryDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Category> getCategories() {
		
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		//create a query
		Query<Category> theQuery =
		currentSession.createQuery("from Category", Category.class);

		List<Category> categories = null;
		
		if (!theQuery.list().isEmpty()) {
			categories = theQuery.getResultList();
		}
		
		return categories;
	}


	@Override
	public void saveCategory(Category c) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(c);
		
	}


	@Override
	public void updateCategory(Category c) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(c);
	}


	@Override
	public Category getCategory(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Category.class, id);

	}


	@Override
	public List<Category> searchCategory(String name) {

		Session currentSession = sessionFactory.getCurrentSession(); 
		
		//create a query
				Query<Category> theQuery =
						currentSession.createQuery("from Category where name like '"+name+"%'", Category.class);
						//createQuery("from Customer", Customer.class);
				
				//execute query and get results
		List<Category> categories = theQuery.getResultList();
		
		
		return categories;
	}


	@Override
	public void deleteCategory(Category C) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(C);
	}

}
