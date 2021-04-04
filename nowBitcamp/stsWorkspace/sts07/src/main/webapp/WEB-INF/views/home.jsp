<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
	<title>Home</title>
	<meta charset="utf-8"/>
</head>
<body>
<h1>
	Hello world!  
</h1>
<!-- 파일업로드는 무조건 포스트 브라우저입장에서 get방식은 제약사항이 많음 
엔코딩 타입 enctype="multipart/form-data" 필수-->
<form action="upload" method="post" enctype="multipart/form-data"> 
	<div>msg:<input type="text" name="msg"></div>
	<div>file:<input type="file" name="file"></div>
	<button>업로드</button>
</form>
</body>
</html>
