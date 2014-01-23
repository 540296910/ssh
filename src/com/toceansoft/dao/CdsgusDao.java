package com.toceansoft.dao;

import java.util.List;

import com.toceansoft.entity.Cdsgus;

public interface CdsgusDao {
	public long findall();
	
	public List<Cdsgus> findall(int pagesize,int currentpage);
	public Cdsgus find(Cdsgus cd);
}
