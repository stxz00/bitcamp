<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 자바스러운 코드가 빠지는 대표적인 언어 표현 방식을 심플하게 하여
	코드의 양을 줄임.
	처음부턴 서블릿이 지원하지 않았음. 
	최소한의 연산,반복 등을 대상하는게 아닌 표현식이다.(결과 출력용)
	제어적인 측면은 jstl이다. 둘이 병행함
-->
	<h1> EL 연산</h1>
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
				<td>사칙연산(+)</td>
				<td>＄{1+2+3}</td>
				<td>${1+2+3}</td>
				<td><%=1+2+3 %></td>
			</tr>
			<tr>
				<td>사칙연산(-)</td>
				<td>＄{5-2}</td>
				<td>${5-2}</td>
				<td><%=5-2 %></td>
			</tr>
			<tr>
				<td>사칙연산(*)</td>
				<td>＄{5*2}</td>
				<td>${5*2}</td>
				<td><%=5*2 %></td>
			</tr>
			<tr>
				<td>사칙연산(/)</td>
				<td>＄{5 div 2}</td>
				<td>${5 div 2}</td>
				<td><%=5/2 %></td>
			</tr>
			<tr>
				<td>사칙연산(%)</td>
				<td>＄{5 mod 2}</td>
				<td>${5 mod 2}</td>
				<td><%=5%2 %></td>
			</tr>
			<tr>
				<td>동등비교</td>
				<td>＄{1==1}</td>
				<td>${1 eq 1}</td>
				<td><%=1==1 %></td>
			</tr>
			<tr>
				<td>비교</td>
				<td>＄{5 lt 2}</td>
				<td>${5 lt 2}</td>
				<td><%=5<=2 %></td>
			</tr>
			<tr>
				<td>비교</td>
				<td>＄{5 gt 2}</td>
				<td>${5 gt 2}</td>
				<td><%=5>=2 %></td>
			</tr>
			<tr>
				<td>비교</td>
				<td>＄{5 lt 2}</td>
				<td>${5 le 2}</td>
				<td><%=5<=2 %></td>
			</tr>
			<tr>
				<td>비교</td>
				<td>＄{5 gt 2}</td>
				<td>${5 ge 2}</td>
				<td><%=5>=2 %></td>
			</tr>
	</table>
</body>
</html>