package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션 방법(xml을 사용하지 않음!)
//원칙적으론 xml을 해야하나
//어노테이션이 일을하는게 아닌 was컨테이너가 역으로 xml에 입력을 함!!
//즉 xml을 정의한다고 하면 됨
//편의성은 어노테이션, 관리측면에서는 어노테이션을 찾기 어려우니 xml
//근래에선 어노테이션을 더 많이 씀! 설계로 인해 단점을 보완함
@WebServlet({"/ex02.bit","/ex02.do"})
public class Ex02Controller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Ex02 run..");
		
	}
}
//was컨테이너가 각 dao를 통해 계속 하나뿐인 데이터베이스를 동시접속 하면
//데이터베이스가 죽어버리므로 dao들을 conenection pool에 연결하여 db에 요청하면 끝
//connection pool 제공 방법
//1.tomcat - 오늘 할 것
//2.other
//3.frame
//4.직접구현