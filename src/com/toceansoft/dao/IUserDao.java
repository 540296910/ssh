package com.toceansoft.dao;

import java.util.List;

import com.toceansoft.entity.User;

public interface IUserDao {

	public void userAdd(User user);
	public List<User> findbyname(String name);
	
}
