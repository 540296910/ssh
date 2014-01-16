package com.interceptor;

import java.util.Map;  

import com.opensymphony.xwork2.Action;  
import com.opensymphony.xwork2.ActionContext;  
import com.opensymphony.xwork2.ActionInvocation;  
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;  
import com.toceansoft.entity.User;
  
public class LoginInterceptor extends AbstractInterceptor {  
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	} 
    @Override  
    public String intercept(ActionInvocation invocation) throws Exception {  
  
        // ȡ��������ص�ActionContextʵ��  
        ActionContext ctx = invocation.getInvocationContext();  
        Map session = ctx.getSession();  
        String user1 = (String) session.get("username");  
  
        // ���û�е�½�����ߵ�½���е��û�������yuewei�����������µ�½  
  
        if (user1 == user.getUsername()||user1!=null ) {  
            System.out.println("test");  
            return invocation.invoke();  
        }  
  
        ctx.put("tip", "�㻹û�е�¼");  
        return Action.LOGIN;  
  
    }
	 
  
} 