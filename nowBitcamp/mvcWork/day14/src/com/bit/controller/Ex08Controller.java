package com.bit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex08Controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
		//에러는 보내고 화면은 보냄(헤더에 에러상태만 바꿈)
		//resp.setContentType("application/json");
		//getJSON으로 받을거니 안해도 상관이 없음 
		//위에를 해주면 받을때 type을 기재 안해도 됨.
		resp.setHeader("Staus Code", "HTTP/1.1 404 Not Found");
		resp.setHeader("content-Type", "application/json");
		//셋콘텐트타입이랑 같은데 상위개념인거.
		PrintWriter out=resp.getWriter();
		out.print("{\"root\":[{\"key\":\"val\"}]}");
		//out.println("<h1>abcdefg</h1>");
		//resp.sendError(HttpServletResponse.SC_NOT_FOUND);
		//우리가 보는 진짜 에러화면을 보냄(헤더에 에러를 포함해서 보냄)
	}
}
