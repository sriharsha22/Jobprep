package com.harsha.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcDemo
 */
@WebServlet("/MvcDemo")
public class MvcDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
//<%@  taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
	//<c:forEach var="tempStudent" items="${student_list}">
//	${tempStudent}<br/></c:forEach>
    /**
     * Default constructor. 
     */
    public MvcDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] students = {"harsha", "susan", "tirupati","chad"};
		request.setAttribute("student_list", students);
		//Step-2
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view_Student.jsp");
		//step-3
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
