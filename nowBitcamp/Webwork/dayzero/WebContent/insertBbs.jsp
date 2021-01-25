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
<meta http-equiv="refresh" content="0; url=bbs.jsp">
<title>Insert title here</title>
</head>
<body>
<% 
	String subsql="select max(num)+1 from bbs";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	new OracleDriver();
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	int num=0;
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(subsql);
		if(rs.next()){
			num=rs.getInt(1);
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}

	String name=request.getParameter("name");
	String content=request.getParameter("content");
	String sub=request.getParameter("sub");
	
	String sql="insert into bbs (num, name, sub, content, nalja) values(";
	sql+=num+",'";
	sql+=name+"','";
	sql+=sub+"','";
	sql+=content+"', sysdate)";
	try{
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		stmt.executeUpdate(sql);
	}finally{
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	
	

%>
</body>
</html>