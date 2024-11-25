<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
    function validateForm(form) { 
        if (form.title.value == "") {
            alert("제목을 입력하세요.");
            form.title.focus();
            return false;
        }
        if (form.attachedFile.value == "") {
            alert("첨부파일은 필수 입력입니다.");
            return false;
        }
    }
</script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FileUpload</title>
</head>
<body>

<h1>File Upload</h1>
<span style="color:red">${errorMessage}</span>
  <form name="fileForm" method="post" enctype="multipart/form-data"
        action="UploadProcess.do" onsubmit="return validateForm(this);">

		제목:<input type="text" name="title" /><br /> 
		카테고리:
 			<input type="checkbox" name="cate" value="사진" checked />사진 
            <input type="checkbox" name="cate" value="과제" />과제 
            <input type="checkbox" name="cate" value="워드" />워드 
            <input type="checkbox" name="cate" value="음원" />음원 <br /> 
		첨부파일 : 
			<input type="file" name="ofile" /> <br /> <!-- name="attachedFile" 에서수정-->
	        <input type="submit" value="전송하기" /><br />
</form>
</body>
</html>