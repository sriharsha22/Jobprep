<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<body>
<%@ page import ="java.sql.*" %>
<%@ page import ="javax.sql.*" %>
<%
 
 
String fname=request.getParameter("fname"); 
String lname=request.getParameter("lname"); 
String email=request.getParameter("email");
String pwd=request.getParameter("pwd");
String bmonth=request.getParameter("bmonth");
String bday=request.getParameter("bday");
String byear =request.getParameter("byear");
String options = request.getParameter("options");
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bubbles_members",
"root","root"); 
Statement st= con.createStatement(); 
ResultSet rs; 
int i=st.executeUpdate("insert into bubbles(first_name, last_name, email, password, month, date, year, gender) values ('" + fname + "','" + lname + "','" + email + "','" + pwd + "','" + bmonth + "','" + bday + "', '" + byear + "','" + options + "')"); 

%>

</body>
</html>