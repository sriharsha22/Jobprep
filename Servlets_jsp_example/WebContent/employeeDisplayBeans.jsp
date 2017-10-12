<%@ page import="com.jsp.javabean.Employee" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.jsp.javabean.Employee">
<!-- Employee emp2=new Employee() -->
<jsp:setProperty property="eno" name="emp" value="10" />
<jsp:setProperty property="ename" name="emp" value="Sharath" />
<jsp:setProperty property="esal" name="emp" value="10000" />
<jsp:setProperty property="euser" name="emp" value="sharath" />
</jsp:useBean>
<table>
<tr>
<td><jsp:getProperty property="eno" name="emp" /></td>
<td><%= emp.getEname() %></td>
<td><%= emp.getEsal() %></td>
<td><%= emp.getEuser() %></td>
</tr>
</table>
</body>
</html>