package com.javahub;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/welcomeServlet")
public class WelcomeServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest request, ServletResponse response) 
	throws ServletException, IOException 
	{
		 response.setContentType("text/html");//browser
		 
		 PrintWriter out=response.getWriter();
		 
		 String user=request.getParameter("userName");
		 out.println("<body bgcolor='cyan'>");
		 out.print("Welcome : "+user);
		 out.println("</body>");
	}

}
