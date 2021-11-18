package com.example.servlets;

import jakarta.servlet.*;
import java.io.*;

public class Servlet1_2_CreatingServletUsingGenericServletClass extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter printWriter = res.getWriter();
		printWriter.println("<h1>Creating servlet using Generic Servlet class");
	}
}
