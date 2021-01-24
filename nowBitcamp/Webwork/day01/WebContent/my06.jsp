<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>학번 성적 수정</title>
</head>
<body>
	<h1>학번 성적 수정</h1>
	<form action="my07.jsp">
		<p><input type="text" name="num" value="수정할 학번을 입력하세요"></p>
		<p><input type="text" name="name" value="이름을 입력하세요"></p>
		<p><input type="text" name="kor" value="국어점수를 입력하세요"></p>
		<p><input type="text" name="eng" value="영어점수를 입력하세요"></p>
		<p><input type="text" name="math" value="수학점수를 입력하세요"></p>
		<p><input type="submit" value="수정">
	</form>
	<br><a href="my01.jsp">[돌아가기]</a>
</body>
</html>