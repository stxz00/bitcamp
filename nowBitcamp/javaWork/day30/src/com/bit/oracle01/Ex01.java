package com.bit.oracle01;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.StatementEvent;

import oracle.jdbc.driver.OracleDriver;

public class Ex01 {
	
	public static void main(String[] args) {
		//jdbc:oracle:<drivertype>:@<database>
		//jdbc:oracle:thin:@myhost:1521:xe
//		String sql = "select deptno, dname from dept where deptno=10";
//		String sql = "select deptno, dname  from dept";
//		String sql = "select ename, job from emp where sal>=3000";
//		String sql = "select deptno, loc from dept";
		String sql = "select deptno,dname,loc from dept";
		String url = "jdbc:oracle:thin:@localHost:1521:xe";
		
		java.util.Properties prop = new Properties();
		//외부 파일을 자바시스템으로 로드하는 것, 파일 입출력을 지원한다, Map 컬렉션(key,value)으로 저장한다(Hashtable의 하위클래스)
		//응용 프로그램의 구성 가능한 파라미터들을 저장하기 위해 자바의 관련 기술을 주로 사용하는 파일 확장자
		
		prop.setProperty("user", "scott"); //user와 password는 정해진 키값임!!
		prop.setProperty("password", "tiger");
		
		oracle.jdbc.driver.OracleDriver driver;
		driver = new OracleDriver();
		
		Connection conn = null;
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url,prop); //연결할 주소와 포트, 아이디와 비밀번호 입력
//			System.out.println(conn); //객체를 담았는지 확인함
			//이렇게 현재 오라클 접속 완료
			java.sql.Statement stmt = conn.createStatement();  
			//자바와 DB간의 서로간 전달역할을 해줌
			ResultSet rs = stmt.executeQuery(sql);
			//전달받은 내용 결과 Set으로 받음(IO작업해주는것)
//			rs.next(); //커서를 이동
//			System.out.println(rs.next());
//			System.out.println(rs.getString(1)); //1번째칼럼
//			System.out.println(rs.getString(2)); //2번째칼럼
//			System.out.println(rs.next());
			
			while(rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println(rs.getString(3));
			}
			//rs 또한 다 쓰면 다시 돌려서 만들어야함 rs = stmt.executeQuery(sql);
			
			
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
