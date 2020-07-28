package com.pos.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.CustomerDAO;
import com.pos.springdemo.entity.Customer;
import com.pos.springdemo.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO CDao;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return CDao.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer C) {
		CDao.saveCustomer(C);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer C) {
		CDao.updateCustomer(C);
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		return CDao.getCustomer(id);
	}

	@Override
	@Transactional
	public List<Customer> searchCustomer(String name) {
		return CDao.searchCustomer(name);
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer c) {
		CDao.deleteCustomer(c);
	}

}
