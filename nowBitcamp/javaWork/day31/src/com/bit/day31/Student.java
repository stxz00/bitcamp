package com.bit.day31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import oracle.jdbc.driver.OracleDriver;

public class Student {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램 ver 0.8.0");
		String menu = "1.조회 2.입력 0.종료";
		String input = null;
		while(true) {
			System.out.print(menu);
			input = sc.nextLine();
			if(input.equals("0")) break;
			else if(input.equals("1")) list();
			else if(input.equals("2")) add();
		}
	}
	public static void list() {
		System.out.println("----------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학");
		System.out.println("----------------------------------------");
		String sql = "select * from student01";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Properties prop = new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,prop);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString(1) + "\t" +rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null){rs.close();}
				if(stmt != null){stmt.close();}
				if(conn != null){conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void add() {
		String sql = "insert into student01 values(";
		String input = null;
		System.out.print("학번>");
		input = sc.nextLine();
		sql+=input;
		System.out.print("이름>");
		input = sc.nextLine();
		sql+=",'" + input + "'"; 
		System.out.print("국어>");
		input = sc.nextLine();
		sql+="," + input;
		System.out.print("영어>");
		input = sc.nextLine();
		sql+="," + input;
		System.out.print("수학");
		input = sc.nextLine();
		sql+="," + input + ")";
//		System.out.println(sql);
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Properties prop = new Properties();
		prop.setProperty("user", "scott");
		prop.setProperty("password", "tiger");
		OracleDriver driver = new OracleDriver();
		Connection conn = null;
		Statement stmt = null;
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,prop);
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null){stmt.close();}
				if(conn != null){conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
