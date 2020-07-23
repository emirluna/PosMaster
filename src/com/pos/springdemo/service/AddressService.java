package com.pos.springdemo.service;

import java.util.List;

import com.pos.springdemo.entity.Address;

public interface AddressService {

	public List<Address> getEnterpriseAddress(int id);
	public void saveAddress(Address A);
	public Address getAddressId(int id);
	
}
