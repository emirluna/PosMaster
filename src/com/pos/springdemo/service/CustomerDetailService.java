package com.pos.springdemo.service;

import java.util.List;

import com.pos.springdemo.entity.CustomerDetail;

public interface CustomerDetailService {

	public void saveCustomerDetail(CustomerDetail CD);
	public void updateCustomerDetail(CustomerDetail CD);
	public CustomerDetail getCustomerDetail(int id);
	public CustomerDetail searchCustomerDetail(String name);
	public void deleteCustomerDetail(CustomerDetail cd);
	
}
