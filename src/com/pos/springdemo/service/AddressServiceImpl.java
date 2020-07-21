package com.pos.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.AddressDAO;
import com.pos.springdemo.entity.Address;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDAO addressDAO;
	
	@Override
	@Transactional
	public List<Address> getEnterpriseAddress(int id) {
		return addressDAO.getEnterpriseAddress(id);
	}

	@Override
	@Transactional
	public void saveAddress(Address A) {
		addressDAO.saveAddress(A);
	}

	@Override
	public Address getAddressId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
