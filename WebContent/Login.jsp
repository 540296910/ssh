<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Login Form</title>
<style type="text/css">@import url(css/main.css);
	body{
		background-color: #EBEBEB;
	}
	.one{
		background-color: #C2C2C2;
		width: 240px;
		height:130px;
		margin:0px auto;
		margin-top: 30%;
		border-style: groove;
	}
	.rs{
		margin-top: 10px;
		margin-bottom: 10px;
		background-color: #C6E2FF;
	}
</style>
</head>
<body>
<div class="one" >	
<s:form action="login.action">
	<s:textfield name="user.username" label="用户名" cssClass="rs"></s:textfield>
	<s:password name="user.password" label="密码" cssClass="rs"></s:password>
	<s:submit value="登录" cssClass="rs"></s:submit>
</s:form>
</div>

</body>
</html>
