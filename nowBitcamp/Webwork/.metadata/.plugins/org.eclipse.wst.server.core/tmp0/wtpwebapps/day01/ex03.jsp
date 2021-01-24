<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%//이곳이 바로 디렉티브. import도 있다 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>내장객체</h1>
	<%
	//리퀘스트 : 웹 브라우저가 웹 서버에 전송한 요청 관련 정보 제공
	//javax.servlet.http.HttpServletRequest req = request;
	String addr = request.getRemoteAddr();
	System.out.println(addr);
	String url = request.getRequestURI(); // url 위치
	String ctxt = request.getContextPath(); //프로젝트 기준 루트
	String servername = request.getServerName();
	int serverport = request.getServerPort();
	%>
	<p>내 아이피 : <%=addr %> <%=url %> <%= ctxt%> <%=servername %> <%=serverport %></p>
	<p><a href="ex04.jsp?id=xyz">link1</a></p>
	<p><a href="ex04.jsp?id=abc&pw=1234">link2</a></p>
	
	<form action="ex04.jsp" method="post">
	<input type="text" name="id" value="abc"><br>
	<input type="password" name="pw"><br>
	<input type="radio" name="ra" value="item1" checked="checked">item1
	<input type="radio" name="ra" value="item2">item2
	<input type="radio" name="ra" value="item3">item3<br>
	<input type="checkbox" name="ch" value="ch1">ch1
	<input type="checkbox" name="ch" value="ch2">ch2
	<input type="checkbox" name="ch" value="ch3">ch3
	<input type="checkbox" name="ch" value="ch4">ch4<br>
	<select name="sel">
		<option value="02">서울</option>
		<option value="032">대전</option>
		<option value="042">대구</option>
		<option value="052">부산</option>
		<option value="062">광주</option>
	</select><br>
	<select name="lst" size="4">
		<option value="02">서울</option>
		<option value="032">대전</option>
		<option value="042">대구</option>
		<option value="052">부산</option>
		<option value="062">광주</option>
	</select><br>
	<textarea rows="5" cols="10" name="ta">value값이 없는 대신 여기에 쓰면 됨</textarea>
	<input type="submit" value="전송">
	<input type="reset" value="취소">
	</form>
	<%//쿼리를 자동으로 만들어줌 method="post" 쿼리숨겨서 보냄  이는 문서의 head부분에 보내는거임!!! method="get"이 디폴트%>
	
</body>
</html>