<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@ page import="com.toceansoft.entity.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
out.print(path);
out.print("<br>");
out.print(basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html style="background: url(image/log_bg1.jpg) no-repeat center center fixed; 
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;">
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
  
  <body  style="background-repeat: repeat;background-attachment: scroll;margin: auto;">
  <table>
  <s:iterator value="#po" var="sa">
  	<tr>
  <td>	<s:property value="#sa.getCompany()"/></td>
  <td> <s:property value="#sa.getDescription()"/> </td>
  	</tr>
  </s:iterator>
  </table>
	<center>
	<s:if test="%{(16>15)}">下一页</s:if> 
	
	 当前是第${fenye.getCurrentpage()}页,共有${fenye.getTotalpage()}页 
 <s:if test="%{#fenye.getCurrentpage()>1}">
 <a href="purchase.action?fenye.currentpage=1 " ><span style="background-color: #5bb75b;
background-image: -moz-linear-gradient(top, #62c462, #51a351);
background-image: -ms-linear-gradient(top, #62c462, #51a351);
background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#62c462), to(#51a351));
background-image: -webkit-linear-gradient(top, #62c462, #51a351);
background-image: -o-linear-gradient(top, #62c462, #51a351);
background-image: linear-gradient(top, #62c462, #51a351);
background-repeat: repeat-x;
filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#62c462', endColorstr='#51a351', GradientType=0);
border-color: #51a351 #51a351 #387038;
border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);
filter: progid:dximagetransform.microsoft.gra">首页</span></a>
 <a href="purchase.action?fenye.currentpage=${fenye.getCurrentpage()-1} " ><span style="background-color: #5bb75b;
background-image: -moz-linear-gradient(top, #62c462, #51a351);
background-image: -ms-linear-gradient(top, #62c462, #51a351);
background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#62c462), to(#51a351));
background-image: -webkit-linear-gradient(top, #62c462, #51a351);
background-image: -o-linear-gradient(top, #62c462, #51a351);
background-image: linear-gradient(top, #62c462, #51a351);
background-repeat: repeat-x;
filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#62c462', endColorstr='#51a351', GradientType=0);
border-color: #51a351 #51a351 #387038;
border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);
filter: progid:dximagetransform.microsoft.gra">上一页<span></a>  
 <a href="purchase.action?fenye.currentpage=${fenye.getCurrentpage()-1} " >${fenye.getCurrentpage()-1}</a></s:if>
 <a href="purchase.action?fenye.currentpage=${fenye.getCurrentpage()} " >${fenye.getCurrentpage()}</a> 
 <s:if test="%{#fenye.getTotalpage()>#fenye.getCurrentpage()}"><a href="purchase.action?fenye.currentpage=${fenye.getCurrentpage()+1} " >${fenye.getCurrentpage()+1}</a>
 <a href="purchase.action?fenye.currentpage=${fenye.getCurrentpage()+1} " ><span style="background-color: #5bb75b;
background-image: -moz-linear-gradient(top, #62c462, #51a351);
background-image: -ms-linear-gradient(top, #62c462, #51a351);
background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#62c462), to(#51a351));
background-image: -webkit-linear-gradient(top, #62c462, #51a351);
background-image: -o-linear-gradient(top, #62c462, #51a351);
background-image: linear-gradient(top, #62c462, #51a351);
background-repeat: repeat-x;
filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#62c462', endColorstr='#51a351', GradientType=0);
border-color: #51a351 #51a351 #387038;
border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);
filter: progid:dximagetransform.microsoft.gra">下一页</span></a></s:if> 
 <s:else>最后一页</s:else>
 <a href="purchase.action?fenye.currentpage=${fenye.getTotalpage()} " >尾页</a>

 </center>
	
  	<s:debug></s:debug>
  </body>
</html>
