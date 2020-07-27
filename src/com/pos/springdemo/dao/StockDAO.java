package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Category;
import com.pos.springdemo.entity.Stock;

public interface StockDAO {

	public List<Stock> getStocks(int branch_id);
	public void saveStock(Stock s);
	public void updateStock(Stock s);
	public Stock getStock(int id);
	public void deleteStock(int id);
	
}
