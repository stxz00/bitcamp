package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex03.bit")
public class Ex03Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cooks=req.getCookies();
		if(cooks!=null) {
			for(int i=0; i<cooks.length; i++) {
				String name=cooks[i].getName();
				String value=cooks[i].getValue();
				req.setAttribute(name, value);
				System.out.println("cookieName:"+name);
				System.out.println("cookieName:"+value);
			}
			
			//localStorage.setItem('key1','val') 다른데 와도 값이 저장
			//localStorage.getItem('key1')
			//sessionStorage.setItem('key1','val')
			//sessionStorage.getItem('key1')
			
			//저장한 데이터는 브라우저 세션 간에 공유됩니다. localStorage는 sessionStorage와 비슷하지만, localStorage의 데이터는 만료되지 않고 sessionStorage의 데이터는 페이지 세션이 끝날 때, 즉 페이지를 닫을 때 사라지는 점이 다릅니다. ("사생활 보호 모드" 중 생성한 localStorage 데이터는 마지막 "사생활 보호" 탭이 닫힐 때 지워집니다.)

//localStorage에 저장한 자료는 페이지 프로토콜별로 구분합니다. 특히 HTTP(http://example.com)로 방문한 페이지에서 저장한 데이터는 같은 페이지의 HTTPS(https://example.com)와는 다른 localStorage에 저장됩니다.
		}
		RequestDispatcher rd=req.getRequestDispatcher("ex03.jsp");
		rd.forward(req, resp);
	}
	
}
