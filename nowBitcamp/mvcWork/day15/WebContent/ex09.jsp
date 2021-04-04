<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>jstl 제어문</h1>
	<h2>반복문</h2>
	<ul>
		<c:forEach step="2" begin="10" end="20" var="i" varStatus="status">
			<li>item-${i},${status.index },${status.first },${status.last },${status.count }</li>
		</c:forEach>
	</ul>
	<%
	java.util.ArrayList list=new java.util.ArrayList();
	list.add("item1");
	list.add("item2");
	list.add("item3");
	list.add("item4");
	list.add("item5");
	
	pageContext.setAttribute("alist", list);
	//for(String msg:list){
	//	System.out.println(msg);
	//}
	%>
	<ol>
		<c:forEach items="${alist }" var="msg" varStatus="status"> <!-- status.current 현재 for문의 해당하는 번호value -->
			<li>${status.index },${status.count },${status.current}-${msg}</li>
		</c:forEach>
	</ol>
</body>
</html>