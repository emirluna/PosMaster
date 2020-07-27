package com.pos.springdemo.dao;

import java.util.List;

import com.pos.springdemo.entity.Users;

public interface UsersDAO {

	public List<Users> getUsers(int id);
	public void saveUsers(Users U);
	public void updateUsers(Users U);
	public Users getUser(int id);
	public List<Users> searchUsers(String name);
	public void deleteUsers(Users u);
	
}
