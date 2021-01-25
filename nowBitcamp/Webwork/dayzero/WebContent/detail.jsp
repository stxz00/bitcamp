<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Intro Page</title>
</head>
<body>
	<center>
	<table border="0" cellspacing="0" align="center" width="80%" >
		<tr>
			<td colspan="6" bgcolor="#000000" ><img src="imgs/header.jpg"></td>
		</tr>
		<tr>
			<td bgcolor="gray" background="imgs/menu.jpg"><img src="imgs/menu.jpg"></td>
			<td bgcolor="gray" background="imgs/menu.jpg" width="100"><a href="home.jsp">[HOME]</a></td>
			<td bgcolor="gray" background="imgs/menu.jpg" width="100"><a href="intro.jsp">[INTRO]</a></td>
			<td bgcolor="gray" background="imgs/menu.jpg" width="100"><a href="bbs.jsp">[B B S]</a></td>
			<td bgcolor="gray" background="imgs/menu.jpg" width="100"><a href="guest.jsp">[방명록]</a></td>
			<td bgcolor="gray" background="imgs/menu.jpg"><img src="imgs/menu.jpg"></td>
		</tr>
	</table>
	<h1><%=request.getParameter("num") %>번글 Detail Page</h1>
	
	<% 
	String sql="select name,nalja,sub,content from bbs where num="+request.getParameter("num");
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	new OracleDriver();
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		if(rs.next()){
	%>
	<table border="1" width="70%" cellspacing="0" >
		<tr>
			<td align="center" width="15%">글번호</td>
			<td align="center" width="5%"><%=request.getParameter("num") %></td>
			<td align="center" width="15%">글쓴이</td>
			<td align="center" width="10%" ><%=rs.getString(1) %></td>
			<td align="center" width="15%">날짜</td>
			<td align="center" width="40%"><%=rs.getDate(2) %></td>
		</tr>
		<tr>
			<td align="center" width="15%">제목</td>
			<td colspan="5" width="85%"><%=rs.getString(3) %></td>
		</tr>
		<tr>
			<td colspan="6" width="100%"><%=rs.getString(4).replace("\r\n", "<br>") %></td>
		</tr>
		<tr>
			<td colspan="6" width="100%">
			<a href="edit.jsp?num=<%=request.getParameter("num") %>">[수 정]</a> 
			<a href="remove.jsp?num=<%=request.getParameter("num") %>">[삭 제]</a><td>
		</tr>
	</table>
	<% 
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	%>	
	</center>

</body>
</html>




		