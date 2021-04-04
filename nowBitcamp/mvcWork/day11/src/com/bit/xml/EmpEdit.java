package com.bit.xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpEdit extends HttpServlet {
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPut...");
		//안됨 String id=req.getParameter("id");
		//데이터를 줘도 null
		//리퀘스트get파라미터는 타입이 겟과 포스트일때만 가능.
		//나머지는 안됨
		InputStream is=req.getInputStream();
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("param id:"+br.readLine()); 
		// get과 post방식 외에는 br.readLine()을 짤라서 써야할 수밖에 없음
		// br.readLine()에서는 원하는 데이터 값 아무렇게나 받아올 수 있어서
		// 그점에서는 좋음
		//서블릿에서는 매우 귀찮아서 안쓰는 게 나음
	}
}
