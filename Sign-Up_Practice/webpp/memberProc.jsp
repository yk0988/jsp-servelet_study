<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="regBean" class="com.company.MemberBean" scope="page" />
<jsp:setProperty name="regBean" property="*" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 확인</title>
<link href="./css/style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#343a40">
<table width="80%" align="center" cellspacing="0" cellpadding="5">
  <tr> 
    <td align="center" valign="middle" bgcolor="#dee2e6"> 
      <table width="90%" border="1" cellspacing="0" cellpadding="2" align="center">
        <form name="regForm" method="post" action="memberInsert.jsp">
          <tr align="center" bgcolor="212529"> 
            <td colspan="3"><font color="#FFFFFF"><b> 
              <jsp:getProperty name="regBean" property="name" />
              회원님이 작성하신 내용을 확인해 주세요</b></font></td>
          </tr>
          <tr> 
            <td width="24%">아이디</td>
            <td width="41%"><jsp:getProperty name="regBean" property="id" /></td>
          </tr>
          <tr> 
            <td>패스워드</td>
            <td><jsp:getProperty name="regBean" property="pwd" /></td>
          </tr>
          <tr> 
            <td>이름</td>
            <td><jsp:getProperty name="regBean" property="name" /></td>
          </tr>
          <tr> 
            <td>생년월일</td>
            <td><jsp:getProperty name="regBean" property="birth" /></td>
          </tr>
          <tr>
            <td>이메일</td>
            <td><jsp:getProperty name="regBean" property="email" /></td>
          </tr>
          <tr> 
            <td colspan="2" align="center"> 
              <input type="button" value="확인완료"> &nbsp; 
              <input type="button" value="다시쓰기" onClick="history.back()" /> 
            </td>
          </tr>
        </form>
      </table>
    </td>
  </tr>
</table>
</body>
</html>