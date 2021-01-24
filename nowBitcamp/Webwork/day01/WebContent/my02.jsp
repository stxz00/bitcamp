<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>학생 성적 입력</title>
</head>
<body>
	<h1>학생 성적 입력</h1>
	<form action="my03.jsp" method="post">
		<p>학번 : <input type="text" name="num" value="학번을 입력하세요"></p>
		<p>이름 : <input type="text" name="name" value="이름을 입력하세요"></p>
		<p>국어 : <input type="text" name="kor" value="국어점수를 입력하세요"></p>
		<p>영어 : <input type="text" name="eng" value="영어점수를 입력하세요"></p>
		<p>수학 : <input type="text" name="math" value="수학점수를 입력하세요"></p>
		<p><input type="submit" value="입력">
	</form>
</body>
</html>