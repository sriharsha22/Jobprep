package com.harsha.web.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.sql.DataSource;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Resource(name="jdbc/web_student_tracker")
    private DataSource dataSource;
    public TestServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Step-1:Setup print writer
		PrintWriter out=response.getWriter();
		response.setContentType("text/plain");
		
		//Step-2:setup a connection to database
		java.sql.Connection conn = null;
		java.sql.Statement stmt=null;
		ResultSet rs=null;
		try{
			
			conn =  dataSource.getConnection();
			
			//Step-3Create SQL statements
			String sql="select * from student";
			stmt=conn.createStatement();
			
			//step-4: execute sql query
			rs=stmt.executeQuery(sql);
			
			//step-5: process the result set
			while(rs.next()){
				
				String email = rs.getString("email");
				out.println(email);
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
