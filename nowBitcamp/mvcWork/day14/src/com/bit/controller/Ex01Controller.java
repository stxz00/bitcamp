package com.bit.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("run Ex01Controller...");
		//하나의 서블릿이 2개 이상의 url-pattern을 가질 수 있다
		//존재하지 않은 디렉토리, 확장자가 들어가도 문제없다.
		//확장자가 없어도 된다!
		System.out.println("param1="+this.getInitParameter("param1"));
		//서블릿에 파람을 줄 수 있다.
		//파람네임들을 모를때 전부 출력 가능.
		Enumeration<String> enu=this.getInitParameterNames();
		while(enu.hasMoreElements()) {
			String paramName=enu.nextElement();
			System.out.println(paramName+"="+this.getInitParameter(paramName));
		}
		System.out.println("-----------------------------------------");
		//파람을 공통적으로 사용해야한다면 context-param에 쓰면 됨
		ServletContext cntxt=req.getServletContext();
		String val1=cntxt.getInitParameter("param1");
		System.out.println("context init param1 ="+val1);
	}
}
