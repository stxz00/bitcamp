<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>상세 페이지</h1>
	<%
	String num=request.getParameter("num");
	String sql="select num,name,nalja,sub,content,ref,ord,lev from exercise01 where num="+num;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String driver="oracle.jdbc.driver.OracleDriver";
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	String name=null;
	Date nalja=null;
	String sub=null;
	String content=null;
	
	String ref=null;
	String ord=null;
	String lev=null;
	
	try{
		Class.forName(driver);
		conn=DriverManager.getConnection(url,user,password);
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);
		if(rs.next()){
			name=rs.getString("name");
			nalja=rs.getDate("nalja");
			sub=rs.getString("sub");
			content=rs.getString("content");
			ref=rs.getString("ref");
			ord=rs.getString("ord");
			lev=rs.getString("lev");
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
	%>
	<table width="80%" cellspacing="0" border="1" align="center">
		<tr>
			<td bgcolor="gray" align="center" width="100">글번호</td>
			<td width="30" align="center"><%=num %></td>
			<td bgcolor="gray" align="center" width="100">글쓴이</td>
			<td align="center"><%=name %></td>
			<td bgcolor="gray" align="center" width="100">날짜</td>
			<td align="center"><%=nalja %></td>
		</tr>
		<tr>
			<td bgcolor="gray" align="center">제목</td>
			<td colspan="5"><%=sub %></td>
		</tr>
		<tr>
			<td bgcolor="gray" align="center"></td>
			<td colspan="5"><%=content.replace("/r/n","<br>") %></td>
		</tr>
		<tr>
			<td colspan="6">
			<a href="#">[수 정]</a>
			<a href="#">[삭 제]</a>
			<a href="re.jsp?ref=<%=ref %>&ord=<%=ord %>&lev=<%=lev %>">[답 글]</a>
			<a href="index.jsp">[뒤 로]</a>
			</td>
		</tr>
	
	</table>
</body>
</html>