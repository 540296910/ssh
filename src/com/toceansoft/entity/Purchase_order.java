package com.toceansoft.entity;

public class Purchase_order {
private String po_no;
private String description;
private String company;
public String getPo_no() {
	return po_no;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public void setPo_no(String po_no) {
	this.po_no = po_no;
}
}
