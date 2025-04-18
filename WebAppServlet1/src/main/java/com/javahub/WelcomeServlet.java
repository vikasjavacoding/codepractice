package com.javahub;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class WelcomeServlet implements Servlet 
{
	@Override
	public void init(ServletConfig arg0) throws ServletException
	{
     System.out.println("init..");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
      //dynamic web page
		System.out.println("Service!!");
	}

	@Override
	public void destroy() 
	{
		 System.out.println("destroy..");
	}
	
	//Non life cycle
	@Override
	public ServletConfig getServletConfig()
	{
		return null;
	}
	
	@Override
	public String getServletInfo()
	{
		return null;
	}
}
