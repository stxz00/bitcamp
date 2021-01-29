package com.bit;

import java.sql.*;

public class MyOracle {
	private static Connection conn=null;
	private MyOracle(){}
	private static Connection getConnection() {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
	
		try {
			if(conn==null || conn.isClosed()) {
				Class.forName(driver);
				conn=DriverManager.getConnection(url,user,password);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
