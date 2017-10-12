<%@ page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<table border="1" align="center" cellspacing="6" cellpadding="6" style="border-collapse:collapse">
		
		<tr>
			<td><b>Employee Number</b></td>
			<td><b>Employee Name</b></td>
			<td><b>Employee Salary</b></td>
			<td><b>Employee Email</b></td>
		</tr>
		
		<%
			ResultSet rs=(ResultSet)request.getAttribute("rs");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getFloat(3));
		%>
		
		<tr>
			<td><%=rs.getInt(1) %></td>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getFloat(3) %></td>
			<td><%=rs.getString(4) %></td>
			<td><a href="deleteemp?unum=<%= rs.getInt(1) %>">delete</a></td>
		</tr>
		<% 	
			}
		%>
	</table>
	</body>
</html>