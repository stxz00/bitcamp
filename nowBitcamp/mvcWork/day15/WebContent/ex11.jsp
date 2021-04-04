<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>etc jstl</h1>
	<h2>url</h2>
	<c:url value="https://search.naver.com/search.naver" var="naver">
		<c:param name="query" value="java"></c:param>
	</c:url>
	<c:url var="root" value="/"></c:url>
	<%
		String root2=request.getContextPath();
		System.out.println(root2+"/inmgs/~~");
		pageContext.getRequest();
	%>
	<nav>
		<a href="${naver }">naver</a>
		<a href="${root }">home</a> <!-- 백엔드식이어서 /가 /day15/가 됨 -->
		<a href="${pageContext.request.contextPath }">home</a>
		<c:url var="ex01" value="/ex01.jsp"></c:url>
		<a href="${ex01 }">ex01</a>
	</nav>
</body>
</html>