<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Intro Page</title>
</head>
<body>
	<center>
	<table border="0" cellspacing="0" align="center" width="80%" >
		<tr>
			<td colspan="6" bgcolor="#000000" ><img src="imgs/header.jpg"></td>
		</tr>
		<tr>
			<td bgcolor="gray" background="imgs/menu.jpg"><img src="imgs/menu.jpg"></td>
			<td bgcolor="gray" background="imgs/menu.jpg" width="100"><a href="home.jsp">[HOME]</a></td>
			<td bgcolor="gray" background="imgs/menu.jpg" width="100"><a href="intro.jsp">[INTRO]</a></td>
			<td bgcolor="gray" background="imgs/menu.jpg" width="100"><a href="bbs.jsp">[B B S]</a></td>
			<td bgcolor="gray" background="imgs/menu.jpg" width="100"><a href="guest.jsp">[방명록]</a></td>
			<td bgcolor="gray" background="imgs/menu.jpg"><img src="imgs/menu.jpg"></td>
		</tr>
	</table>
		<h1>BBS Insert Page</h1>
		<form action="insertBbs.jsp">
			<table cellspacing="1" border="0" width="70%">
				<tr>
					<td width="150" bgcolor="gray" align="center">제목</td>
					<td ><input type="text" name="sub" size="70"></td>
				</tr>
				<tr>
					<td width="150" bgcolor="gray" align="center">글쓴이</td>
					<td ><input type="text" name="name" size="15"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><textarea rows="15" cols="80" name="content"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="입 력"> 
					<input type="reset" value="취 소">
					</td>
				</tr>
			</table>
		</form>
	</center>
	
</body>
</html>




		