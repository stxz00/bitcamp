<%@page import="oracle.jdbc.OracleTypes"%>
<%@page import="oracle.jdbc.oracore.OracleType"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.CallableStatement"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String driver=request.getParameter("driver");
String url=request.getParameter("url");
String user=request.getParameter("user");
String password=request.getParameter("password");

String sql="{call bbs05_one(?,?)}";
int num=Integer.parseInt(request.getParameter("num"));

java.sql.Connection conn=null;
CallableStatement cstmt=null;
ResultSet rs=null;

try{
	Class.forName(driver);
	conn=DriverManager.getConnection(url,user,password);
	cstmt=conn.prepareCall(sql);
	cstmt.setInt(1, num);
	cstmt.registerOutParameter(2, OracleTypes.CURSOR);
	//아웃매개변수
	cstmt.execute();
	rs=(java.sql.ResultSet)cstmt.getObject(2);
	if(rs.next()){
%>
<h1>상세 페이지</h1>
<table align="center" width="400">
	<tr>
		<td>글번호</td>
		<td><%=rs.getInt("num") %></td>
		<td>글쓴이</td>
		<td><%=rs.getString("id") %></td>
		<td>날짜</td>
		<td><%=rs.getInt("nalja") %></td>
	</tr>
	<tr>
		<td>제목</td>
		<td colspan="5"><%=rs.getString("sub") %></td>
	</tr>
	<tr>
		<td>내용</td>
		<td colspan="5"><%=rs.getString("content") %>></td>
	</tr>
	<tr>
		<td colspan="6">
			<a href="./">[수 정]</a>
			<a href="./">[삭 제]</a>
		</td>
	</tr>
<%
	} 
}finally{
	if(rs!=null)rs.close();
	if(cstmt!=null)cstmt.close();
	if(conn!=null)conn.close();
}
%>	
	
</table>
</body>
</html>