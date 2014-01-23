package com.toceansoft.dao;

import java.util.List;

import com.fenye.Fenye;
import com.toceansoft.entity.Purchase_order;

public interface PurchaseDao {
	public List<Purchase_order> findbypono(String pono);
	public List<Purchase_order> findall(int pagesize,int currentpage);
	public int findall();
}
