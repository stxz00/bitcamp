<%@page import="java.io.Writer"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Map.Entry"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>result page<%=request.getMethod() %></h1>
	<p>id:<%=request.getParameter("id") %><%//파라미터의 값을 가져옴 %></p>
	<p>pw:<%=request.getParameter("pw") %></p>
	<p>ra:<%=request.getParameter("ra") %></p>
	
	<%String[] chs = request.getParameterValues("ch");
	if(chs!=null){
	for(int i=0; i<chs.length; i++){
	%>
	<p>check:<%=chs[i]%></p>
	<%}} %>
	<p>select:<%=request.getParameter("sel") %></p>
	<%
	String ta = request.getParameter("ta");
	ta.replace("\r\n", "<br>");
	System.out.println(ta);
	%>
	<p><%=ta %></p>
	<%
	System.out.println("--------------------------------");
	Enumeration<String> enu= request.getParameterNames(); 
	//모든 네임을 다 받음(값이 없는 네임은 안가져옴. 단, 텍스트에리어는 빈 값이 옴으로 괜찮음)
	while(enu.hasMoreElements()){
		System.out.println(enu.nextElement());
	}
	System.out.println("--------------------------------");
	//Map<String,String[]> set = request.getParameterMap(); 
	
	//java.io.Writer out32 = response.getWriter(); 안씀 서블릿때만 씀
	//out.print(b) 이걸로 되니
	out.println();
	%>
</body>
</html>