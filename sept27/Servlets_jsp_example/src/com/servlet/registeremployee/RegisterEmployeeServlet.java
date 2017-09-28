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

/**
 * Servlet implementation class CreateEmployeeServlet
 */
@WebServlet("/register")
public class RegisterEmployeeServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	int number=Integer.parseInt(request.getParameter("number"));
    	String name=request.getParameter("name");
    	float salary=Float.parseFloat(request.getParameter("salary"));
    	String username=request.getParameter("username");
    	String password=request.getParameter("password");
    	
    	try {
			
    		/*Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sharath", "sharath");
    		*/
    		
    		String driver="oracle.jdbc.driver.OracleDriver";
    		Class.forName(driver);
    		
    		// 2. Creating connection
    		
    		String url="jdbc:oracle:thin:@localhost:1521";
    		String userName="sharath";
    		String password1="sharath";
    		
    		Connection con=DriverManager.getConnection(url, userName, password1);
    		
    		String query="insert into employee values(?,?,?,?,?)";
    		PreparedStatement p=con.prepareStatement(query);
    		p.setInt(1, number);
    		p.setString(2, name);
    		p.setFloat(3, salary);
    		p.setString(4, username);
    		p.setString(5, password);
    		p.executeUpdate();
    		System.out.println(name+" details inserted succesfully");
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
