package com.pos.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Product> getProducts(int id) {

		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Product> theQuery=
				currentSession.createQuery("from Product where id_enterprise="+id, Product.class);
		
		List<Product> products = theQuery.getResultList();
		
		
		return products;
	}

	@Override
	public void saveProduct(Product p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(p);
		
	}

}
