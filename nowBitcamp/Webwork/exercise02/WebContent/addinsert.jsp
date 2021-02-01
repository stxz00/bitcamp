<%@page import="java.sql.*"%>
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
if(request.getMethod().equals("POST")){
	request.setCharacterEncoding("euc-kr");
	String id=(String)session.getAttribute("loginID");
	String sub=request.getParameter("sub");
	String content=request.getParameter("content");
	String sql="insert into exercise02_guest (num,id,sub,content,nalja,cnt,ref,ord,lev) "
			+"values(exercise02_guest_seq.nextval,?,?,?,?,?,?,?,?)";
	System.out.println(id+sub+content);
	String driver="oracle.jdbc.driver.OracleDriver";
	Connection conn=null;
	PreparedStatement pstmt=null;
	Class.forName(driver);
	try{
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");	
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, sub);
		pstmt.setString(3, content);
		pstmt.setDate(4, new java.sql.Date(System.currentTimeMillis()));
		pstmt.setInt(5, 0);
		pstmt.setInt(6, 0);
		pstmt.setInt(7, 0);
		pstmt.setInt(8, 0);
		pstmt.executeUpdate();
	}finally{
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
}
response.sendRedirect("index.jsp");

%>
</body>
</html>