package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Account;

public interface AccountDAO {

	public List<Account> getAccounts();
	public void saveAccount(Account A);
	public void updaAccount(Account c);
	public Account getAccount(int id);
	public Account searchAccount(String name);
	public void deleteAccount(int id);
	
}
