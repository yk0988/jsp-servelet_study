<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘 날짜</title>
</head>
<body>

<%
Date date = new Date();
SimpleDateFormat simpleDate= new SimpleDateFormat("yyyy-MM-dd");
String strdate = simpleDate.format(date);
%>

일반적인 html의 형태입니다. <br>
오늘 날짜는 <%=strdate %>
</body>
</html>