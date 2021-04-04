<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>test page</h1>
	<a href="./">Home</a> 
	<%//안됨 이는 xml에서 우리가 /dept했으니까! 실제로 없는 경로지만 
	//브라우저에서는 모르니까 인식  %>
	<% java.util.List list=(java.util.List)request.getAttribute("alist"); 
		//전달받은것을 화면에 출력해줄 뿐(해봤자 반복문정도) view의 원리
	%>
	<%for(int i=0; i<list.size(); i++){ %>
	<p>bean</p>
	<%} %>
</body>
</html>