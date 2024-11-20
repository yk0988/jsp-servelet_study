<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
// 문자 인코딩 설정
request.setCharacterEncoding("UTF-8");

String season = request.getParameter("season");
String fruit = request.getParameter("fruit");
String id = (String) session.getAttribute("idKey");
String pwd = (String) session.getAttribute("pwdKey");

String sessionId = session.getId();

int intervalTime = session.getMaxInactiveInterval();

if (id != null) {
%>    
    <h1>섹션 연습</h1>
    <b><%= id %></b>님이 좋아하는 계절과 과일은<p/>
    <b><%= season %></b>과 <b><%= fruit %></b>입니다.<p/>
    세션: <%= sessionId %><p/> 
    세션 유지시간: <%= intervalTime %>초<p/>
   
    <%
    // 세션 무효화
    session.invalidate();
    } else {
        out.println("세션의 시간이 경과했거나 다른 이유로 연결불가");
    }
%>
