<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Login Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>
	成功！！！
	<%out.print(session.getAttribute("username")); %>
	
	<s:property value="username"/>
	<s:debug></s:debug>
</body>
</html>
