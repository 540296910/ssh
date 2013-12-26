package com.toceansoft.service.impl;

import java.util.List;

import com.toceansoft.dao.IUserDao;
import com.toceansoft.entity.User;
import com.toceansoft.service.IUserService;

public class UserServiceImpl implements IUserService {
	
	private IUserDao userDao;	
	
	
	public UserServiceImpl() {
		super();
	}

	public IUserDao getUserDao() {
		return userDao;
	}
	
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public void add(User u) {
		userDao.userAdd(u);

	}
	public List<User> login(String name){
		return userDao.findbyname(name);
	}
}
