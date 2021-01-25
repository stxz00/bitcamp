<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="1; url=http://localhost:8080/day02/list.jsp">
<title>Insert title here</title>
</head>
<body>



<%@ page import="oracle.jdbc.driver.OracleDriver" %>
<%@ page import="java.sql.*" %>
<%
String sub = request.getParameter("sub"); 
String name = request.getParameter("name");
String content = request.getParameter("content");
String sql = "insert into bbs01 (num,sub,name,content,nalja) values(";

String url = "jdbc:oracle:thin:@localhost:1521:xe";
String user = "scott";
String password = "tiger";

OracleDriver driver = new OracleDriver();
Connection conn = null;
Statement stmt = null;
ResultSet rs = null;
int nextNum = 0;
String subsql="select max(num)+1 from bbs01";
try{
	conn = DriverManager.getConnection(url,user,password);
	stmt = conn.createStatement();
	rs = stmt.executeQuery(subsql);
	if(rs.next()){nextNum = rs.getInt(1);}
	stmt.close();
	sql +=nextNum + ",'" + sub + "','" + name + "','" +content + "',sysdate)";
	System.out.println(sql);
	stmt = conn.createStatement();
	stmt.executeUpdate(sql);
}finally{
	if(rs!=null){rs.close();}
	if(stmt!=null){stmt.close();}
	if(conn!=null){conn.close();}
}

%>

</body>
</html>