<%@page import="org.apache.catalina.core.AprLifecycleListener"%>
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
	//모든 내장객체의 기본
	ServletRequest req=pageContext.getRequest();
	
	ServletResponse res=pageContext.getResponse();
	//세션(session) : 접속당 정보를 저장하거나 저장된 정보를 가져오는 것(로그인 후 접속하면 접속 끊길 때까지 저장하는 것)
	
	//application:웹 어플리케이션에대한 대한 모든 정보저장
	String path=application.getContextPath(); 
	//절대 경로 시에 많이 쓰는게 겟컨텍스트패스
	out.println(path);
	//out : jsp 페이지가 생성하는 결과를 출력할 때 사용되는 출력 스트림. 버퍼를 통해 나오므로 속도가 조금 떨어지는 반면 안전함
	//config : jsp 페이지에 대한 설정정보 저장.
	//page : jsp 페이지를 구현한 자바 클래스에 대한 정보 저장
	//exception : 에러가 있을 때만 사용
	out.println("출력");
	//개행은 개행 태그를 집어넣어야 가능한거고 이건 소스코드의 개행을 얘기함
	path=application.getRealPath("imgs/game1.png");
	out.println("<br>" + path);
	
%>	
<img alt="" src="imgs/game1.png">
</body>
</html>