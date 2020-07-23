package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Product;

public interface ProductDAO {

	public List<Product> getProducts(int id);
	public void saveProduct(Product p);
}
