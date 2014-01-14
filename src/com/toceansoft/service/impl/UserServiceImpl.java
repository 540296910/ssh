package com.toceansoft.service.impl;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
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

	public String add(User u) {
		List<User> li = (List<User>) userDao.findbyname(u.getUsername());
		
		if (!li.isEmpty()) {
			//	HttpSession session =null; 
					return "input";
				
			} else {
				userDao.userAdd(u);
				return "success";
			}
		
	}
	public List<User> login(String name){
		return userDao.findbyname(name);
	}

}
