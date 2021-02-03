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
<jsp:include page="../template/header.jsp">
	<jsp:param value="../" name="path"/>
</jsp:include>
<jsp:include page="../template/menu.jsp">
	<jsp:param value="../" name="path"/>
</jsp:include>
<jsp:useBean id="bean" class="com.bit.bbs05.dto.Bbs05Dto" scope="page"></jsp:useBean>
<jsp:setProperty property="num" name="bean"/>
<%
//scope= 페이지 리퀘스트 세션 어플리케이션. 
//유즈빈 태그의 라이프 사이클.
//같은 세션 스코프의 경우는 똑같은 객체(주소)가 나옴 다른 브라우저면 다름
//즉 유즈빈 코드는 무조건 객체를 찍지 않고 세션스코프면 똑같은 객체를 사용하겠다는 것
//어플리케이션스코프면 다른 브라우저를 접속해도 같은 객체 사용!
//어플리케이션은 톰캣서버를 기준으로 열었을 때부터 끝날때까지임
//그래서 전 인원이 동일한 객체를 사용하게 됨.
//서버를 내릴때서야 객체가 바뀜.
//디폴트는 페이지 스코프
//이름 그대로 페이지당 하나. 그래서 페이지를 벗어날 때마다 새로운 객체 생성.
//리퀘스트스코프는 페이지와 페이지 사이에 유지가됨.
//페이지에서 다음 페이지까지 유지. 리퀘스트가 갱신되기 전까지임
//즉 리퀘스트 하고 리스폰스 하기 이전 까지임! 이래서 포워드를 쓰면 해당 페이지가 넘어가는 형태는 아니므로 리퀘스트가 됨!
//getproperty는 그 저장되어 있는 bean 값을 받으려고 하니 bean 저장값이 안나옴

bean=Bbs05Dao.selectOne(bean.getNum());
%>
	<table width="400" align="center" border="1" cellspacing="0">
		<tr>
			<td>글번호</td>
			<td><%=bean.getNum() %></td>
			<td>글쓴이</td>
			<td><%=bean.getId() %></td>
			<td>날짜</td>
			<td><%=bean.getNalja() %></td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan="5"><%=bean.getSub() %></td>
			
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="5"><%=bean.getContent() %></td>
		</tr>
		<tr>
			<td colspan="6">
				<a href="edit.jsp?num=<%=bean.getNum() %>">[수 정]</a>
				<a href="#">[삭 제]</a>
			</td>
		</tr>
		
	
	</table>
<jsp:include page="../template/footer.jsp">
	<jsp:param value="../" name="path"/>
</jsp:include>
</body>
</html>