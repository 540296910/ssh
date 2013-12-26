package com.toceansoft.test;


import com.toceansoft.dao.IUserDao;
import com.toceansoft.dao.impl.UserDaoImpl;
import com.toceansoft.entity.User;

public class TestUserSave {
	
	public static void main(String[] args) {
		IUserDao userDao = new UserDaoImpl();
		User u = new User();
		u.setUsername("Spring_");
		u.setPassword("456123");
		userDao.userAdd(u);
	}
}
