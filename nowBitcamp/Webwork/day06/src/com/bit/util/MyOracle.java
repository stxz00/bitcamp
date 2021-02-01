package com.bit.util;

import java.sql.*;

public class MyOracle {
	private static Connection conn;
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user="scott";
	private static String password="tiger";
	private MyOracle(){}
	public static Connection getConnection() {
		try {
			if(conn==null||conn.isClosed()) {
				Class.forName(driver);
				conn=DriverManager.getConnection(url,user,password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
}
