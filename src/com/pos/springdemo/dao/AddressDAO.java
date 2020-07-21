package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Address;

public interface AddressDAO {

	public List<Address> getEnterpriseAddress(int id);
	public void saveAddress(Address A);
	public Address getAddressId(int id);
	
}
