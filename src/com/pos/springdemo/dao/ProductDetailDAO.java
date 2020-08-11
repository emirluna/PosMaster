package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.ProductDetail;

public interface ProductDetailDAO {

	public void saveProductDetail(ProductDetail p);
	public void updateProductDetail(ProductDetail p);
	public ProductDetail getProductDetail(int id);
	public List<ProductDetail> searchProductDetail(String name);
	public void deleteProductDetail(ProductDetail pd);

}
