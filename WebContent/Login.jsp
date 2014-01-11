<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Login Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
<div >	
<s:form action="login.action">
	<s:textfield name="user.username" label="用户名"></s:textfield>
	<s:password name="user.password" label="密码"></s:password>
	<s:submit value="登录"></s:submit>
</s:form>
</div>

</body>
</html>
