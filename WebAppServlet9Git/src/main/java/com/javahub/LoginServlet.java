package com.javahub;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");//browser
		 
		 PrintWriter out=response.getWriter();
		 
		 String userName=request.getParameter("userName");
		 String password=request.getParameter("password");
		 
		 ServletContext ctx=getServletContext();
		 
		 try 
		 {
			 	//1. Load the Driver  : Translator or Driver
			    Class.forName(ctx.getInitParameter("driver"));
				
				//2.Create the connection
				Connection con=DriverManager.getConnection(ctx.getInitParameter("url"),ctx.getInitParameter("user"),ctx.getInitParameter("password"));
				
				//3. Create the statement
				PreparedStatement stmt = con.prepareStatement("select * from employee where name=? and password=?");
				
				stmt.setString(1, userName);
				stmt.setString(2, password);
			   ResultSet rs = stmt.executeQuery();
			  if(rs.next()) {
				      out.println("<body bgcolor='cyan'>");
					 out.print("sucessfully login (get method ): "+userName);
					 out.println("</body>");
					 out.println("<a href='index.html'>Login</a>");
			  }else {
				  out.println("username of password is invalid!!");
				  out.println("<a href='index.html'>Login</a>");
			  }
			 
		 }
		 catch(Exception ex) 
		 {
			 ex.printStackTrace();
		 }
		 
		 
	}
	
	
	

}
