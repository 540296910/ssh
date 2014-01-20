package com.toceansoft.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.toceansoft.entity.Purchase_order;
import com.toceansoft.entity.User;
import com.toceansoft.service.IUserService;
import com.toceansoft.service.PurchaseService;

public class TestSpringHibernate {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");	
		PurchaseService ps = (PurchaseService)ac.getBean("purchaseService");
		Purchase_order po =new Purchase_order();
		po.setPo_no("TESTTBH001");
		List<Purchase_order> pl=ps.findpo(po.getPo_no());
	
	System.out.println(pl.get(0).getDescription());
		}
	}

