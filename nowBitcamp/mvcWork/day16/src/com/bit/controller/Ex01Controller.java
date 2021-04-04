package com.bit.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.dept.model.DeptDao;

public class Ex01Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * System.out.println("Ex01 run..."); //welcome-file을 바꾸면 디폴트가 바뀜. 하지만 톰캣은 잘 안되는
		 * 경우가 많음 DeptDao dao=new DeptDao(); //dao.testConnection(); try {
		 * dao.selectAll();
		 * 
		 * } catch (SQLException e) { // TODO Auto-generated catch block
		 * e.printStackTrace();
		 * 
		 * }
		 */
		String view=getInitParameter("viewName");
		RequestDispatcher rd=req.getRequestDispatcher(view+".jsp");
		rd.forward(req, resp);
	}
}
