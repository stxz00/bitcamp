<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<%
	//session.invalidate(); //인트로로 가면 세션 갱신으로 인해  접속 끊김
	//session.removeAttribute("loginResult"); //로그인 리절트 삭제로 끊김
	//session.setAttribute("loginResult", null); //리절트 값을 바꿔주면 끊김
%>
<body>
	<table width="100%">
		<tr>
			<td><img src="imgs/blue_logo.png"></td>
			<td width="200">
				<%if(session.getAttribute("loginResult")==null){ %>
				<a href="join/login.jsp">[로그인]</a>
				<a href="join/add.jsp">[회원가입]</a>
			<%}else{ %>	
				<a href="join/logout.jsp">[로그아웃]</a>
			<%} %>
			</td>
		</tr>
		<tr>
			<td colspan="2"  align="center">
				<a href="index.jsp">[HOME]</a>
				<a href="intro.jsp">[INTRO]</a>
				<a href="bbs/list.jsp">[B B S]</a>
				<a href="guest/list.jsp">[GUEST]</a>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<center>
				<img alt="" src="imgs/game1.png" width="100%">
				</center>
			</td>
		</tr>
		<tr>
			<td colspan="2" bgcolor="gray" align="center" height="50%">
			Copyright &copy; 비트캠프 All rights reserved
			</td>
		</tr>
	
	</table>
</body>
</html>