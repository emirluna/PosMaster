package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Configuration;

public interface ConfigDAO {

	public List<Configuration> getConfigurations();
	public void saveConfiguration(Configuration C );
	public void updateConfiguration(Configuration C);
	public Configuration getConfiguration(int id);
	public Configuration searchConfiguration(String name);
	public void deleteConfiguration(int id);
	
	/*Templete for DAOs
	public List<> get(int id);
	public void save( );
	public void update();
	public <> get(int id);
	public <> search(String name);
	public void delete(int id);
	*/
}
