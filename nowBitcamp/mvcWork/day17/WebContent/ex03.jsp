<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="ex03.bit">ex03</a>
<a href="ex04.bit">ex04</a>
	<h1>cookie</h1>
	<p>id:${cookieID }</p>
	<form action="ex04.bit">
		<label for="id"></label>
		<input type="text" name="id"/>
		<button>쿠키저장</button>
	</form>
</body>
</html>