package com.pos.springdemo.service;

import java.util.List;

import com.pos.springdemo.entity.Address;

public interface AddressService {

	public void saveAddress(Address A);
	public Address getAddressId(int id);
	public void upadteAddress(Address A);
	public void deleteAddress(Address A);
	
}
