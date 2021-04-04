package com.bit.emp.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MariaDb;

public class EmpDao {
	
	
	public static void main(String[] args) {
		EmpDao me=new EmpDao();
		EmpDto2 bean=me.selectOne(1);
		System.out.println(bean!=null);
		System.out.println(bean.getEmpno()==1);
	}
	
	public EmpDto2 selectOne(int empno) {
		EmpDto2 bean=new EmpDto2();
		String sql="select * from emp where empno=?";
		
		try {
			PreparedStatement pstmt=MariaDb.getConnection().prepareStatement(sql);
			pstmt.setInt(1, empno);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				bean.setEmpno(rs.getInt("empno"));
				bean.setEname(rs.getString("ename"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				bean.setDeptno(rs.getInt("deptno"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(MariaDb.getConnection()!=null)
				MariaDb.getConnection().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return bean;
	}
	
	public List<EmpDto2> selectAll(){
		String sql="select * from emp";
		List<EmpDto2> list=new ArrayList<EmpDto2>();
		try {
			PreparedStatement pstmt=MariaDb.getConnection().prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				EmpDto2 bean=new EmpDto2();
				bean.setEmpno(rs.getInt("empno"));
				bean.setEname(rs.getString("ename"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				bean.setDeptno(rs.getInt("deptno"));
				list.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(MariaDb.getConnection()!=null)
				MariaDb.getConnection().close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
}
