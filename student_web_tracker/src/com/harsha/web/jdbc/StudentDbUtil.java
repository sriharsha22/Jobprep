package com.harsha.web.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class StudentDbUtil {
	private  DataSource dataSource;

	public StudentDbUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	
	
	public List<Student> getStudents() throws Exception{
		
		List<Student> students = new ArrayList<>();
		
		//Step-1:connection to db
		java.sql.Connection myConn=null;
		java.sql.Statement myStmt=null;
		ResultSet myRs=null;
		
		try{
			myConn= dataSource.getConnection();
			
			//Step2: sql statements
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			//Step-3: execute query
			myRs=myStmt.executeQuery(sql);
			
			//step-4:process resultset
			while(myRs.next()){
				int id=myRs.getInt("id");
				String firstName=myRs.getString("firstName");
				String lastName= myRs.getString("lastName");
				String email = myRs.getString("email");
			
				//create new student
				Student tempStudent = new Student(id, firstName, lastName, email);
				
				//add student
				
				students.add(tempStudent);
				
			}
			
		}
		finally{
			//close jdbc statements
			close(myConn, myStmt, myRs);
		}
		return students;
	}



	private void close(java.sql.Connection myConn, java.sql.Statement myStmt, ResultSet myRs) {
		try{
			if(myRs !=null){
				myRs.close();
			}
			if(myStmt !=null){
				myStmt.close();
			}
			if(myConn !=null){
				myConn.close();
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}



	



	public Student addStudent(Student theStudent) throws Exception {
		java.sql.Connection myConn = null;
		PreparedStatement myStmt= null;
		
		try{
			myConn= dataSource.getConnection();
			
			String sql="insert into student" +"(firstName, lastName, email)"+"values(?,?,?)";
			myStmt = myConn.prepareStatement(sql);
			
			myStmt.setString(1, theStudent.getFirstName());
			myStmt.setString(2, theStudent.getLastName());
			myStmt.setString(3, theStudent.getEmail());
			
			myStmt.execute();
			
			
			
		}
		finally{
			close(myConn, myStmt, null);
		}
		return theStudent;
		
	}



	public  Student getStudent(String theStudentId) {
		
		return null;
	}
	
}
