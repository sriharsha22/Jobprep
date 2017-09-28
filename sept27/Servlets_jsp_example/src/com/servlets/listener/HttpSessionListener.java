package com.servlets.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;

@WebListener
public class HttpSessionListener implements javax.servlet.http.HttpSessionListener {

    public void sessionCreated(HttpSessionEvent evnet)  { 
         // TODO Auto-generated method stub
    	System.out.println("Session Created");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Session Destroyed");
    }
	
}
