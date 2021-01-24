<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>구구단 출력</title>
</head>
<body>
<table align="center" border="1" width="100%" height="500">
	<tr><td colspan="9" align="center">구구단 출력</td></tr>
	<%
		for(int i=1; i <= 9; i++){
	%>
			<tr>
	<%		for(int j = 1; j <= 9; j++){
				if(i==1){
		%>	
					<td align="center"><%=j%>단</td>		
		<%
				}else{	
		%>
					<td align="center"><%=i%>*<%=j%>=<%=i*j%></td>
		<%	
				}
			}
	%>
	</tr>
	<% 
		}
	%>
</table>
</body>
</html>