<%@page import="java.sql.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>����-Ʈ�Դ�</title>
<% System.out.println(session.getAttribute("loginResult")); 
	String num=request.getParameter("num");
	String sql="update exercise02_guest set cnt=cnt+? where num="+num;
	System.out.println(sql);
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	String driver="oracle.jdbc.OracleDriver";
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	String sub=null;
	String content=null;
	String id=null;
	Date nalja=null;
	String ref=null;
	int cnt=0;
	Class.forName(driver);
	try{
		conn=DriverManager.getConnection(url,user,password);
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, 1);
		pstmt.executeUpdate();
		pstmt.close();
		
		sql="select * from exercise02_guest where num="+num;
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		if(rs.next()){
			sub=rs.getString("sub");
			content=rs.getString("content");
			id=rs.getString("id");
			nalja=rs.getDate("nalja");
			cnt=rs.getInt("cnt");
			ref=rs.getString("ref");
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	
	class Re{
		String id,content;
		java.util.Date nalja;
	}
	
	ArrayList<Re> relist=new ArrayList<Re>();
	sql="select * from exercise02_guest where ref="+num+" and not ord=0 order by ord asc";
	int count=0;
	try{
		conn=DriverManager.getConnection(url,user,password);
		
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			count++;
			Re re=new Re();
			re.id=rs.getString("id");
			re.content=rs.getString("content");
			re.nalja=rs.getDate("nalja");
			relist.add(re);
		}
	}finally{
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
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
						<a href="login.jsp" style="color:gray">[�α���]</a>
					 <% 
					}else{
					%>
						<a href="logout.jsp" style="color:gray">[�α׾ƿ�]</a>
					<%
					}
					%>
					 <a href="logadd.jsp" style="color:gray">[ȸ������]</a> 
					<input width="300" type="text" name="content" value="Ʈ�Դ� �˻�" style="color:gray">
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
				 <th bgcolor="#6600CG" width="100%" height="30" style="color:white" width="99%"> &nbsp;&nbsp;<img alt="" src="imgs/one.png"> Ʈ�Դ� ��ü �޴�&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/A.png"> ��ü �� ����</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/B.png"> ��Ʈ���� �Խ���</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/C.png"> Ŀ�´�Ƽ</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/H.png"> ��Ŭ��</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/link.png"> Ʈ�Դ� ��ŷ</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/link.png"> ���Ӵ�ȸ</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/P.png"> ���ȫ��</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/U.png"> ���α���</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/Q.png"> Q&A</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/T.png"> ��� TIP</td>
				</tr>
				
				<tr>
					<td bgcolor="#E6E6FA" height="2"></td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/N.png"> ��������</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/E.png"> �̺�Ʈ</td>
				</tr>
				
				<tr>
					<td bgcolor="white" height="25">&nbsp;&nbsp;<img alt="" src="imgs/S.png"> ����/�Ű�</td>
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
						<a href="index.jsp" style="text-decoration:none">����</a>
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
						<img alt="" src="imgs/star.png"> ���ã�� (2,034) 
						<img alt="" src="imgs/trop.png"> <a href="https://ranking.tgd.kr/" style="text-decoration:none">��ŷ</a>
						<img alt="" src="imgs/info.png"> <a href="https://tgd.kr/s/aba4647/profile" style="text-decoration:none">�Ұ�</a>
						<img alt="" src="imgs/icon.png"> <a href="https://www.twitch.tv/aba4647" style="text-decoration:none">ä��</a>
						<img alt="" src="imgs/sce.png"> <a href="https://tgd.kr/s/aba4647/schedule" style="text-decoration:none">������</a>
						<img alt="" src="imgs/gal.png"> <a href="https://tgd.kr/s/aba4647?gallery=1" style="text-decoration:none">������</a>
						<img alt="" src="imgs/clip.png"> <a href="https://tgd.kr/clips?streamer_id=29654002" style="text-decoration:none">Ŭ��</a>
						</td>
					</tr>
					
					<tr>
						<td bgcolor="gray" colspan="3" width="500">
						<img alt="" src="imgs/gwanggo3.png" width="100%">
						</td>
					</tr>
					<tr>
						<td colspan="2" style="font-size: 14pt"><%=sub %></td>
						<td><img alt="" src="imgs/img.png" width="100%" ></td>
					</tr>
					<tr>
						<td colspan="3" style="font-size: 10pt" ><strong><%=id %></strong>��</td>
					</tr>
					<tr>
						<td colspan="3" ><img alt="" src="imgs/line.png" width="100%"></td>
					</tr>
					<tr>
						<td width="200" bgcolor="#F5F5F5" style="font-size: 10pt" colspan="3" height="25" valign="center">&nbsp;&nbsp;<img alt="" src="imgs/time.png"><%=nalja %>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<img alt="" src="imgs/dat.png">100 <img alt="" src="imgs/heart.png">100 <img alt="" src="imgs/eye.png"> <%=cnt %>
						</td>
					</tr>
					<tr>
						<td colspan="3">&nbsp;</td>
					</tr>
					<tr>
						<td colspan="3" height="80" valign="top" style="font-size: 11pt"><%=content.replace("\r\n", "<br>") %>
						<br><br>
						<center>
						<form>
						<input type="image" src="imgs/chu.png" name="img" value="img">
						<input type="image" src="imgs/bi.png" name="img" value="img">
						</form>
						</center>
						</td>
					</tr>
					<tr>
						<td colspan="3" bgcolor="#F5F5F5" height="40">
						<form action="index.jsp">&nbsp;
						<input type="image" src="imgs/index.png" name="img" value="img" align="middle">
						<input type="image" src="imgs/sin.png" name="img" value="img" align="middle">
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						&nbsp;&nbsp;&nbsp;
						<input type="image" src="imgs/scrap.png" name="img" value="img" align="middle">
						</form>
						</td>
					</tr>
					<tr>
						<td colspan="3" height="15"></td>
					</tr>
					<tr>
						<td height="30" style="font-size: 11pt; color: #4B0082" ><img alt="" src="imgs/ch.png"> <strong>��� <%=count %>��&nbsp;&nbsp;&nbsp;<img alt="" src="imgs/hwa.png"></strong></td>
					</tr>
					
					<%
						for(Re re:relist){
					%>
					<tr>
						<td  colspan="3" bgcolor="#F5F5F5" height="40"><img alt="" src="imgs/hu.png" align="top"> <font color="#4B0082" size="3"><%=re.id %></font>&nbsp;<font color="#A5A5A5" size="2">(�۾���)</font>
						 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <font color="#5775E9" size="2">���ƿ� �� <a href="rere.jsp?num=1" style="text-decoration: none; color: #5775E9">����</a> �� </font><font size="2"><%=re.nalja %></font><font color="#5775E9" size="2"> �� �Ű�#</font>
						</td>
					</tr>
					<tr>
						<td height="40" colspan="3" ><%=re.content %></td>
					</tr>
					<% 
						}
					%>
					<tr>
						<td colspan="3" height="40"></td>
					</tr>
					<tr>
						<td colspan="3">
						<form action="reinsert.jsp?num=<%=num %>&ref=<%=ref %>" method="post">
						<img alt="" src="imgs/bar.png" width="37.1%"><br>
						<textarea rows="10" cols="42" name="content">������ �ۼ��� �ּ���</textarea><br>
						<input type="image" src="imgs/dada.png">
						</form>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<center>
		<p>&copy; 2017-2021 Ʈ�Դ�</p>
		<p>�̿��� | ����������޹�ħ | ���� ä�� �� | ������ | ������</p>
		<p>Ʈ�Դ��� Twitch���� ��ϴ� ����Ʈ�� �ƴմϴ�.</p>
		<p>����Ϲ������� ��ȯ�ϱ�</p>
	
	
	</center>
	
	
</body>
</html>