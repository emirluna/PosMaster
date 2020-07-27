package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Address;

public interface AddressDAO {

	public void saveAddress(Address A);
	public Address getAddressId(int id);
	public void upadteAddress(Address A);
	public void deleteAddress(Address A);
	
}
