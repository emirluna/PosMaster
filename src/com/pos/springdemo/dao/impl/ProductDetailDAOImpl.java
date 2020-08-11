package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.ProductDetailDAO;
import com.pos.springdemo.entity.Product;
import com.pos.springdemo.entity.ProductDetail;

@Repository
public class ProductDetailDAOImpl implements ProductDetailDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveProductDetail(ProductDetail p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(p);
	}

	@Override
	public void updateProductDetail(ProductDetail p) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(p);
	}

	@Override
	public ProductDetail getProductDetail(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(ProductDetail.class, id);
	}

	@Override
	public List<ProductDetail> searchProductDetail(String name) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<ProductDetail> theQuery =
				currentSession.createQuery("from ProductDetail where brand like '"+name+"%'", ProductDetail.class);
		
		List<ProductDetail> products = theQuery.getResultList();
		
		
		return products;
	}

	@Override
	public void deleteProductDetail(ProductDetail pd) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(pd);
	}

}
