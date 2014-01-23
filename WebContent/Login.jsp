<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Login Form</title>
<style type="text/css">@import url(css/main.css);
	html{
	background: url(image/log_bg1.jpg) no-repeat center center fixed; 
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
	}
	.one{
		width: 240px;
		height:130px;
		margin:0px auto;
		margin-top: 30%;
		border-style: groove;
		opacity: 0.5; background-color:#1C86EE; 
		
	}
	.rs{
		opacity:1.0;
		margin-top: 10px;
		margin-bottom: 10px;
		z-index:100;
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
