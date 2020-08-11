package com.pos.springdemo.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.ProductDAO;
import com.pos.springdemo.entity.Branch;
import com.pos.springdemo.entity.Category;
import com.pos.springdemo.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Product> getProducts() {

		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Product> theQuery=
				currentSession.createQuery("from Product", Product.class);
		List<Product> products = null;
		
		if (!theQuery.getResultList().isEmpty()) {
			products = theQuery.getResultList();
		}
		
		return products;
	}

	@Override
	public void saveProduct(Product p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(p);
		
	}

	@Override
	public void updateProduct(Product p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(p);
	}

	@Override
	public Product getProduct(int id) {
		
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Product.class, id);
		
	}

	@Override
	public List<Product> searchProduct(String name) {
		
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Product> theQuery =
				currentSession.createQuery("from Product where name like '"+name+"%'", Product.class);
		
		List<Product> products = theQuery.getResultList();
		
		
		return products;
	}

	@Override
	public void deleteProduct(Product p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(p);
	}

}
