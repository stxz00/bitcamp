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
		<tr>
			<td colspan="6"><h1>방명록</h1></td>
		</tr>
	</table>
	<table border="1" cellspacing="0" width="60%" align="center">	
	<%
	String sql="select content, name from guest order by nalja desc";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	new OracleDriver();
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		while(rs.next()){
%>
		<tr>
			<td><%=rs.getString(1) %></td>
			<td width="100"><%=rs.getString(2) %></td>
		</tr>
		
<% 	
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
%>	
	</table>	
		<form action="addGuest.jsp">
			글쓴이 : 
			<input type="text" name="name" size="5">
			<input type="text" name="content" size="30">
			<input type="submit" value="입력">
		</form>
	</center>

</body>
</html>