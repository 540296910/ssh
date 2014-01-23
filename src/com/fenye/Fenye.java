package com.fenye;

public class Fenye {
	private int pagesize;
	private int currentpage;
	private long allclom;
	public int getPagesize() {
		return pagesize;
	}
	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}
	public int getCurrentpage() {
		return currentpage;
	}
	public void setCurrentpage(int currentpage) {
		this.currentpage = currentpage;
	}
	public long getAllclom() {
		return allclom;
	}
	public void setAllclom(long allclom) {
		this.allclom = allclom;
	}
	public long getTotalpage(){
		if((allclom%pagesize)!=0){
			return allclom/pagesize +1;
			
		}
		else{
			return allclom/pagesize;
		}
	}
}
