package com.toceansoft.test;


import java.util.List;

import com.toceansoft.dao.IUserDao;
import com.toceansoft.dao.PurchaseDao;
import com.toceansoft.dao.impl.PurchaseDaoImpl;
import com.toceansoft.dao.impl.UserDaoImpl;
import com.toceansoft.entity.Purchase_order;
import com.toceansoft.entity.User;

public class TestUserSave {
	
	public static void main(String[] args) {
		PurchaseDao pd=new PurchaseDaoImpl();
		Purchase_order po =new Purchase_order();
		po.setPo_no("TEST");
	List<Purchase_order> pl=pd.findbypono(po.getPo_no());
	
	System.out.println(pl.get(0).getDescription());
	}
}
