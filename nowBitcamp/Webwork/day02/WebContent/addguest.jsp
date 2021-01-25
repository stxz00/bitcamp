<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="EUC-KR">
<meta http-equiv="refresh" content="1;http://localhost:8080/day02/guset.jsp"><%//n초뒤 해당 링크로 이동 %>
<title>Insert title here</title>
</head>
<body>
	<%
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	String sql ="insert into guest01 (name,content,nalja) values ('";
	sql += name + "','" +content + "',sysdate)";
	OracleDriver driver = new OracleDriver();
	Connection conn = null;
	Statement stmt = null;
	
	try{
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url,"scott","tiger");
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
	}finally{
		if(conn!=null){conn.close();}
		if(stmt!=null){stmt.close();}
	}
	
	%>
	<h1>실행중....</h1>
</body>
</html>