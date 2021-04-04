package com.bit.sts01.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.bit.util.Bit;

// POJO
@Bit(value="test",arr= {"","",""})
@Controller
public class Ex01Controller{

	@RequestMapping("/ex01.do")
	public String ex01(Model model) throws Exception {
		//System.out.println(this.getClass().getMethods()[0]);
		//return new ModelAndView("ex01");
		//System.out.println(model.getParameter("idx"));
		model.addAttribute("msg", "ABDCEFG");
		return "ex01";
	}
	@RequestMapping("/ex02.do")
	public String ex02(){
		return "ex02";
	}
	@RequestMapping("/ex03.do")
	public void ex033333333333() {}
	
	@RequestMapping("/test/ex04")
	public String ex04() {
		return "ex04";
	}
	//경로를 다르게 할려면 리턴값에 실제 경로를 넣어주면 된다.
}
