<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>랄로-트게더</title>
<% System.out.println(session.getAttribute("loginResult")); %>
</head>
<% 
	class Al{
		int num,cont,ref,ord,lev;
		String id,sub,content;
		java.util.Date nalja;
	}

	int total=0;
	int p=1;
	try{
		p=Integer.parseInt(request.getParameter("p"));
	}catch(NumberFormatException e){}

	
	
	
	String sql="select sub,id,nalja from exercise02_guest order by num desc";
	java.util.ArrayList<Al> list=new ArrayList<Al>();
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String driver="oracle.jdbc.driver.OracleDriver";
	Class.forName(driver);
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try{
		conn=DriverManager.getConnection(url,user,password);
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			Al al = new Al();
			al.sub=rs.getString("sub");
			al.id=rs.getString("id");
			al.nalja=rs.getDate("nalja");
			list.add(al);
		}
		
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
%>

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
					<td height="35" bgcolor="#F5F5F5" style="font-size:13px;">&nbsp;<strong style="font-size:9pt;">공지</strong>&nbsp;<img alt="" src="imgs/gong.png">&nbsp;랄로게시판입니다.
						</td>
						<td align="center" width="900" bgcolor="#F5F5F5" style="font-size:13px; color: #4B0082"><img alt="" src="imgs/geder.png"> <strong>트게더</strong>
						</td>
						<td align="center" width="600" bgcolor="#F5F5F5" style="font-size:13px; color: #4B0082"><strong>20/19/18</strong>
						</td>
					</tr>
					<tr>
						<td height="35" bgcolor="#E6E6FA" style="font-size:13px;">&nbsp;<strong style="font-size:9pt;">인기</strong>&nbsp;<img alt="" src="imgs/star2.png">&nbsp;랄로ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
						</td>
						<td align="center" width="900" bgcolor="#E6E6FA" style="font-size:13px; color: #4B0082"><strong>랄로와친구</strong>
						</td>
						<td align="center" width="600" bgcolor="#E6E6FA" style="font-size:13px; color: #4B0082"><strong>20/19/18</strong>
						</td>
					</tr>
					<tr>
						<td height="35" bgcolor="#E6E6FA" style="font-size:13px;">&nbsp;<strong style="font-size:9pt;">인기</strong>&nbsp;<img alt="" src="imgs/star2.png">&nbsp;랄로ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
						</td>
						<td align="center" width="900" bgcolor="#E6E6FA" style="font-size:13px; color: #4B0082"><strong>랄로와친구</strong>
						</td>
						<td align="center" width="600" bgcolor="#E6E6FA" style="font-size:13px; color: #4B0082"><strong>20/19/18</strong>
						</td>
					</tr>
					<tr>
						<td height="35" bgcolor="#E6E6FA" style="font-size:13px;">&nbsp;<strong style="font-size:9pt;">인기</strong>&nbsp;<img alt="" src="imgs/star2.png">&nbsp;랄로ㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ
						</td>
						<td align="center" width="900" bgcolor="#E6E6FA" style="font-size:13px; color: #4B0082"><strong>랄로와친구</strong>
						</td>
						<td align="center" width="600" bgcolor="#E6E6FA" style="font-size:13px; color: #4B0082"><strong>20/19/18</strong>
						</td>
					</tr>
				<% 
					for(int i=0; i<list.size(); i++){
						Al al=list.get(i);
				%>
						<tr>
							<td height="35" style="font-size:13px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img alt="" src="imgs/qq.png">&nbsp;<%=al.sub %>
							</td>
							<td align="center" width="900" style="font-size:13px; color: #4B0082"><strong><%=al.id %></strong>
							</td>
							<td align="center" width="600" style="font-size:13px; color: #4B0082"><strong><%=al.nalja %></strong>
							</td>
						</tr>
				<%
					}
				%>	
					<tr>
						<td height="25" width="300" colspan="3" style="font-size: 20px;">
						<form action="add.jsp" >
							<img alt="" src="imgs/famous.png">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<a href="#.jsp" style="text-decoration: none">[1]</a>
							<a href="#.jsp" style="font-size: 100">[2]</a>
							<a href="#.jsp" style="font-size: 100">[3]</a>
							<a href="#.jsp" style="font-size: 100">[4]</a>
							<a href="#.jsp" style="font-size: 100">[>]</a>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="image" src="imgs/gl.png">
						</form>
						</td>
					</tr>
					<tr>
						<td align="center"  width="300" colspan="2" style="font-size: 15px;">
							<form action="#.jsp" style="float:left;margin:0;" >
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<select name="#" style="font-size: 17px;">
									<option value="sub">제목
									<option value="name">닉네임
								</select>
								<input type="text" width="700" style="font-size: 17px;" value="검색어">
								<input type="image" src="imgs/ww.png" align="bottom" >
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