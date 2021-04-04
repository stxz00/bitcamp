package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex05Controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd=req.getRequestDispatcher("./test2/ex07.jsp");//가상부모폴더 위로 가서 찾아야하니
		rd.forward(req, resp);
		//resp.sendRedirect("./test2/ex07.jsp"); 
		// 오류:/을 넣으면 재요청할때 브라우저는 루트를 모름 
		// 프론트엔드에(브라우저)서의 /는 ip 포트번호의 루트이기때문 컨텍스트
		//포워드는 내가 직접 이동, 센트리다이렉트는 브라우저가 이동
		//fowra와 리다이렉트의 차이
		//내가 ex05라고 요청할때
		//네트워크상에서는  ex05.bit로 요청 갔다가 ex05.jsp 요청(두번요청)
		//즉 재요청이고 ex05.bit을 요청하고 리스폰스하고나서
		// ex05.jsp을 요청하고 리스폰스함!
		//포워드는 ex05.bit만 요청(req)하면 ex05.jsp을 가져와서 리스폰스함.
		
		//이는 리퀘스트의 값을 실었다면 의미가 굉장히 큼(값의 유지 유무)
		//셋어트리뷰트겟어트리뷰트가 그동안 가능했던건 한번만 리퀘스트했기때문
		//즉 동일 리퀘스트다
		
		
	}
}
