<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�α���</title>
<%
	if(request.getMethod().equals("POST")){
		request.setCharacterEncoding("euc-kr");
		String id=request.getParameter("id");
		System.out.println("id="+id);
		String pw=request.getParameter("pw");
		if(!id.equals("") && !pw.equals("")){
			String sql="select count(*) from exercise02_user where id='"+id+"' and pw='"+pw+"'";
			System.out.println(sql);
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			String driver="oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			Connection conn=null;
			ResultSet rs=null;
			String islogin=null;
			try{
				conn=DriverManager.getConnection(url,user,password);
				rs=conn.createStatement().executeQuery(sql);
				if(rs.next()) islogin=rs.getString(1);
			}finally{
				if(rs!=null)rs.close();
				if(conn!=null)conn.close();
			}
			if(islogin!=null){
				session.setAttribute("loginResult", true);
				session.setAttribute("loginID", id);
				response.sendRedirect("index.jsp");
			}
		}else if(id.equals("") || pw.equals("")){
			response.sendRedirect("index.jsp");
		}
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
					<a href="login.jsp" style="color:gray">[�α���]</a> <a href="logadd.jsp" style="color:gray">[ȸ������]</a> 
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
						<img alt="" src="imgs/gwanggo2.png" width="100%">
						</td>
					</tr>
					<tr>
						<td style="font-size: 20px;">
							<center>
								<br><br>
								<img alt="" src="imgs/logo3x.png" width="30%"><br><br>
								<img alt="" src="imgs/login-text.png" width="30%"><br><br><br>
								<img alt="" src="imgs/loginn.png" width="30%"><br><br>
								<img alt="" src="imgs/wq.png" width="30%"><br><br>
								<form action="login.jsp" style="color:#4B0082" method="post">
									<strong>ID</strong> : &nbsp;<input type="text" size="25" name="id" ></input><br>
									<strong>PW</strong> : <input type="password" size="25" name="pw"></input><br><br>
									<input type="submit" value="�α���" >
								</form>
							</center>
						</td>
					</tr>

	</table>
	</table>
	<center>
		<p>&copy; 2017-2021 Ʈ�Դ�</p>
		<p>�̿��� | ����������޹�ħ | ���� ä�� �� | �������� | ��������</p>
		<p>Ʈ�Դ��� Twitch���� ��ϴ� ����Ʈ�� �ƴմϴ�.</p>
		<p>����Ϲ������� ��ȯ�ϱ�</p>
	
	
	</center>
	
	
</body>
</html>