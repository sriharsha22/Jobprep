package com.servlets.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ServletRequestAtributeListener
 *
 */
//@WebListener
public class ServletRequestAtributeListener implements ServletRequestAttributeListener {

    
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("Attribute Removed");
    }

	public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
		System.out.println("Attribute Added");
    }

	public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
		System.out.println("Attribute Replaced");
    }
	
}
