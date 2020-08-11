package com.pos.springdemo.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pos.springdemo.dao.ProductDetailDAO;
import com.pos.springdemo.entity.ProductDetail;
import com.pos.springdemo.service.ProductDetailService;

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

	@Autowired
	private ProductDetailDAO PDDao;
	
	@Override
	@Transactional
	public void saveProductDetail(ProductDetail p) {
		PDDao.saveProductDetail(p);
	}

	@Override
	@Transactional
	public void updateProductDetail(ProductDetail p) {
		PDDao.updateProductDetail(p);
	}

	@Override
	@Transactional
	public ProductDetail getProductDetail(int id) {
		return PDDao.getProductDetail(id);
	}

	@Override
	@Transactional
	public List<ProductDetail> searchProductDetail(String name) {
		return PDDao.searchProductDetail(name);
	}

	@Override
	@Transactional
	public void deleteProductDetail(ProductDetail pd) {
		PDDao.deleteProductDetail(pd);
	}

}
