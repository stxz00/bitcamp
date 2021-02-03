<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
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
if(session.getAttribute("loginResult")==null){
	response.sendRedirect("login.jsp");
}else{
	request.setCharacterEncoding("euc-kr");
	int num=Integer.parseInt(request.getParameter("num"));
	if(request.getMethod().equals("POST")){
		String content=request.getParameter("content");
		int ref=Integer.parseInt(request.getParameter("ref"));
		String id=(String)session.getAttribute("loginID");
		String sql="insert into exercise02_guest "
			+"(num,id,sub,content,nalja,cnt,ref,ord,lev) "
			+"values(exercise02_guest_seq.nextval,?,?,?,sysdate,0,"+ref
			+",(select count(*) from exercise02_guest where ref="+ref+"),1)";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String driver="oracle.jdbc.OracleDriver";
		Class.forName(driver);
		Connection conn=null;
		PreparedStatement pstmt=null;
		try{
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, "댓글");
			pstmt.setString(3, content);
			pstmt.executeUpdate();
		}finally{
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
	}
	response.sendRedirect("detail.jsp?num="+num);
}
%>
</body>
</html>