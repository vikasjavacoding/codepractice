package com.javahub;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcomeServlet")
public class WelcomeServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//browser
		 
		 PrintWriter out=response.getWriter();
		 
		 String user=request.getParameter("userName");
		 out.println("<body bgcolor='cyan'>");
		 out.print("Welcome (get method ): "+user);
		 out.println("</body>");
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//browser
		 
		 PrintWriter out=response.getWriter();
		 
		 String user=request.getParameter("userName");
		 out.println("<body bgcolor='cyan'>");
		 out.print("Welcome(post method ) : "+user);
		 out.println("</body>");
	}

}
