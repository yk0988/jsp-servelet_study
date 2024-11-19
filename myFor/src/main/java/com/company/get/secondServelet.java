package com.company.get;
//바인딩
//리다이렉트 실습
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/second_5_get")
public class secondServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); 
		String address=(String)request.getAttribute("address");
		
		out.println("<html><body>");
		out.println("주소: "+address);
		out.println("<br>");
		out.println("리다이렉트 바인딩");
		out.println("</body></html>");
	}
}
