<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>랄로-트게더</title>
<% 
	System.out.println(session.getAttribute("loginResult")); 
	if(session.getAttribute("loginResult")==null){
		response.sendRedirect("login.jsp");
	}
%>
</head>
<body bgcolor="#FFFAFA">
	<table width="1120" border="0" cellspacing="12" align="center">
		<tr>
			<td align="left">
				<form action="https://tgd.kr/">
					<input type="image" src="imgs/logo_new.png">
				</form>	
			</td>
			
			<td align="right" width="900">
				
				<form action="#.jsp">
					<% 
					if(session.getAttribute("loginResult")==null){
						%>
						<a href="login.jsp" style="color:gray">[로그인]</a>
					 <% 
					}else{
					%>
						<a href="logout.jsp" style="color:gray">[로그아웃]</a>
					<%
					}
					%>
					 <a href="logadd.jsp" style="color:gray">[회원가입]</a> 
					<input width="300" type="text" name="content" value="트게더 검색" style="color:gray">
					<input width="17" type="image" name="" src="imgs/doc.png">
				</form>
			</td>
		</tr>
		<tr>
			<td colspan="2" width="100%">
				<img alt="" src="imgs/top.png" width="100%">
			</td>
		</tr>
	</table>
	<br>
	<table width="1100" align="center">
		<tr>
			<td width="300">
			<table border="0" cellspacing="0" bordercolor="#FFFAFA">
				<tr>
				 <th bgcolor="#6600CG" width="100%" height="30" style="color:white" width="99%"> &nbsp;&nbsp;<img alt="" src="imgs/one.png"> 트게더 전체 메뉴&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/A.png"> 전체 글 보기</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/B.png"> 스트리머 게시판</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/C.png"> 커뮤니티</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/H.png"> 핫클립</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/link.png"> 트게더 랭킹</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/link.png"> 게임대회</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/P.png"> 방송홍보</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/U.png"> 구인구직</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/Q.png"> Q&A</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/T.png"> 방송 TIP</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/N.png"> 공지사항</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/E.png"> 이벤트</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/S.png"> 건의/신고</td>
				</tr>
				
				<tr>
					<td bgcolor="white" ><img alt="" src="imgs/gwanggo.png" width="100%"></td>
				</tr>
				
			</table>
			</td>
			

			<td  bgcolor="white" align="left" valign="top" width="1200">
				<table width="98%" height="90%" align="center">
					<tr>
						<td align="left" width="6000" height="50" style="font-size: 25px;">
						<a href="index.jsp" style="text-decoration:none">랄로</a>
						<img alt="" src="imgs/rank.png">
						<img alt="" src="imgs/human.png">
						</td>
						<td rowspan="3" align="right">
						<img alt="" src="imgs/ral.png" width="50%" align="middle">
						</td>
					</tr>
					<tr>
						<td bgcolor="#F5F5F5" >
						</td>
					</tr>
					<tr>
						<td style="color:#191970">
						<img alt="" src="imgs/star.png"> 즐겨찾기 (2,034) 
						<img alt="" src="imgs/trop.png"> <a href="https://ranking.tgd.kr/" style="text-decoration:none">랭킹</a>
						<img alt="" src="imgs/info.png"> <a href="https://tgd.kr/s/aba4647/profile" style="text-decoration:none">소개</a>
						<img alt="" src="imgs/icon.png"> <a href="https://www.twitch.tv/aba4647" style="text-decoration:none">채널</a>
						<img alt="" src="imgs/sce.png"> <a href="https://tgd.kr/s/aba4647/schedule" style="text-decoration:none">스케줄</a>
						<img alt="" src="imgs/gal.png"> <a href="https://tgd.kr/s/aba4647?gallery=1" style="text-decoration:none">갤러리</a>
						<img alt="" src="imgs/clip.png"> <a href="https://tgd.kr/clips?streamer_id=29654002" style="text-decoration:none">클립</a>
						</td>
					</tr>
					
					<tr>
						<td bgcolor="gray" colspan="3" width="500">
						<img alt="" src="imgs/gwanggo2.png" width="100%">
						</td>
					</tr>
					
					<tr>
						<td>
							<h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;랄로-새 글 작성하기</h1>
							<form action="addinsert.jsp" method="post">
							<center>
							<table>
								<tr>
									<td align="center" style="font-size: 15pt">제목</td>
									<td><input type="text" name="sub" size="41" style="font-size: 15pt"></td>
								</tr>
								<tr>
									<td></td>
									<td><textarea rows="10" cols="44" name="content" style="font-size: 15pt">내용을 작성해주세요.</textarea></td>
								</tr>
								<tr>
									<td colspan="2" align="center">
									<input type="submit" value="글쓰기" style="font-size: 15pt">	
									</td>
								</tr>
							</table>
							</center>
							</form>
						</td>
					</tr>
					
				</table>
			</td>
		</tr>
	</table>
	<center>
		<p>&copy; 2017-2021 트게더</p>
		<p>이용약관 | 개인정보취급방침 | 인재 채용 중 | 광고문의 | 고객센터</p>
		<p>트게더는 Twitch에서 운영하는 사이트가 아닙니다.</p>
		<p>모바일버전으로 전환하기</p>
	
	
	</center>
	
	
</body>
</html>