<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = "코리아 풋볼";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include Tag</title>
</head>
<body>
<h1>Include Tag Example1</h1>
<jsp:include page = "includeTop1.jsp"/>
include ActionTag의 Body 입니다.
</body>
</html>