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
<s:actionerror />	
	<form action="login.action" method="post">
    	用户名:<input type="text" name="user.username"/><br/>
    	密码:<input type="password" name="user.password"/><br/>
    	<input type="submit" value="添加">
	</form>
</div>

</body>
</html>
