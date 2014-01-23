<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
  <s:iterator value="#po" var="sa">
  	<tr>
  <td>	<s:property value="#sa.getName()"/></td>
  <td> <s:property value="#sa.getCtfid()"/> </td>
  <td> <s:property value="#sa.getAddress()"/> </td>
  <td> <s:property value="#sa.getVersion()"/> </td>
    <td> <s:property value="#sa.getId()"/> </td>
  	</tr>
  </s:iterator>
  </table>

	${fenye.getTotalpage() }
	${fenye.getAllclom() }
	 当前是第${fenye.getCurrentpage()}页,共有${fenye.getTotalpage()}页 
 <s:if test="%{#fenye.getCurrentpage()>1}">
 <a href="cdsgus.action?fenye.currentpage=1 " >首页</a>
 <a href="cdsgus.action?fenye.currentpage=${fenye.getCurrentpage()-1} " >上一页</a>  
 <a href="cdsgus.action?fenye.currentpage=${fenye.getCurrentpage()-1} " >${fenye.getCurrentpage()-1}</a></s:if>
 <a href="cdsgus.action?fenye.currentpage=${fenye.getCurrentpage()} " >${fenye.getCurrentpage()}</a> 
	<s:if test="%{#fenye.getTotalpage()>#fenye.getCurrentpage()}"><a href="cdsgus.action?fenye.currentpage=${fenye.getCurrentpage()+1} " >${fenye.getCurrentpage()+1}</a>
 <a href="cdsgus.action?fenye.currentpage=${fenye.getCurrentpage()+1} " >下一页</a></s:if> 
 <s:else>最后一页</s:else>
 <a href="cdsgus.action?fenye.currentpage=${fenye.getTotalpage()} " >尾页</a>
</body>
</html>