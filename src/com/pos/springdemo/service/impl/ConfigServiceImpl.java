package com.pos.springdemo.service.impl;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.ConfigDAO;
import com.pos.springdemo.entity.Configuration;
import com.pos.springdemo.service.ConfigService;

@Service
public class ConfigServiceImpl implements ConfigService {

	@Autowired
	private ConfigDAO configDao;
	
	@Override
	@Transactional
	public Configuration getConfiguration(int id) {
		return configDao.getConfiguration(id);
	}

	@Override
	@Transactional
	public void saveConfiguration(Configuration C) {
		configDao.saveConfiguration(C);
	}

	@Override
	@Transactional
	public void updateConfiguration(Configuration C) {
		configDao.updateConfiguration(C);
	}

	
	@Override
	@Transactional
	public void deleteConfiguration(Configuration C) {
		configDao.deleteConfiguration(C);
	}



	@Override
	@Transactional
	public List<Configuration> getConfigurations() {
	return configDao.getConfigurations();	
	}

}
