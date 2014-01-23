package com.toceansoft.service.impl;

import java.util.List;

import com.toceansoft.dao.CdsgusDao;
import com.toceansoft.entity.Cdsgus;
import com.toceansoft.service.CdsgusService;

public class CdsgusServiceImpl implements CdsgusService {
	private CdsgusDao cd;
	@Override
	public List<Cdsgus> findall(int pagesize, int currentpage) {
		// TODO Auto-generated method stub
		return cd.findall(pagesize, currentpage);
	}
	public CdsgusDao getCd() {
		return cd;
	}
	public void setCd(CdsgusDao cd) {
		this.cd = cd;
	}
	@Override
	public long findall() {
		// TODO Auto-generated method stub
		return cd.findall();
	}
	@Override
	public Cdsgus get(Cdsgus cf) {
		// TODO Auto-generated method stub
		return cd.find(cf);
	}

}
