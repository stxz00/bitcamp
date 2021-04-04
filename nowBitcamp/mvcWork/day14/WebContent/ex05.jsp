<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Ex05 page</h1>
   	<p>id=<%=request.getParameter("id") %></p>
   	<%//각각 따로 컴파일. 이시점은 포워드 시점이다!%>
	<%//주소값은 ex05.bit이고 ex06.jsp값으로 감. 기존 배운 포워드랑 같음 %>
</body>
</html>