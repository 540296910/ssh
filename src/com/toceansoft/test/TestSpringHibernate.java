package com.toceansoft.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.toceansoft.entity.User;
import com.toceansoft.service.IUserService;

public class TestSpringHibernate {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IUserService userDao = (IUserService)ac.getBean("userService");
		
		User u = new User();
		u.setUsername("maolei");
		u.setPassword("456123");
		u.setAge("20");
		List<User> li=userDao.login(u.getUsername());
		if(!li.isEmpty()){
			for(int i=0;i<li.size();i++){
				System.out.println(li.get(i).getUsername());
				System.out.println(li.get(i).getPassword());
				
			}
		}
	}
}
