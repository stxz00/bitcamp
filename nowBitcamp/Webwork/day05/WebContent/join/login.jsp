<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.bit.MyOracle,java.sql.*,java.util.ArrayList"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%! 
	class Bbs04{
		int num;
		String sub;
		String id;
		int cnt;
	}
%>
<%
	String sql="select num,sub,id,cnt from bbs04 order by num desc";
	ArrayList<Bbs04> list=new ArrayList<Bbs04>();
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		conn=MyOracle.getConnection();
		stmt=conn.createStatement();
		rs=stmt.executeQuery(sql);		
		while(rs.next()){
			Bbs04 bean=new Bbs04();
			bean.num=rs.getInt("num");
			bean.sub=rs.getString("sub");
			bean.id=rs.getString("id");
			bean.cnt=rs.getInt("cnt");
			list.add(bean);
		}
	}finally{
		if(rs!=null)rs.close();
		if(stmt!=null)stmt.close();
		if(conn!=null)conn.close();
	}
%>
	<table width="100%">
		<tr>
			<td><img src="../imgs/blue_logo.png"></td>
			<td width="200">
				<%if(session.getAttribute("loginResult")==null){ %>
				<a href="login.jsp">[로그인]</a>
				<a href="add.jsp">[회원가입]</a>
			<%}else{ %>	
				<a href="logout.jsp">[로그아웃]</a>
			<%} %>
			</td>
		</tr>
		<tr>
			<td colspan="2"  align="center">
				<a href="../index.jsp">[HOME]</a>
				<a href="../intro.jsp">[INTRO]</a>
				<a href="../bbs/list.jsp">[B B S]</a>
				<a href="../guest/list.jsp">[GUEST]</a>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<center>
				<h1>로그인</h1>
					<form action="result.jsp" method="post">
					<table>
						<tr>
							<td>id</td>
							<td><input type="text" name="id"></td>
						</tr>
						<tr>
							<td>pw</td>
							<td><input type="text" name="pw"></td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" value="로그인">
								<input type="reset" value="취소">
							</td>
						</tr>
					</table>
					</form>
				</center>
			</td>
		</tr>
		<tr>
			<td colspan="2" bgcolor="gray" align="center" height="50%">
			Copyright &copy; 비트캠프 All rights reserved
			</td>
		</tr>
	
	</table>
</body>
</html>