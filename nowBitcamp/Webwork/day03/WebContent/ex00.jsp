<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>test page</h1>
	<%
		int a;
		a=1234;
		out.println(a);
		//D:\bitcamp(academy)\nowBitcamp\WebWork\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\day03\org\apache\jsp\index_jsp.java 을 실행해줌
		//여기서 변동 내역 등 확인하고 변동하지 않으면 그대로 실행되도록 함
		//WEB-INF은 접근 불가능한 곳이므로 여기에 텍스트나 그런거 만드면 그 텍스트는 실행 안됨
		// http://localhost:8080/day03/index.jsp 에서 8080/에서 /는 루트, day03이 컨텍스트
		// 우리가 만든 웹 배포방법 : 프로젝트 우클릭->Export ->WAR file -> 경로 선택후 피니시 하고 그것을 c드라이브 톰캣 ->웹앱스에 그대로 올리면 알아서 풀리고 브라우저에 접속해보면 나옴! 지울려면 먼저 WAR파일 먼저 지운 후에 디렉토리를 지워야함
		//다른 배포방법 localhost:8080/ 접속 manager에 들어가서 WAR파일 업로드 시키면 됨. 애플리케이션들에서 중지나 시작이 가능하고 제거를 누르면 없어짐. 단, 실제로 사용하지 않음
		//원래 톰캣을 설치하면먼 웹액스의 docs manager Root 폴더 다 지움. 브라우저로 너무 쉽게 서버에 접속이 가능해버리니까 이를 막음. 그래서 위 방식을 선호함
		// 와르 파일 받는 또다른 방법은 day03 cmd에서 jar.exe 실행 ->cd WebContent->jar cf test2.war WebContent 등 하면 되는데 그냥 이클립스가 편함
		// 내장 객체는  //D:\bitcamp(academy)\nowBitcamp\WebWork\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\day03\org\apache\jsp\index_jsp.java 에서 변수명들이 내장 객체임(내가 타이핑하지 않았던 것들)
		// 내장 객체들이란 스크립트릿 내에서 쓸 수 있는 변수들을 말한다!		
		
		
	%>
</body>
</html>