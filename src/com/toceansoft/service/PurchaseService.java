package com.toceansoft.service;

import java.util.List;

import com.fenye.Fenye;
import com.toceansoft.entity.Purchase_order;

public interface PurchaseService {
	public List<Purchase_order> findpo(String pono);
	public List<Purchase_order> findall(int pagesize,int currentpage);
	public int findall();
}
