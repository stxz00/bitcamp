<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%//어제는 백엔드 오늘은 프론트엔드 측임. 백엔드는 슬러시다음이 내껀데
	//프론트엔드는 브라우저 입장에서는 day07이 컨텍스트인지 폴더인지 모름
		// /부터가 루트이기 때문. 그렇기 때문에 이렇게 day07 까지해서
			// 절대경로를 설정함. %>
		<%
			String paths=application.getContextPath();
			System.out.println(paths);
			
			String path=request.getParameter("path");
		%>
		<tr>
			<td bgcolor="gray">
				<a href="<%=path %>index.jsp">[HOME]</a>
				<a href="<%=path %>intro.jsp">[INTRO]</a>
				<a href="<%=path %>bbs/list.jsp">[B B S]</a>
				<a href="#.jsp">[LOGIN]</a>
			</td>
		</tr>
		<tr>
			<td>
				<!-- 내용시작 -->
