package com.bit.step01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Ex01 implements Servlet{
	ServletConfig config;

	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig()");
		return config;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo()");
		return "Info"; //정보전달용
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		System.out.println("init(ServletConfig config)");
		// 최초로 객체를 한번만 찍고 객체를 재사용하고 있음.
		//원격이든 어디든 다른 사용자든 싱클톤으로 계속 재사용하는중
		//WAS컨테이너의 장점
	}

	@Override
	public void service(ServletRequest config, ServletResponse res) throws ServletException, IOException {
		System.out.println("service(ServletRequest req, ServletResponse res)");
		//그래서 서비스만 계속 찍고 있음
		//리스폰스를 받을때 응답하면 됨
		//ex06.html로 바꿔서 보면 나옴. get방식이 아니니 보안이 매우 좋음
		//자바 그대로 다 칠 수 있음.
		//jsp파일이 그럼.
		//만들기 어려우므로 ex02처럼 만듬
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"utf-8\">");
		out.println("</head>");
		out.println("</body>");
		out.println("<h1>hello world</h1>");
		out.println("</body>");
		out.println("</html>");
	}
	
}
