package com.servlet.registeremployee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteemp")
public class DeleteEmployeeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String empNumber=request.getParameter("unum");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sharath", "sharath");
			String query="delete from employee where id=?";
			PreparedStatement p=con.prepareStatement(query);
			p.setString(1, empNumber);
			p.executeUpdate();
			response.sendRedirect("empdetailsServlet");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
