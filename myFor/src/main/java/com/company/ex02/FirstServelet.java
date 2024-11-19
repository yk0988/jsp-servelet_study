package com.company.ex02;
//포워딩 연습
//리다이렉트 
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/first_2")
public class FirstServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter(); 
		
//		response.sendRedirect("second");
		response.addHeader("Refresh", "1;url=second_2");
		
		/* response.addHeader("Refresh", "1;url=second");
		 * HTTP 응답 헤더에 Refresh를 설정하는 것으로,
		 * 페이지를 1초 후에 second라는 URL로 리다이렉트하려는 의도 */
		
	}
}
