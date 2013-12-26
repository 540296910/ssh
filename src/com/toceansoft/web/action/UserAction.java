package com.toceansoft.web.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.toceansoft.entity.User;
import com.toceansoft.service.IUserService;

public class UserAction extends ActionSupport {
	private User user;
	private IUserService userService;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	
	
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String add(){
		userService.add(user);
		return "success";
	}
	public String login(){
		List<User> li= (List<User>) userService.login(user.getUsername());
		if(!li.isEmpty())
		{
		return "success";}
		else{
			return "input";
		}
	}
	
}
