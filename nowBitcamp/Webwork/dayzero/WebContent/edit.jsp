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
		
<% 
	String num=request.getParameter("num");
	String sql="select name, nalja, sub, content from bbs where num="+num;
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
		while(rs.next()){
%>
	
	</table>
	<h1><%=num %>번글 Edit Page</h1>
	<form action="editPage.jsp">
	<table cellspacing="0" border="1" width="70%">
		<tr>
			<td width="100" align="center">글번호</td>
			<td width="5"><%=num %></td>
			<td width="100" align="center">글쓴이</td>
			<td width="50"><%=rs.getString(1) %></td>
			<td width="100" align="center">날짜</td>
			<td width="250"><%=rs.getDate(2) %></td>
		</tr>
		<tr>
			<td width="100" align="center">제목</td>
			<td colspan="5"><input type="text" name="sub" value="<%=rs.getString(3) %>"></td>
		</tr>
		<tr>
			<td colspan="6"><textarea rows="10" cols="78" name="content"><%=rs.getString(4)%></textarea></td>
		</tr>
		<tr>
			<td colspan="6" align="center">
			<input type="hidden" name="num" value="<%=num %>"> 
			<input type="submit" value="수 정"> 
			<input type="button" value="취 소" onclick="history.back(-1);">
			</td>
		</tr>
	</table>
	</form>
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




		