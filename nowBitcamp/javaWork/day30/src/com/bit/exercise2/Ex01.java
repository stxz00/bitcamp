package com.bit.exercise2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {
	public static void main(String[] args) {
		String sql = "select ename, job, sal from emp order by ename desc";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Properties prop = new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		OracleDriver driver;
		driver = new OracleDriver();
		Connection conn = null;
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,prop);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
					int num = 0;
				while(true) {
					try {
						System.out.print(rs.getString(1) + "\t");
						System.out.print(rs.getString(2) + "\t");
						System.out.println(rs.getString(3) + "\t");
						System.out.println(rs.getString(4));
						System.out.println(rs.getString(5));
					}catch(SQLException e) {
						break;
					}
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn != null) {conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
