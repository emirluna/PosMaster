package com.pos.springdemo.service.impl;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pos.springdemo.dao.AddressDAO;
import com.pos.springdemo.entity.Address;
import com.pos.springdemo.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDAO addressDAO;
	
	
	@Override
	@Transactional
	public void saveAddress(Address A) {
		addressDAO.saveAddress(A);
	}

	@Override
	@Transactional
	public Address getAddressId(int id) {
		return addressDAO.getAddressId(id);
	}

	@Override
	@Transactional
	public void upadteAddress(Address A) {
		addressDAO.upadteAddress(A);
	}

	@Override
	@Transactional
	public void deleteAddress(Address A) {
		addressDAO.deleteAddress(A);
	}

}
