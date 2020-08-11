package com.pos.springdemo.service;

import java.util.List;

import com.pos.springdemo.entity.Configuration;

public interface ConfigService {

	public Configuration getConfiguration(int id);
	public List<Configuration> getConfigurations();
	public void saveConfiguration(Configuration C );
	public void updateConfiguration(Configuration C);
	public void deleteConfiguration(Configuration C);
	
	/*Templete for DAOs
	public List<> get(int id);
	public void save( );
	public void update();
	public <> get(int id);
	public <> search(String name);
	public void delete(int id);
	*/
}
