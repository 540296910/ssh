<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="User_add">
		<s:textfield name="user.username" label="用户名">
			<s:fielderror key="regist"></s:fielderror>
		</s:textfield>
		<s:password name="user.password" label="密码"></s:password>
		<s:textfield name="user.age" label="年龄"></s:textfield>
		<s:submit value="注册"></s:submit>
	</s:form>
</body>
</html>