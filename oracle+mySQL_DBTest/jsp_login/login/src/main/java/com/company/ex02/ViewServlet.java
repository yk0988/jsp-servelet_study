package com.company.ex02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Data;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;


//@WebServlet("/viewMembers")
public class ViewServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		doHandle(request, response);
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		doHandle(request, response);
	}
	
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out=response.getWriter();
		List membersList = (List) request.getAttribute("membersList");
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td >삭제</td></tr>");
		
		
		for (int i = 0; i < membersList.size(); i++) {
		MemberVO memberVO = (MemberVO) membersList.get(i);
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		String name = memberVO.getName();
		String email = memberVO.getEmail();
		Date joinDate = memberVO.getJoinDate();
		
		out.print("<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name + "</td><td>" + email + "</td><td>"
		+ joinDate + "</td><td>" + "<a href='/login/member?command=delMember&id=" + id
		+ "'>삭제 </a></td></tr>");
		
		}
		out.print("</table></body></html>");
		out.print("<a href='/login/memberForm.html'>새 회원 등록하기</a");
		}
}