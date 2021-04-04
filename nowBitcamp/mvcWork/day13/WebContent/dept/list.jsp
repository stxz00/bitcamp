<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
    	body>div{
    		margin: 0px auto;
    		padding 0px;
    	}
    	#header{
    	}
    	#header>h1{
    		background-image: url("../imgs/logo.png");
    		background-repeat: no-repeat;
    		text-indent: -999px;
    		
    	}
    	#menu{
    		overflow: hidden;
    		background-color: gray;
    	}
    	#menu>ul{
    		padding: 0px;
    		width: 440px;
    		list-style: none;
    		margin: 0px auto;
    	}
    	#menu>ul>li{
    		width: 100px;
    		float: left;
    		border-top: 2px solid darkgray;
    		border-bottom: 2px solid white;
    		margin: 0px 5px;
    	}
    	#menu>ul>li>a{
    		display: block;
    		height: 30px;
    		line-height: 30px;
    		text-align: center;
    		text-decoration: none;
    		color: white;
    	}
    	#content table,th,td{
    		border-collapse: collapse;
    		border:1px solid gray;
    	}
    	#content table{
    		width: 80%;
    		margin: 0px auto;
    	}
    	#content table>thead{}
    	#content table>thead>tr{}
    	#content table>thead>tr>th{
    		background-color: gray;
    	} 	
    	
    	#content table>tbody{}
    	#content table>tbody>tr:nth-child(2n)>td{
    		background-color: darkgray;
    	}
    	#content table>tbody>tr>td:first-child{
    		width: 60px;
    	}
    	#content table+a{
    		display: block;
    		width: 80%;
    		height: 50px;
    		background-color: gray;
    		border-radius: 10px;
    		text-align: center;
    		line-height: 50px;
    		color: white;
    		font-weight: bold;
    		text-decoration: none;
    		margin: 10px auto;
    		box-shadow: 2px 2px 5px darkgray;
    		background-image: linear-gradient(gray,darkgray,gray);
    		/* 그라디언트 */
    	}
    	#content table>tbody>tr>td>a{
    		display: block;
    		color: #333333;
    		text-decoration: none;   		
    	}
    </style>
    <script type="text/javascript" src="../js/jquery-1.12.4.js">
    </script>
    <script type="text/javascript">
        
    </script>
</head>

<body>
	<div>
		<div id="header">
			<h1>비트교육센터</h1>
		</div>
		<div id="menu">
			<ul>
				<li><a href="../">Home</a></li>
				<li><a href="./list.html">DEPT</a></li>
				<li><a href="../emp/list.html">EMP</a></li>
				<li><a href="../login/login.html">LOGIN</a></li>
			</ul>
		</div>
		<div id="content">
			<h2>dept list</h2>
			<table>
				<thead>
					<tr>
						<th>deptno</th>
						<th>dname</th>
						<th>loc</th>
					</tr>
				</thead>
				<tbody>
					<%@ page import="java.util.*,com.bit.model.DeptDto" %>
					<% List<DeptDto> list= (List<DeptDto>)request.getAttribute("alist");
						for(DeptDto bean:list){
					%>
						<tr>
							<td><a href="detail.html?deptno=<%=bean.getDeptno() %>"><%=bean.getDeptno() %></a></td>
							<td><a href="detail.html?deptno=<%=bean.getDeptno() %>"><%=bean.getDname() %></a></td>
							<td><a href="detail.html?deptno=<%=bean.getDeptno() %>"><%=bean.getLoc() %></a></td>
						</tr>
					<% } %>
				</tbody>
			</table>
			<a href="add.html">입 력</a>
		</div>
		<div id="footer">
			<p>Copyright &copy; 비트캠프 All rights reserved</p>
		</div>
	</div>
    
    <div>box</div>
</body></html>