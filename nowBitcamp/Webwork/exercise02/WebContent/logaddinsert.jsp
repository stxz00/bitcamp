<%@page import="oracle.jdbc.OracleDriver"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<meta http-equiv="refresh" content="3; url=index.jsp">
<title>회원가입 완료</title>
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
					<a href="login.jsp" style="color:gray">[로그인]</a> <a href="logadd.jsp" style="color:gray">[회원가입]</a> 
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
						<td style="font-size: 20px;">
							<center>
								<br><br>
								<%	
									request.setCharacterEncoding("euc-kr");
									String id=request.getParameter("id");
									String pw=request.getParameter("pw");
									String sql="insert into exercise02_user (num,id,pw) values(exercise02_user_seq.nextval"+",'"+id+"','"+pw+"')";
									System.out.println("id="+id);
									System.out.println("pw="+pw);
									System.out.println(sql);
									if(id.equals("")||pw.equals("")){
										response.sendRedirect("logadd.jsp");
									}else{
										String url="jdbc:oracle:thin:@localhost:1521:xe";
										String user="scott";
										String password="tiger";
										String driver="oracle.jdbc.driver.OracleDriver";
										Class.forName(driver);
										Connection conn=null;
										Statement stmt=null;
										try{
											conn=DriverManager.getConnection(url,user,password);
											stmt=conn.createStatement();
											stmt.executeUpdate(sql);
										}finally{
											if(stmt!=null)stmt.close();
											if(conn!=null)conn.close();
										}
									}	
								%>								
								<img alt="" src="imgs/logo3x.png" width="30%"><br>
								<h1 style="color:#4B0082">회원이 되신것을 축하드립니다</h1>
								<img alt="" src="imgs/wq.png" width="30%"><br><br>
								
							</center>
						</td>
					</tr>
		</table>
	</table>
	<center>
		<p>&copy; 2017-2021 트게더</p>
		<p>이용약관 | 개인정보취급방침 | 인재 채용 중 | 광고문의 | 고객센터</p>
		<p>트게더는 Twitch에서 운영하는 사이트가 아닙니다.</p>
		<p>모바일버전으로 전환하기</p>
	
	
	</center>
	
	
</body>
</html>