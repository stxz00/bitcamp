package test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Ex01 {
	static Scanner sc = new Scanner(System.in);
	private static String driver="oracle.jdbc.driver.OracleDriver";
	private static String url="jdbc:oracle:thin:@localhost:1521:xe";
	private static String user="scott";
	private static String password="tiger";
	public static void main(String[] args) {
		System.out.println("학생성적관리프로그램(ver 0.8.0)");
		String menu="1.목록 2.등록 3.정보 4.입력 5.수정 0.종료";
		
		String input=null;
		while(true) {
			System.out.print(menu);
			input=sc.nextLine();
			if(input.equals("0")) break;
			if(input.equals("2")) addStudent();
			else if(input.equals("1")) listStudent();
			else if(input.equals("3")) detailStudent();
			else if(input.equals("4")) addGrade();
			else if(input.equals("5")) editGrade();
		}
		
	}
	
	public static void editGrade() {
		String sql="update grade03 set ";
		System.out.print("학번>");
		String sql2=" where num="+sc.nextLine();
		System.out.print("국어>");
		sql+="kor="+sc.nextLine();
		System.out.print("영어>");
		sql+=", eng="+sc.nextLine();
		System.out.print("수학>");
		sql+=", math="+sc.nextLine();
		sql+=sql2;
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(Connection conn=DriverManager.getConnection(url,user,password);
			Statement stmt=conn.createStatement();){
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void detailStudent() {
		System.out.print("학번>");
		String sql="select num,a.name,a.age,b.kor,b.eng,b.math "
				+ "from student03 A left outer join grade03 B "
				+ "using (num) where num="+sc.nextLine();
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(Connection conn=DriverManager.getConnection(url,user,password);
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sql)){
			if(rs.next()){
			System.out.println("학번 : "+rs.getInt(1));
			System.out.println("이름 : "+rs.getString(2));
			System.out.println("나이 : "+rs.getInt(3));
			System.out.println("국어 : "+(rs.getString(4)==null?"-":rs.getString(4))
					+"점 , 영어 : " +(rs.getString(5)==null?"-":rs.getString(5))
					+"점 , 수학 : "+(rs.getString(6)==null?"-":rs.getString(6))+"점");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void addGrade() {
		String sql="insert into grade03 values(";
		System.out.print("학번>");
		sql+=sc.nextLine()+",";
		System.out.print("국어>");
		sql+=sc.nextLine()+",";
		System.out.print("영어>");
		sql+=sc.nextLine()+",";
		System.out.print("수학>");
		sql+=sc.nextLine()+")";
		System.out.println(sql);
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (Connection conn=DriverManager.getConnection(url,user,password);
			 Statement stmt=conn.createStatement();){
			 stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void listStudent() {
		System.out.println("----------------------------------------");
		System.out.println("학번\t|이름\t|나이");
		System.out.println("----------------------------------------");
		String sql="select * from student03 order by num";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection conn=DriverManager.getConnection(url,user,password);
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);){
			while(rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print("\t|");
				System.out.print(rs.getString(2));
				System.out.print("\t|");
				System.out.println(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------------------------------");
	}
	
	public static void addStudent() {
		System.out.print("이름>");
		String name=sc.nextLine();
		System.out.print("나이>");
		String age=sc.nextLine();
		String sql="insert into student03 values"
				+ "(stu03_seq.nextval,'"+name+"',"+age+" )";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (Connection conn=DriverManager.getConnection(url,user,password);
				Statement stmt=conn.createStatement();){
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
