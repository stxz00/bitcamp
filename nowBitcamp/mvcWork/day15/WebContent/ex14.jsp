<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>FORMAY JSTL</h1>
	<jsp:useBean id="nalja" class="java.util.Date"></jsp:useBean>
	<p><fmt:formatDate value="${nalja }" pattern="yyyy/MM/dd/hh/mm"></fmt:formatDate> </p>

	<c:set value="2200000" var="my" ></c:set>
	
	<p>${my }</p>
	<p><fmt:formatNumber value="${my }" pattern="$###,###,###.00"/></p>
	
</body>
</html>