package com.bit.dept.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class DeptDao {
	Logger log=Logger.getGlobal();
	javax.sql.DataSource dataSource;
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	/*
	 <Resource
	name="jdbc/maria"
	type="javax.sql.DataSource"
	driverClassName="org.mariadb.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/xe"
	username="scott"
	password="tiger"
	minIdle="1"
	maxIdle="10"
	maxActive="5"
	maxWait="-1"
	/>
	 */
	//JNDI(Java Naming and Directory Interface)는 디렉터리 서비스에서 제공하는 데이터 및 객체를 발견(discover)하고 참고(lookup)하기 위한 자바 API다.
	//이제부터는 close를 하면 접속이 끊기는 게 아닌 값을 돌려주는 것
	public DeptDao(){
		try {
//			InitialContext initCon=new InitialContext();
//			javax.naming.Context context=null;
//			context=(Context)initCon.lookup("java:/comp/env");
//			
//			dataSource=(DataSource)context.lookup("jdbc/maria");
			//lookup 파라미터는 규칙임
			InitialContext initCon=new InitialContext();
			dataSource=(DataSource)initCon.lookup("java:/comp/env/jdbc/maria");
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void testConnection() {
		try {
			System.out.println(dataSource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<DeptDto> selectAll() throws SQLException{
		String sql="select * from dept";
		List<DeptDto> list=new ArrayList<DeptDto>();
		try {
			conn=dataSource.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				DeptDto bean=new DeptDto();
				bean.setDeptno(rs.getInt("deptno"));
				bean.setDname(rs.getString("dname"));
				bean.setLoc(rs.getString("loc"));
				System.out.println(bean);
				//log.info(bean.toString());
				//log.warinig(bean.toString()); //오류메세지 출력
				log.setLevel(Level.INFO);
				log.severe("심각");		//콘솔로 확인하는건 이렇게 하면 됨
				log.warning("경고");
				log.info("정보");
				log.config("config");
				log.fine("fine");
				log.finer("finer");
				log.finest("finest");
				list.add(bean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn!=null)conn.close(); //에러 떤짐
		}
		
		return list;
	}
}

/*
 * maxActive 동시에 사용할 수 있는 최대 커넥션 개수(기본값: 100) 
 * maxIdle 커넥션 풀에 반납할 때 최대로 유지될 수 있는 커넥션 개수(기본값: 8) 
 * minIdle 최소한으로 유지할 커넥션 개수(기본값: 0)
 */
