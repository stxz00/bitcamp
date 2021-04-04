<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	VIEW 대신 EL과 JSTL을 사용한다
	자바스러운 코드가 빠지는 대표적인 언어 표현 방식을 심플하게 하여
	코드의 양을 줄임.
	처음부턴 서블릿이 지원하지 않았음. 
	최소한의 연산,반복 등을 대상하는게 아닌 표현식이다.(결과 출력용)
	제어적인 측면은 jstl이다. 둘이 병행함
-->
	<h1> EL language(EL 표현식)</h1>
	<table>
		<thead>
			<tr>
				<th>자료형</th>
				<th>표현방식</th>
				<th>EL</th>
				<th>java</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>숫자(정수)</td>
				<td>＄{1234}</td>
				<td>${1234+1}</td>
				<td><%=1234+1 %></td>
			</tr>
			<tr>
				<td>숫자2(실수)</td>
				<td>＄{3.14+1}</td>
				<td>${3.14+1}</td>
				<td><%=3.14+1%></td>
			</tr>
			<tr>
				<td>문자열(밖에없음)</td>
				<td>＄{'A'}</td>
				<td>${'ABC'}</td>
				<td><%='A' %></td>
			</tr>
			<tr>
				<td>문자열</td>
				<td>＄{"문자열"}</td>
				<td>${"문자열" }</td>
				<td><%="문자열" %></td>
			</tr>
			<tr>
				<td>Boolean</td>
				<td>＄{true}</td>
				<td>${true }</td>
				<td><%=true %></td>
			</tr>
			<tr>
				<td>Boolean</td>
				<td>＄{false}</td>
				<td>${false }</td>
				<td><%=false %></td>
			</tr>
			<tr><%Object obj=null; %>
				<td>NULL</td>
				<td>＄{null}</td>
				<td>${null}</td>
				<td><%=obj %></td>
			</tr>
		</tbody>
	</table>
</body>
</html>