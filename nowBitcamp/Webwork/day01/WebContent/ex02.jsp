<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Date,java.util.*"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- html 주석 -->
	<h1>jsp page test</h1>
	<% //여기부터는 자바 언어 사용 가능
	//html File과 jsp File의 차이점은 jsp는 이렇게 자바 사용이 가능한거임
	//주석작성
	//Date date = new Date();
	//System.out.println(date);
	//main이라고 생각하면 됨 그래서 메소드가 여기서 안되는거
	int a = 1234;
	for(int i = 0; i <10; i++){
	%>
		<p>출력<%=i+1 %><%=a %></p> 
		<%//이렇게 %=하면 브라우저에 i+1이 출력됨!
			//이게 바로 표현식임!(out.print)
		%>
	<% 
	
	}
	//클라이언트가 새로운 페이지로 갈때마다 웹서버에 새롭게 요청해서 어플리케이션 서버->데이터베이스->어플리케이션서버->웹서버->웹브라우저에 보냄
	//자바의 코드로 동적 페이지를  만드는 것
	//페이지를 들어올때마다 데이터베이스를 통하여 변해야할 것이 있어야 한다면 자바를 이용해서 동적으로 행함 근데 바로 쏴줄지, 자바에게 요청해서 할 지는 어플리케이션 서버(톰캣, 현재 우리 톰캣은 웹서버와 어플리케이션 서버가 둘 다 통합되어있음!)에서 jsp를 통하여 웹서버에게 행동을 보내주고 웹서버는 이걸 브라우저에 쏴줌(즉, 웹서버는 IO임 -> 소스를 보면 자바의 행위들이 없잖음!) 그래서 자바는 어플리케이션과 데이터베이스까지만 수행함~ 
	// 자바는 객체 지향언어, 처음 생성한 객체를 요청할 때마다 객체를 재사용 하는것 즉, 새롭게 할 필요 없어서 처음에만 클래스파일 받고 생성자 만들기 때문에 느리고 계속 재사용해서 빠르고 부하가 매우 적음.
	// 객체는 서버가 사라질때까지 남아있음.
	// jsp는 스크립트 방식.
	// html은 인터프리터 언어, jsp는 자바언어인데 jsp는 인터프러터 처럼 새로고침했을 때 자동으로 바꿔줌. 이는 어플리케이션 서버(와스(was)컨테이너)에서 자바쪽에서 변경된 걸 알아서 자동으로 처리해줌(어플리케이션 서버에서 함, 소스파일 만들고 컴파일도 하는)
	
	%>
	<%!
	int a;
	class test{};
	%>
	
</body>
</html>

