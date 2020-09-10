package com.pos.springdemo.service.impl;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.SaleDAO;
import com.pos.springdemo.entity.Sale;
import com.pos.springdemo.service.SaleService;

@Service
public class SaleServiceImpl implements SaleService {

	@Autowired
	private SaleDAO sDao;
	
	@Override
	@Transactional
	public List<Sale> getSales() {
		return sDao.getSales();
	}

	@Override
	@Transactional
	public List<Sale> getSalesByDate(Date d) {
		return sDao.getSalesByDate(d);
	}

	@Override
	@Transactional
	public List<Sale> getSalesByBranch(int branchId) {
		return sDao.getSalesByBranch(branchId);
	}

	@Override
	@Transactional
	public List<Sale> getSalesByUser(int userId) {
		return sDao.getSalesByUser(userId);
	}

	@Override
	@Transactional
	public List<Sale> getSalesByCustomer(int customerID) {
		return sDao.getSalesByCustomer(customerID);
	}

	@Override
	@Transactional
	public void saveSale(Sale s) {
		sDao.saveSale(s);
	}

	@Override
	@Transactional
	public void updateSale(Sale s) {
		sDao.updateSale(s);
	}

	@Override
	@Transactional
	public Sale getSale(int id) {
		return sDao.getSale(id);
	}

	@Override
	@Transactional
	public void deleteSale(Sale s) {
		sDao.deleteSale(s);
	}

}
