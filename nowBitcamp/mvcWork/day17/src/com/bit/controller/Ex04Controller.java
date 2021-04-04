package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex04.bit")
public class Ex04Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		
		// cookie add id
		Cookie cook=new Cookie("id",id); //동일한 이름으로 동일한 값을 하면 수정
		cook.setMaxAge(60*60*24*7); 
		//지울 수 있는 방법은 시간밖에 없음. 클라이언트쪽이니까!
		resp.addCookie(cook);
		//쿠키의 활용은 자유지만 보안상에 문제가 없는 자료들만 써야함
		//그래서 쿠키 쓸일이 크게 없음
		//30일간 비밀번호 변경하란 메세지 안뜨게 하거나 팝업창 7일간 안보기 그런거!
		
		
		req.setAttribute("cookieID", id);
		RequestDispatcher rd=req.getRequestDispatcher("ex04.jsp");
		rd.forward(req, resp);
	}
}
