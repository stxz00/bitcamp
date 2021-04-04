package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.DeptDao;

public class DeptController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DeptDao dao=new DeptDao();
		req.setAttribute("alist", dao.getList());
		RequestDispatcher rd=null;
		rd=req.getRequestDispatcher("list.jsp"); 
		//그냥 ../없이 하면 404오류 찾을 수 없음(이전꺼)
		//이는 dept아래에 한 뎁스 더 간것.
		rd.forward(req, resp); 
		
	}
	
}
