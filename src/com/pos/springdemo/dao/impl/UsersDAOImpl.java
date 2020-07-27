package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.UsersDAO;
import com.pos.springdemo.entity.Category;
import com.pos.springdemo.entity.Enterprise;
import com.pos.springdemo.entity.Sale;
import com.pos.springdemo.entity.Users;

@Repository
public class UsersDAOImpl implements UsersDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Users> getUsers(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Users> theQuery=
				currentSession.createQuery("from Users", Users.class);
		
		List<Users> users = theQuery.getResultList();
			
	
	return users;
	}

	@Override
	public void saveUsers(Users U) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.save(U);
	}

	@Override
	public void updateUsers(Users U) {

		Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.saveOrUpdate(U);
	}

	@Override
	public Users getUser(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Users.class, id);
	}

	@Override
	public List<Users> searchUsers(String name) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Users> theQuery =
						currentSession.createQuery("from Users where name like '"+name+"%'", Users.class);

		List<Users> users= theQuery.getResultList();
		
		
		return users;
	}

	@Override
	public void deleteUsers(Users u) {
	Session currentSession = sessionFactory.getCurrentSession(); 
		
		currentSession.delete(u);
	}

}
