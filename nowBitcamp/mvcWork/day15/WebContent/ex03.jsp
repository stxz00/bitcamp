<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL 활용</h1>
	<%
	String msg1="ex03 page";
	pageContext.setAttribute("msg1", msg1);
	//request.setAttribute("msg1", msg1);
	//application.setAttribute("msg1", msg1);
	//리스폰스 안하고 포워드해서 페이지 이동하면 리퀘스트 스코프는 반영되고
	//page스코프는 값의 유지가 안됨
	//EL의 scope 우선순위 page->requst->session->application->null 
	%>
	<p>java: <%=msg1+pageContext.getAttribute("msg1") %></p>
	<p>page:<%=pageContext.getAttribute("msg1")%></p>
	<p>request:<%=request.getAttribute("msg1") %></p>
	<p>session:<%=session.getAttribute("msg1") %></p>
	<p>appliation:<%=application.getAttribute("msg1") %></p>
	<p>EL: ${msg1 }</p> <!-- 그냥 하면 null이기 때문에 안나온 것. 스코프에 담아줘야함 -->
	<p>EL: ${requestScope.msg1 }</p> <!-- 우선순위로 받고 싶지 않다면 이렇게 명시하면 됨-->
	<p>EL: ${sessionScope.msg1 }</p> 
	<p>EL: ${applocationScope.msg1 }</p> 
</body>
</html>