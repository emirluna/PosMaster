package com.pos.springdemo.dao;

import java.sql.Date;
import java.util.List;

import com.pos.springdemo.entity.Sale;

public interface SaleDAO {
	
	public List<Sale> getSales();
	public List<Sale> getSalesByDate(Date d);
	public List<Sale> getSalesByBranch(int branchId);
	public List<Sale> getSalesByUser(int userId);
	public List<Sale> getSalesByCustomer(int customerID);
	public void saveSale(Sale s);
	public void updateSale(Sale s);
	public Sale getSale(int id);
	public void deleteSale(int id);
}
