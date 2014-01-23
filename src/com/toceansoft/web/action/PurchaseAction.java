package com.toceansoft.web.action;

import java.util.List;

import com.fenye.Fenye;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.toceansoft.entity.Purchase_order;
import com.toceansoft.service.PurchaseService;

public class PurchaseAction extends ActionSupport {
	private PurchaseService ps;
	private Fenye fenye;
	public PurchaseService getPs() {
		return ps;
	}

	public void setPs(PurchaseService ps) {
		this.ps = ps;
	}
	
	public String show(){
		ActionContext ctx=ActionContext.getContext();
		if(fenye.getCurrentpage()==0){
			fenye.setCurrentpage(1);
			fenye.setPagesize(100);
			fenye.setAllclom(ps.findall());
		}
		List<Purchase_order> po=ps.findall(fenye.getPagesize(),fenye.getCurrentpage());
		ctx.put("po", po);
		ctx.put("fenye", fenye);
		return SUCCESS;
	}

	public Fenye getFenye() {
		return fenye;
	}

	public void setFenye(Fenye fenye) {
		this.fenye = fenye;
	}
}
