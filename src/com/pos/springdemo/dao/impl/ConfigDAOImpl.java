package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.ConfigDAO;
import com.pos.springdemo.entity.Configuration;

@Repository
public class ConfigDAOImpl implements ConfigDAO {

	@Override
	public List<Configuration> getConfigurations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveConfiguration(Configuration C) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateConfiguration(Configuration C) {
		// TODO Auto-generated method stub

	}

	@Override
	public Configuration getConfiguration(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Configuration searchConfiguration(String name) {
		// TODO Auto-generated method stub
		/**Templete for serarch
Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<> theQuery =
						currentSession.createQuery("from  where name like '"+name+"%'", .class);
		
		List<>  = theQuery.getResultList();
		
		
		return ;**/
		
		return null;
	}

	@Override
	public void deleteConfiguration(int id) {
		// TODO Auto-generated method stub

	}

}
