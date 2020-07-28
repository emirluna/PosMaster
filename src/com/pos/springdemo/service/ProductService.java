package com.pos.springdemo.service;

import java.util.List;

import com.pos.springdemo.entity.Product;

public interface ProductService {

	public List<Product> getProducts(int id);
	public void saveProduct(Product p);
	public void updateProduct(Product p);
	public Product getProduct(int id);
	public List<Product> searchProduct(String name);
	public void deleteProduct(Product p);

}
