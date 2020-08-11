package com.pos.springdemo.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pos.springdemo.dao.ConfigDAO;
import com.pos.springdemo.entity.Configuration;
import com.pos.springdemo.entity.Product;

@Repository
public class ConfigDAOImpl implements ConfigDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public Configuration getConfiguration(int id) {
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		return currentSession.get(Configuration.class, id);
	}

	@Override
	public void saveConfiguration(Configuration C) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(C);
	}

	@Override
	public void updateConfiguration(Configuration C) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(C);
	}



	@Override
	public void deleteConfiguration(Configuration C) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.delete(C);
	}

	@Override
	public List<Configuration> getConfigurations() {
		
		Session currentSession = sessionFactory.getCurrentSession(); 
		
		Query<Configuration> theQuery=
				currentSession.createQuery("from Configuration", Configuration.class);
		List<Configuration> confs = null;
		
		if (!theQuery.list().isEmpty()) {
			confs = theQuery.getResultList();
		}
		
		return confs;
	}

}
