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
<div>
	<dl>
		<dt>empno</dt>
		<dd>${bean.empno }</dd>
	</dl>
	<dl>
		<dt>eanme</dt>
		<dd>${bean.ename }</dd>
	</dl>
	<dl>
		<dt>nalja</dt>
		<dd>${bean.nalja }</dd>
	</dl>
	<dl>
		<dt>pay</dt>
		<dd>${bean.pay }</dd>
	</dl>
	<dl>
		<dt>deptno</dt>
		<dd>${bean.deptno }</dd>
	</dl>
</div>
</body>
</html>