package com.bit.xml;

import java.io.IOException;
import java.sql.*;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpAdd extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		Enumeration<String> enu=req.getParameterNames();
//		while(enu.hasMoreElements()) {
//			String name=enu.nextElement();
//			System.out.println(name+":"+req.getParameter(name));
//		}
		//어차피 받기만 하면 되니까 req만 씀
		req.setCharacterEncoding("utf-8");
		
		int empno=Integer.parseInt(req.getParameter("empno"));
		String ename=req.getParameter("ename");
		String job=req.getParameter("job");
		int mgr=Integer.parseInt(req.getParameter("mgr"));
		int sal=Integer.parseInt(req.getParameter("sal"));
		int deptno=Integer.parseInt(req.getParameter("deptno"));
		
		String sql="insert into emp values (?,?,?,?,sysdate,?,null,?)";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String driver="oracle.jdbc.OracleDriver";
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setInt(4, mgr);
			pstmt.setInt(5, sal);
			pstmt.setInt(6, deptno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
