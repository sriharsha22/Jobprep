package com.servlet.config.context;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ServletConfigContext")
public class ServletConfigContext extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	ServletConfig config;
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println(config.getInitParameter("wish"));
		System.out.println(config.getInitParameter("name"));
		
		ServletContext context=request.getServletContext();
		
		System.out.println(context.getInitParameter("context1"));
		System.out.println(context.getInitParameter("context2"));
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}

}
