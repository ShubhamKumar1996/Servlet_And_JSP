package com.example.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Servlet1_3_CreatingServletUsingHttpServletClass extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter printWriter = res.getWriter();
		printWriter.println("<h1>Creating Servlet using HttpServlet Class");
	}
}
