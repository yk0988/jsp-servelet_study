<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<% 
    request.setCharacterEncoding("UTF-8"); 
    String name = "korea Football";
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <h1>인클루드 태그</h1>
    <jsp:include page="includeTagTop1.jsp"/>
        인클루드 액션태그 body
</body>
</html>
