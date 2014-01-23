package com.toceansoft.service.impl;

import java.util.List;

import com.fenye.Fenye;
import com.toceansoft.dao.PurchaseDao;
import com.toceansoft.entity.Purchase_order;
import com.toceansoft.service.PurchaseService;

public class PurchaseServiceImpl implements PurchaseService {
	private	PurchaseDao pd;
	@Override
	public List<Purchase_order> findpo(String pono) {
		// TODO Auto-generated method stub
		return pd.findbypono(pono);
	}
	public PurchaseDao getPd() {
		return pd;
	}
	public void setPd(PurchaseDao pd) {
		this.pd = pd;
	}
	@Override
	public List<Purchase_order> findall(int pagesize,int currentpage) {
		// TODO Auto-generated method stub
		return pd.findall(pagesize,currentpage);
	}
	@Override
	public int findall() {
		// TODO Auto-generated method stub
		return pd.findall();
	}


}
