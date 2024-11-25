<%@page import="java.io.OutputStream"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String saveDirectory = "D:\\kimbomin\\uploads";
String saveFilename = request.getParameter("sName");
String originalFilename = request.getParameter("oName").trim(); // trim:파일자체의 불필요한 공백 제거
try {
    // 파일을 찾아 입력 스트림 생성
    File file = new File(saveDirectory, saveFilename);  
    if (!file.exists()) {
        throw new FileNotFoundException("파일을 찾을 수 없습니다.");
    }

    InputStream inStream = new FileInputStream(file);
    
    // 한글 파일명 깨짐 방지 (UTF-8을 기본으로 사용)
    String client = request.getHeader("User-Agent");
    
    // 파일 다운로드용 응답 헤더 설정 
    response.reset();
    response.setContentType("application/octet-stream");
    response.setHeader("Content-Disposition", 
                       "attachment; filename=\"" + originalFilename + "\"");
    response.setHeader("Content-Length", "" + file.length());

    // response 내장 객체로부터 새로운 출력 스트림 생성
    OutputStream outStream = response.getOutputStream();  

    // 출력 스트림에 파일 내용 출력
    byte[] buffer = new byte[4096];  // 더 큰 버퍼 사용
    int bytesRead;
    while ((bytesRead = inStream.read(buffer)) != -1) {
        outStream.write(buffer, 0, bytesRead);
    }

    // 입/출력 스트림 닫음
    inStream.close(); 
    outStream.close();
}
catch (FileNotFoundException e) {
    response.getWriter().println("<script>alert('파일을 찾을 수 없습니다.'); history.back();</script>");
}
catch (Exception e) {
    response.getWriter().println("<script>alert('예외가 발생하였습니다.'); history.back();</script>");
}
%>
