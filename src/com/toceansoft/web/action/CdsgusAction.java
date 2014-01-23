package com.toceansoft.web.action;

import java.util.List;



import com.fenye.Fenye;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.toceansoft.entity.Cdsgus;
import com.toceansoft.entity.Purchase_order;
import com.toceansoft.service.CdsgusService;

public class CdsgusAction extends ActionSupport {
private CdsgusService cdsService;
private Fenye fenye;
public Fenye getFenye() {
	return fenye;
}

public void setFenye(Fenye fenye) {
	this.fenye = fenye;
}

public CdsgusService getCdsService() {
	return cdsService;
}

public void setCdsService(CdsgusService cdsService) {
	this.cdsService = cdsService;
}
public String show(){
	ActionContext ctx=ActionContext.getContext();
	if(fenye.getCurrentpage()==0){
		fenye.setCurrentpage(1);
		fenye.setPagesize(100);
		fenye.setAllclom(cdsService.findall());
	}
	List<Cdsgus> po=cdsService.findall(fenye.getPagesize(),fenye.getCurrentpage());
	ctx.put("po", po);
	ctx.put("fenye", fenye);
	return SUCCESS;
}

}
