<%@page import="java.util.Properties"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>입력 완료</title>
</head>
<body>
	<h1>입력이 완료되었습니다</h1>
	<a href="my01.jsp">[조회]</a>
	<%
	String sql="insert into student01 values(";
	sql+=request.getParameter("num")+",'";
	sql+=request.getParameter("name")+"',";
	sql+=request.getParameter("kor")+",";
	sql+=request.getParameter("eng")+",";
	sql+=request.getParameter("math")+")";
	System.out.println(sql);
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	Properties prop = new Properties();
	prop.setProperty("user", "scott");
	prop.setProperty("password", "tiger");
	OracleDriver driver = new OracleDriver();
	DriverManager.registerDriver(driver);
	Connection conn = null;
	Statement stmt = null;
	try{
		conn = DriverManager.getConnection(url,prop);
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		if(stmt!=null){stmt.close();}
		if(conn!=null){conn.close();}
	}
	%>
</body>
</html>