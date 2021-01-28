<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>입력 페이지</h1>
	<form action="insert.jsp">
	<table width="80%" align="center" cellspacing="3" >
		<tr>
			<td bgcolor="gray" align="center" width="100">글제목</td>
			<td><input type="text" name="sub"></td>
		</tr>
		<tr>
			<td bgcolor="gray" align="center" width="100">글쓴이</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td bgcolor="gray" ></td>
			<td><textarea rows="10" cols="50" name="content"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" >
			<input type="submit" value="등 록">
			<input type="button" value="취 소" onclick="history.back(-1);">
			</td>
		</tr>
	</table>
	</form>
	
</body>
</html>