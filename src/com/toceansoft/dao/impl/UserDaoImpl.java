package com.toceansoft.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.toceansoft.dao.IUserDao;
import com.toceansoft.entity.User;

public class UserDaoImpl implements IUserDao {
	
	private Logger log = Logger.getLogger(UserDaoImpl.class);
	private HibernateTemplate ht;
	//private SessionFactory sessionFactory;	
	
	/*public SessionFactory getSessionFactory() {
		return sessionFactory;
	}*/
	

	public void setMySessionFactory(SessionFactory mySessionFactory) {
		this.ht = new HibernateTemplate(mySessionFactory);
	}


	
	public void userAdd(User user) {
		System.out.println("--------------->>>>>>>>>");
		ht.save(user);
		
		
	}

	public List<User> findbyname(String name){
		List<User> li=(List<User>) ht.find("from com.toceansoft.entity.User as u where u.username=?",name);
		return  li;
	}
	
}
