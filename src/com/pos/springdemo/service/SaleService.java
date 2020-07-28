package com.pos.springdemo.service;

import java.sql.Date;
import java.util.List;

import com.pos.springdemo.entity.Sale;

public interface SaleService {
	
	public List<Sale> getSales();
	public List<Sale> getSalesByDate(Date d);
	public List<Sale> getSalesByBranch(int branchId);
	public List<Sale> getSalesByUser(int userId);
	public List<Sale> getSalesByCustomer(int customerID);
	public void saveSale(Sale s);
	public void updateSale(Sale s);
	public Sale getSale(int id);
	public void deleteSale(Sale s);
}
