package com.pos.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.ProductDAO;
import com.pos.springdemo.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	
	@Override
	@Transactional
	public List<Product> getProducts(int id) {
		return productDAO.getProducts(id);
	}

	@Override
	@Transactional
	public void saveProduct(Product p) {
		productDAO.saveProduct(p);
	}

}
