<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%> 
<%@ page import="oracle.jdbc.driver.OracleDriver,java.sql.*" %>
<%//add게스트에서 게스트파일 불러오는데 타입이 틀려버리면 오류나니까 꼭 컨텐트 타입 여부 확인!
	//굳이 입력완료창 등을 만드는 이유는 url,쿼리 등이 노출되면 안되는 이유가 있으므로(백엔드) 따로 창을 만들어서 비공개하는 것
	//
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<table border="0" cellspacing="0" width="600" align="center">
	<tr>
		<td bgcolor="#000000" colspan="6"><img src="imgs\header.jpg"></td>
	</tr>
	<tr>
		<td align="center" background="imgs\menu.jpg"><img src="imgs\menu.jpg"></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="index.jsp">[HOME]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="intro.jsp">[INTRO]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="list.jsp">[B B S]</a></td>
		<td align="center" width="100" background="imgs\menu.jpg"><a href="guest.jsp">[방명록]</a></td>
		<td align="center" background="imgs\menu.jpg"><img src="imgs\menu.jpg"></td>
	</tr>
	<tr>
		<td colspan="6">
		<h1>방명록</h1>
		<table border="1" cellspacing="0" width="80%" align="center">
<%
String sql="select content,name from guest01 order by nalja desc";
String url="jdbc:oracle:thin:@localhost:1521:xe";
String user="scott";
String password="tiger";

OracleDriver driver=new OracleDriver();

Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
	DriverManager.registerDriver(driver);
	conn=DriverManager.getConnection(url, user, password);
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
	<center>	
		<form action="addguest.jsp">
			글쓴이:
			<input type="text" name="name" size="5">
			<input type="text" name="content" size="45">
			<input type="submit" value="입력">
		</form>
	</center>		
		</td>
	</tr>
</table>
</body>
</html>
