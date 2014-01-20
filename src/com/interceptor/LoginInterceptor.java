package com.interceptor;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.FieldError;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/** 
* sessionÎª¿ÕÀ¹½ØÆ÷ 
*/
public class LoginInterceptor implements Interceptor {
private static final long serialVersionUID = 1L;
public void destroy() {
}
public void init() {
}
public String intercept(ActionInvocation invocation) throws Exception {
   HttpServletRequest req = ServletActionContext.getRequest();
   if (req.getSession().getAttribute("username") == null) {
	  
    return Action.LOGIN;
   } else {
    return invocation.invoke();
   }
}
}