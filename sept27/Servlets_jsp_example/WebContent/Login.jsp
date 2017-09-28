<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Login Page</title>
	</head>
	<body>
	<!-- Scriplet used to write java code -->
	<% String error = request.getParameter("error"); 
		if(error==null)
		{
			error=" ";
		}
	%>
	<h1>Login Page</h1>
	<!-- Expression used to display variables -->
	<h5><%= error %></h5>
	<form action="loginServlet">
		<table border="0">
			<tr>
				<td>User Name: </td>
				<td><input type="text" name="username" />
			</tr>
			<tr>
				<td>Password: </td>
				<td><input type="password" name="password" />
			</tr>
			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
	</body>
</html>