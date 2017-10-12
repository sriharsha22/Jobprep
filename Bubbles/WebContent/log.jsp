<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	<%
String userid=request.getParameter("email"); 
String pwd=request.getParameter("pwd"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bubbles_members","root","root"); 
Statement st= con.createStatement(); 
ResultSet  rs = st.executeQuery("select * from bubbles where email='" + userid + "' and password='" + pwd + "'");
if (rs.next()) {
    session.setAttribute("userid", userid);
    //out.println("welcome " + userid);
    //out.println("<a href='logout.jsp'>Log out</a>");
    response.sendRedirect("success.jsp");
} else {
    out.println("Invalid password <a href='index.jsp'>try again</a>");
}
%>
<a href="header.html">Home</a>
</body>
</html>