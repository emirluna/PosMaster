package com.pos.springdemo.service;

import java.util.List;

import com.pos.springdemo.entity.Product;

public interface ProductService {
	
	public List<Product> getProducts(int id);
	public void saveProduct(Product p);

}
