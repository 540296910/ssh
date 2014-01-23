package com.spring.aop;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.toceansoft.entity.Cdsgus;
import com.toceansoft.entity.Purchase_order;
import com.toceansoft.service.CdsgusService;
import com.toceansoft.service.PurchaseService;

public class AOPTest {  
    
      
    /** 
     * ������������ 
     */ 
public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");	
		CdsgusService ps = (CdsgusService) ac.getBean("cdsService");
		Cdsgus c=new Cdsgus();
		c.setName("������");
		c.setCtfid("460003199308220022");
		System.out.println(ps.get(c));
		}
}  