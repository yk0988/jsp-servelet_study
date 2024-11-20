<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post Servlet</title>
</head>
<body>

<!-- 기본값은 겟이므로 메서드 부분 포스트 지우면 겟으로 됨 -->
<h1>(・ω・)Post Servlet</h1> 
<form method="post" action="postServlet">

<table>
<tr>
<td>id :</td><td> <input name="id"></td>
</tr>
<tr>
<td>pwd : </td><td><input type="password" name="pwd"></td>
</tr>
<tr>
<td>email : </td><td><input name="email"></td><!-- 타입에 이메일도 추가 됨 -->
</tr>
</table>
<input type="submit" value="가입">

</form>

</body>
</html>