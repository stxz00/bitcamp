<%@page import="com.bit.dept.model.DeptDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="template/menu.jspf" %> 
<!-- 콘트롤러로 했지만 문서를 기준으로 경로를 감! 백엔드 기준-->
<table>
	<thead>
		<tr>
			<th>deptno</th>
			<th>dname</th>
			<th>loc</th>
		</tr>
	</thead>
	<tbody>
	<%
	java.util.List<DeptDto> list;
	list=(java.util.List<DeptDto>)request.getAttribute("list");
	for(DeptDto bean:list){
	%>
		<tr>
			<td><%=bean.getDeptno() %></td>
			<td><%=bean.getDname() %></td>
			<td><%=bean.getLoc() %></td>
		</tr>
	<%
	}
	%>
	</tbody>
</table>
<%@ include file="template/footer.jspf" %>
</body>
</html>