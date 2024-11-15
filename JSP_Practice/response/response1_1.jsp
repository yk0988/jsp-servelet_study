<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 

response.setHeader("Pragma","no-cache");
if(request.getProtocol().equals("HTTP/1.1")){
	response.setHeader("Cache-Control","no-store");
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>response</h1>
http://localhost/myapp/ch07/response1.jsp 가 <p/>
http://localhost/myapp/ch07/response1_1.jsp 로 변경됨.


</body>
</html>