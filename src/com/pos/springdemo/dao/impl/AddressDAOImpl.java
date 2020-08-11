package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.AddressDAO;
import com.pos.springdemo.entity.Address;
import com.pos.springdemo.entity.Branch;

@Repository
public class AddressDAOImpl implements AddressDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	/*
	@Override
	public List<Address> getEnterpriseAddress(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Address> theQuery=
				currentSession.createQuery("from Address where id="+id, Address.class);
		
		List<Address> address = theQuery.getResultList();
		
		
		return address;
	}
*/

	@Override
	public void saveAddress(Address A) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(A);
	}

	@Override
	public Address getAddressId(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.get(Address.class, id);
		
		return null;
	}

	@Override
	public void upadteAddress(Address A) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(A);
	}

	@Override
	public void deleteAddress(Address A) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(A);
	}

}
