package com.company.ex04;

//리다이렉트 실습
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/second_4")
public class secondServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); 
		String name=request.getParameter("name");
		
		out.println("<html><body>");
		out.println("이름 : "+name);
		out.println("<html><body>");
	}
}
