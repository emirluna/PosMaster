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
	public List<Configuration> getConfigurations() {
		return configDao.getConfigurations();
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
	public Configuration getConfiguration(int id) {
		return configDao.getConfiguration(id);
	}

	@Override
	@Transactional
	public Configuration searchConfiguration(String name) {
		return configDao.searchConfiguration(name);
	}

	@Override
	@Transactional
	public void deleteConfiguration(int id) {
		configDao.deleteConfiguration(id);
	}

}
