<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
	<h1>BBS List Page</h1>
	<table align="center" width="70%" border="1" cellspacing="0">
		<tr>
			<td align="center" width="20%">글번호</td>
			<td align="center" width="40%">제목</td>
			<td align="center" width="20%">글쓴이</td>
			<td align="center" width="20%">날짜</td>
		</tr>
<% 
		String sql="select num, sub, name, nalja from bbs order by num desc";
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
			<tr>
				<td align="center"><a href="detail.jsp?num=<%=rs.getInt(1) %>"><%=rs.getInt(1) %></a></td>
				<td align="center"><a href="detail.jsp?num=<%=rs.getInt(1) %>"><%=rs.getString(2) %></a></td>
				<td align="center"><a href="detail.jsp?num=<%=rs.getInt(1) %>"><%=rs.getString(3) %></a></td>
				<td align="center"><a href="detail.jsp?num=<%=rs.getInt(1) %>"><%=rs.getDate(4) %></a></td>
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
		<p><a href="addBbs.jsp">[입 력]</a></p>
	</center>

</body>
</html>




		