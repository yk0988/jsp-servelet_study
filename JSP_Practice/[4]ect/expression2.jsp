<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>expression2</title>
</head>
<body>

<% 
java.util.Date date = new java.util.Date();
int hour = date.getHours();  // 변수 이름 수정
int one = 10;
int two = 12;
%>

<%!
public int operation(int i, int j){
    return i > j ? i : j;
}
%>

지금은 <%= (hour < 12) ? "오전" : "오후" %>입니다.<p>  <!-- 출력 수정 -->

one, two 중에 큰 숫자는? <%= operation(one, two) %>  <!-- 호출 방식 수정 -->

</body>
</html>
