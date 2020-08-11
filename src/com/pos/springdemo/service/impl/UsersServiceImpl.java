package com.pos.springdemo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pos.springdemo.dao.UsersDAO;
import com.pos.springdemo.entity.Users;
import com.pos.springdemo.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDAO uDao;
	
	@Override
	@Transactional
	public List<Users> getUsers(int id) {
		return uDao.getUsers(id);
	}

	@Override
	@Transactional
	public void saveUsers(Users U) {
		uDao.saveUsers(U);
	}

	@Override
	@Transactional
	public void updateUsers(Users U) {
		uDao.updateUsers(U);
	}

	@Override
	@Transactional
	public Users getUser(int id) {
		return uDao.getUser(id);
	}

	@Override
	@Transactional
	public List<Users> searchUsers(String name) {
		return uDao.searchUsers(name);
	}

	@Override
	@Transactional
	public void deleteUsers(Users u) {
		uDao.deleteUsers(u);
	}

}
