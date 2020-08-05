package com.pos.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.ProductDAO;
import com.pos.springdemo.entity.Product;
import com.pos.springdemo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	
	@Override
	@Transactional
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}

	@Override
	@Transactional
	public void saveProduct(Product p) {
		productDAO.saveProduct(p);
	}

	@Override
	@Transactional
	public void updateProduct(Product p) {
		productDAO.updateProduct(p);
	}

	@Override
	@Transactional
	public Product getProduct(int id) {
		return productDAO.getProduct(id);
	}

	@Override
	@Transactional
	public List<Product> searchProduct(String name) {
		return productDAO.searchProduct(name);
	}

	@Override
	@Transactional
	public void deleteProduct(Product p) {
		productDAO.deleteProduct(p);
	}

}
