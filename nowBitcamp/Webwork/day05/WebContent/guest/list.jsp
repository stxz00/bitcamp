<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>session</h1>
	<p><%=session.getId() %></p> 
	<p><%=session.getLastAccessedTime() %></p> <!-- 클라이언트가 마지막으로 요청한 시간을 밀리 초 단위로 보여줌 -->
	<p><%=session.getMaxInactiveInterval() %></p> <!-- 초단위 세션 갱신될 시간 -->
	<%
	session.setMaxInactiveInterval(60); //60초로 갱신 바꾸지만 된다는 보장은 없음
	%>
	<!-- 다른 페이지 가서도 동일 세션아이디 -->
	<!-- 세션이란 접속당 하나의 메모리를 만드는 것. 이는 자바에서의 메모리공간과 같음. 할 일이 끝나면 휘발되는 것과 같이
		 근데 세션은 자바에서 사용하고 was컨테이너에서 하고 있는것.(서버 메모리에 쓰고 있음.)
		 그래서 서버상의 메모리니까 클라이언트는 맘대로 접근이 불가능하게 된 것! 보안성이 굉장히 높다	
		 DB도 인서트, 딜리트 등 할 때 세션처럼 저장해놓는거(남들은 못보고) 커밋이나 엑시트해야 저장되니
		 트랜잭션의 롤백은 마지막 커밋으로 돌아가니 기존의 수행(세션처럼 저장해놓은)을 날리면 끝
		 
		 ★로그아웃은 세션을 갱신(재시작 등)하므로 getID하면 아이디가 바뀌어있음! 로그인은 당연히 그대로! 즉
		 세션을 갱신함으로써 로그인을 풀어버리는 것이다!
		 
		 모바일뱅킹의 경우 10분 지나면 세션이 갱신되듯이 서버는 특정 시간이 지나면 세션을 갱신한다!
		 즉 톰캣이 갱신하며 servers의 web.xml의 608번줄을 보면 30분 뒤에 로그아웃 되도록 되어 있음.		 
		 session.invalidate()는 로그인 뿐만 아니라 세션으로 저장한 것도 날리므로 많이 사용함!
	-->
</body>
</html>