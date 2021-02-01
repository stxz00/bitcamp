<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="template/header.jspf" %>
<%//그대로 붙여 놓은 후 컴파일함. 반복되는 구문 처리방법.
  //반드시jspf일 필요는 없지만 오류표시는 남 %>
<% String path="./"; %>
<%@ include file="template/menu3.jspf" %>
			<td><img alt="" src="imgs/index.jpg" width="100%"></td>
<%@ include file="template/footer.jspf" %>
</body>
</html>