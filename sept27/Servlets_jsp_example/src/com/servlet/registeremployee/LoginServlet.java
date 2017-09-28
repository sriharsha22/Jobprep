package com.servlet.registeremployee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")

public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sharath", "sharath");
			String query="select * from employee where username=? and password=?";
			PreparedStatement p=con.prepareStatement(query);
			p.setString(1, userName);
			p.setString(2, password);
			ResultSet rs=p.executeQuery();
			if(rs.next())
			{
			//	out.println("<h1> Login Successfull</h1>");
				response.sendRedirect("GetEmployee.html");
			}
			else
			{
			//	out.println("<h1> Login unsuccessfull</h1>");
				// URL rewriting
				response.sendRedirect("Login.jsp?error=authentication error");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
