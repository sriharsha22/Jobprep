package com.servlet.intro;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServletIntro
 */

@WebServlet("/Welcome") // Maping name

public class WelcomeServletIntro extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	/* When a class extends Exception, the class becomes an Exception class
	 * 
	 * When a class extends HttpServlet then the class becomes a
	 * Servlet
	 * 
	 * Servlet class has some life cycle methods
	 * 
	 * init()
	 * doGet()
	 * doPost()
	 * destroy()
	 * 
	 * There is no main() method, the program is executed (run time environment is provided)
	 * using container by server or WebServer (Ex: tomcat, glassfish, jboss,..) 
	 * 
	 * inti() and destory() are called once
	 * init is called only for 1st request i.e when object is created for servlet
	 * destroy will be called when servlet object is going to be deleted from memory
	 * doGet() and doPost() methods are called multiple times
	 * doGet and doPost is called for every request
	 * 
	 * How the front end technology is identifing the servlet using the mapping name
	 * 
	 */
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init Method");
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet Method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost Method");
	}
	
	public void  destroy() {
		System.out.println("Destroy Method");
	}

}
