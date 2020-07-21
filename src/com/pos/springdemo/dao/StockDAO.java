package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Stock;

public interface StockDAO {

	public List<Stock> getStocks(int s);
	
}
