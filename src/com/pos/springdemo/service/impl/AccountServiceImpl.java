package com.pos.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.AccountDAO;
import com.pos.springdemo.entity.Account;
import com.pos.springdemo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDao;
	
	@Override
	@Transactional
	public List<Account> getAccounts() {
		return accountDao.getAccounts();
	}

	@Override
	@Transactional
	public void saveAccount(Account A) {
		accountDao.saveAccount(A);
	}

	@Override
	@Transactional
	public void updaAccount(Account c) {
		accountDao.updaAccount(c);
	}

	@Override
	@Transactional
	public Account getAccount(int id) {
		return accountDao.getAccount(id);
	}

	@Override
	@Transactional
	public Account searchAccount(String name) {
		return accountDao.searchAccount(name);
	}

	@Override
	@Transactional
	public void deleteAccount(Account a) {
		accountDao.deleteAccount(a);
	}

}
