package com.servlet.registeremployee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empdetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empNumber=request.getParameter("empnum");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sharath", "sharath");
			String query="select * from employee where id=?";
			PreparedStatement p=con.prepareStatement(query);
			p.setString(1, empNumber);
			ResultSet rs=p.executeQuery();
			request.setAttribute("rs", rs);
			RequestDispatcher rd=request.getRequestDispatcher("Employees.jsp");
			rd.forward(request, response);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
