package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns = "/myServlet1")

public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>MyServley</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>파이팅 코리아!!!</h1>");
		out.println("</body>");
		out.println("</html>");
		
	}
       

}
