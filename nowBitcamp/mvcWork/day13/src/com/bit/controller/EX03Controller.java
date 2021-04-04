package com.bit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.DeptDao;
import com.bit.model.DeptDto;
//모델2
public class EX03Controller extends	HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// /ex03.html
		// controller model&view 뷰로 어떤 뷰로 사용할지 결정
		//https://hsp1116.tistory.com/9 모델1과 모델2 차이
		
		//model
		DeptDao dao=new DeptDao();
		List<DeptDto> list=dao.getList();
		req.setAttribute("alist", list);
		
		// view
		RequestDispatcher rd=null;
		rd=req.getRequestDispatcher("Ex03.jsp"); //뷰를 사용할 뷰 네임 
		
		rd.forward(req, resp); //이제 jsp로 직접 접근이 아닌 이 모델을 통해서 접근 가능
		//forward로 전달
	}
}
