package com.bit.util;

import java.sql.*;

public class MariaDb {
	private static Connection conn;
	private static String driver="org.mariadb.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/xe";
	private static String user="scott";
	private static String password="tiger";
	
	private MariaDb() {}
	
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
	
	public static Connection getConnection() {
		try {
			if(conn==null || conn.isClosed()) {
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
