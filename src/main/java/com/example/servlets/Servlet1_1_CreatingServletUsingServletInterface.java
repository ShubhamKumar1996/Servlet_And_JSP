package com.example.servlets;

import java.io.*;

import jakarta.servlet.*;



public class Servlet1_1_CreatingServletUsingServletInterface implements Servlet {
	
	// Lifecycle Method
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		System.out.println("Creating...................");
		this.conf = conf;
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter printWriter = res.getWriter();
		printWriter.println("Hello World");
		printWriter.println("<h1>Hello World!!!</h1>");
		System.out.println("Servicing.....................");
	}
	
	public void destroy() {
		System.out.println("Destroying.....................");
	}
	
	// Non-Lifecycle Method
	
	public ServletConfig getServletConfig() {
		return this.conf;
	}
	
	public String getServletInfo() {
		return "This is a servlet";
	}
}
