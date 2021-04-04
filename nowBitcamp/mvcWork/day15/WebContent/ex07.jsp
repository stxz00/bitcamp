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
<h1>JSTL language</h1>
	<h2>표현</h2>
	<ul>
		<li><c:out value="1234"></c:out></li>
		<li><c:out value="3.14"></c:out></li>
		<li><c:out value="문자열"></c:out></li>
		<li><c:out value="${1+2+3 }"></c:out> </li>
		<li><c:out default="몰라" value=""></c:out> </li> 
		<li><c:out default="몰라" value="null"></c:out> </li> 
		<li><c:out default="몰라" value="${null }"></c:out> </li> 
		<!-- 디폴트는 밸류값 비어있으면 출력 -->
		<li><c:out value="${null}">몰라2</c:out></li> 
		<!-- 디폴트값은 out사이이다!-->
	</ul>
	<ul>
		<li><c:set var="su1" scope="request">1234</c:set></li> 
		<!-- 스코프값을 주면 스코프값함! -->
		<li><c:out value="${su1}"></c:out></li>
		<li>${pageScope.su1 }<li>
		<li>${requestScope.su1 }<li>
		<li>${su1 }<li>
		<li><c:set var="msg1" value="메세지"></c:set></li>
		<li>${msg1 }</li>
	</ul>
	<jsp:useBean id="bean" class="com.bit.emp.model.EmpDto"></jsp:useBean>
	<c:set target="${bean }" property="su1" value="1234"></c:set>
	<c:set target="${bean }" property="su2" value="3.14"></c:set>
	<c:set target="${bean }" property="su3" value="Z"></c:set>
	<c:set target="${bean }" property="boo" value="true"></c:set>
	<c:set target="${bean }" property="msg" value="abcd"></c:set>
	<c:set target="${bean }" property="nalja" value="<%=new java.util.Date() %>"></c:set>
	<jsp:useBean id="nalja2" class="java.util.Date"></jsp:useBean>
	<c:set target="${bean}" property="nalja" value="${nalja2 }"></c:set>
	<ul>
		<li>${bean.su1 }</li>
		<li>${bean.su2 }</li>
		<li>${bean.su3 }</li>
		<li>${bean.boo }</li>
		<li>${bean.msg }</li>
		<li>${bean.nalja }</li>
	</ul>
</body>
</html>