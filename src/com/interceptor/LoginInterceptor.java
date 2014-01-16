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
  
        // 取得请求相关的ActionContext实例  
        ActionContext ctx = invocation.getInvocationContext();  
        Map session = ctx.getSession();  
        String user1 = (String) session.get("username");  
  
        // 如果没有登陆，或者登陆所有的用户名不是yuewei，都返回重新登陆  
  
        if (user1 == user.getUsername()||user1!=null ) {  
            System.out.println("test");  
            return invocation.invoke();  
        }  
  
        ctx.put("tip", "你还没有登录");  
        return Action.LOGIN;  
  
    }
	 
  
} 