<%@page import="com.bit.bbs05.dao.Bbs05Dao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" class="com.bit.bbs05.dto.Bbs05Dto" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>
<%
//<jsp:setProperty property="sub" name="bean"/>
//<jsp:setProperty property="id" name="bean"/>
//<jsp:setProperty property="content" name="bean"/>
//<jsp:setProperty property="num" name="bean"/>

//<jsp:setProperty property="num" name="bean" value="1234"/> <- 자동으로 Integer.parseInt 까지 해줌!
//원래는 리퀘스트 받아야하나 유즈 빈 후 셋 프로퍼티 사용
//Bbs05Dto bean=new Bbs05Dto(); 이다.
//bean.setSub(request.getParameter("sub")); <-setProperty이 설정. name이 객체 이름, property가 쓸 자료형 이름 value가 값인데 없으면 땡
System.out.println(bean.getSub());
System.out.println(bean.getId());
System.out.println(bean.getContent());
System.out.println(bean.getNum());
System.out.println(bean);

%>

<%
	Bbs05Dao.inertOne(bean.getSub(), bean.getContent(), bean.getId());

%>



<jsp:forward page="list.jsp"></jsp:forward>

</body>
</html>