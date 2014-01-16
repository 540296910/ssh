package com.toceansoft.web.action;

import java.util.List;

import org.apache.struts2.components.FieldError;

import com.opensymphony.xwork2.ActionContext;
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

	public String add() {
		String result=userService.add(user);
		if(result.equals("input")){
			this.addFieldError("regist", "用户已存在！");
			return INPUT;
		}
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("username",user.getUsername());
		return	SUCCESS;
	}

	public String login() {
		List<User> li = (List<User>) userService.login(user.getUsername());
		if (!li.isEmpty()) {
		//	HttpSession session =null; 
			if (li.get(0).getPassword().equals(user.getPassword())) {
				ActionContext ctx = ActionContext.getContext();
				ctx.getSession().put("username",user.getUsername());
				return "success";
			} else {
				return "input";
			}
		} else {
			return "input";
		}
	}
	public void validate(){
		if(user.getAge()>100||user.getAge()<0){
			addFieldError("age", "必须大于0小于100");
		}
		if(user.getUsername().equals("")){
			addFieldError("username", "必须输入用户名");
		}
	}

}
