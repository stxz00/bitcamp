<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="oracle.jdbc.OracleDriver"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>학생 성적 조회</title>
</head>
<body>
	<%
	String sql = "select * from student01";
	String url = "jdbc:oracle:thin:@localhost:xe";
	OracleDriver driver = new OracleDriver();
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	try{
		DriverManager.registerDriver(driver);
		conn = DriverManager.getConnection(url);
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		while(rs.next()){
			
		}
		
	}catch(SQLException e){
		System.out.println("문제가 발생하였습니다");
	}finally{
		if(rs != null){rs.close();}
		if(stmt != null){stmt.close();}
		if(conn != null){conn.close();}
	}
	%>
</body>
</html>