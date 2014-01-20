<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page import="com.toceansoft.entity.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body bgcolor="#FFE4C4" style="background-repeat: repeat;background-attachment: scroll;margin: auto;">
 <form action="purchase.action?page=${currentpage}">
  <table>
  <s:iterator value="#po" var="sa">
  	<tr>
  <td>	<s:property value="#sa.getCompany()"/></td>
  <td> <s:property value="#sa.getDescription()"/> </td>
  	</tr>
  </s:iterator>
  </table>
	</form>
	<center>
	<s:if test="%{(16>15)}">下一页</s:if> 
	
 当前是第${currentpage}页,共有${totalpage}页 
 <a href="purchase.action?currentpage=1 " >首页</a> 
 <s:if test="%{currentpage>1}"><a href="purchase.action?currentpage=${currentpage-1} " >上一页</a>  
 <a href="purchase.action?currentpage=${currentpage-1} " >${currentpage-1}</a></s:if>
 <a href="purchase.action?currentpage=${currentpage} " >${currentpage}</a> 
 <s:if test="%{(${totalpage}>${currentpage})}"><a href="purchase.action?currentpage=${currentpage+1} " >${currentpage+1}</a>
 <a href="purchase.action?currentpage=${currentpage+1} " >下一页</a></s:if> 
 <s:else>最后一页</s:else>
 <a href="purchase.action?currentpage=${totalpage} " >尾页</a>
 </center>
	
  	<s:debug></s:debug>
  </body>
</html>
