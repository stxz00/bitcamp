<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list</title>
<%//<jsp: 는 액션태그 자바코드처럼 작동함 
//태그 닫는 사이에 정해진 element 외 뭔가 넣으면 오류(스페이스바도)
//jsp:include에서는 자바코드 각각 실행함 즉 별개임
//index와 include들이 각각 컴파일 되는데 실행순서가 위~아래로 가고 있음
//즉 우리가 배운 스택형식으로 실행됨!(컴파일되면 담아뒀다가 순서대로 출력  %>
</head>
<body>
<jsp:include page="template/header.jsp"><jsp:param value="./" name="path"/></jsp:include>
<jsp:include page="template/menu.jsp"><jsp:param value="./" name="path"/></jsp:include>
<img alt="" src="imgs/index.jpg">
<jsp:include page="template/footer.jsp"><jsp:param value="./" name="path"/></jsp:include>		
				
</body>
</html>