package com.toceansoft.service;

import java.util.List;

import com.toceansoft.entity.Cdsgus;

public interface CdsgusService {
	public List<Cdsgus> findall(int pagesize,int currentpage);
	public long findall();
	public Cdsgus get(Cdsgus cd);
}
