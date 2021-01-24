package com.bit.day16;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex11 extends Frame {
	
	public Ex11(){
		BorderLayout bd = new BorderLayout();
		
		
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(7,1));
		Panel p2 = new Panel();
		Label la1 = new Label("이름                                    ");
		p2.add(la1);
		p2.add(new TextField(20));
		p1.add(p2);
		
		Panel p3 = new Panel();
		Label la2 = new Label("성별                                                             ");
		p3.add(la2);
		CheckboxGroup cbg1 = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("남자",false,cbg1);
		Checkbox cb2 = new Checkbox("여자",false,cbg1);
		p3.add(cb1);
		p3.add(cb2);
		p1.add(p3);
		
		
		Panel p4 = new Panel();  
		p4.add(new Label("주민번호                         "));
		p4.add(new TextField(7));
		p4.add(new Label("-"));
		p4.add(new TextField(7));
		p1.add(p4);
		
		
		Panel p5 = new Panel();
		p5.add(new Label("주소"));
		p1.add(p5);
		
		Panel p6 = new Panel();
		p6.add(new Label("전화번호"));
		p1.add(p6);
		
		Panel p7 = new Panel();
		p7.add(new Label("취미"));
		p1.add(p7);
		
		Panel p8 = new Panel();
		p8.add(new Label("자기소개"));
		p1.add(p8);
		
		TextArea ta = new TextArea();
		
		add(p1,BorderLayout.NORTH);
		add(ta,BorderLayout.CENTER);
		
		setLocation(100,100);
		setSize(400,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();
	}
}
