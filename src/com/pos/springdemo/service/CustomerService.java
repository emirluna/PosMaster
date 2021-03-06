package com.pos.springdemo.service;

import java.util.List;

import com.pos.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer C);
	public void updateCustomer(Customer C);
	public Customer getCustomer(int id);
	public List<Customer> searchCustomer(String name);
	public void deleteCustomer(Customer c);
	
}
