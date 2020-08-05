package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Product;

public interface ProductDAO {

	public List<Product> getProducts();
	public void saveProduct(Product p);
	public void updateProduct(Product p);
	public Product getProduct(int id);
	public List<Product> searchProduct(String name);
	public void deleteProduct(Product p);

}
