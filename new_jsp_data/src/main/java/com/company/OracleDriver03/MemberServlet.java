package com.company.OracleDriver03;


import jakarta.servlet.ServletException;
import java.sql.Date;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/member3")
public class MemberServlet<MemberVO> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		MemberDAO dao = new MemberDAO();
		List<MemberVo> list = dao.listMembers();
		
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입입</td></tr>");

		for(int i=0; i<list.size();i++) {
			MemberVo memberVo = (MemberVo) list.get(i);
			String id = memberVo.getId();
			String pwd = memberVo.getPwd();
			String name = memberVo.getName();
			String email = memberVo.getEmail();
			Date joinDate = memberVo.getJoinDate();
			out.print("<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name 
					   + "</td><td>" + email + "</td><td>" + joinDate + "</td></tr>");			
		}
		out.print("</table></body></html>");
			
		}
	}

