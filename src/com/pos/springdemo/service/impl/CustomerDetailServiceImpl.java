package com.pos.springdemo.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.CustomerDetailDAO;
import com.pos.springdemo.entity.CustomerDetail;
import com.pos.springdemo.service.CustomerDetailService;

@Service
public class CustomerDetailServiceImpl implements CustomerDetailService{

	@Autowired
	private CustomerDetailDAO CDDao;
	
	@Override
	@Transactional
	public void saveCustomerDetail(CustomerDetail CD) {
		CDDao.saveCustomerDetail(CD);
	}

	@Override
	@Transactional
	public void updateCustomerDetail(CustomerDetail CD) {
		CDDao.updateCustomerDetail(CD);
	}

	@Override
	@Transactional
	public CustomerDetail getCustomerDetail(int id) {
		return CDDao.getCustomerDetail(id);
	}

	@Override
	@Transactional
	public CustomerDetail searchCustomerDetail(String name) {
		return CDDao.searchCustomerDetail(name);
	}

	@Override
	@Transactional
	public void deleteCustomerDetail(CustomerDetail cd) {
		CDDao.deleteCustomerDetail(cd);
	}

}
