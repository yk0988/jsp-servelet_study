<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>For문 실습</title>
</head>
<body>

	<h1>For Exam</h1>
	1에서 10까지 합은 <p/>
	<%
	int sum = 0;
	for(int i = 1; i <= 10; i++) {  
		if(i < 10){
%>		
	
	<%=(i + "+") %>   

<%
		}else{
			out.println(i + "="); 
		}
		sum += i;
	}
	%>
	<%= sum %> 
</body>
</html>
