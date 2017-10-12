package com.harsha.web.jdbc;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentDbUtil studentDbUtil;
	
	@Resource(name="jdbc/student_web_tracker")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		try{
			studentDbUtil = new StudentDbUtil(dataSource);
		}
		catch(Exception ex){
			throw new ServletException(ex);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String theCommand = request.getParameter("command");
			
			if(theCommand == null){
				theCommand="LIST";
			}
			
			switch(theCommand){
			case "LIST": ListStudents(request, response);
				break;
			case "ADD":
				addStudent(request, response);
				break;
			case "LOAD":
				updateStudent(request, response);
			default:
				ListStudents(request, response);
			}	
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		
	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String theStudentId = request.getParameter("studentId");
		
		Student theStudent = StudentDbUtil.getStudent(theStudentId);
		
		request.setAttribute("THE_STUDENT", theStudent);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-student-form.jsp");
		
		dispatcher.forward(request, response);
		
		
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		Student theStudent= new Student(firstName, lastName, email);
		
		StudentDbUtil.addStudent(theStudent);
		
		ListStudents(request, response);
		
	}

	private void ListStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//get students from dbutil
		
		List<Student> students = studentDbUtil.getStudents();
		
		//add students to the request
		
		request.setAttribute("STUDENT_LIST", students);
		
		//send to jsp page(view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);
		
		
		
		
	}

}
