package com.bit.day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JButton;

//컴포넌트 시작
public class Ex07 extends Frame {
	
	public Ex07() {
		String name = "궁서";
		int style = Font.ITALIC; //굵기,기울임 등 0 보통 1 굵음 2 기울임 
		int size = 30;
		java.awt.Font font = new Font(name, style, size);
		//폰트는 디폴트 생성자가 없으로 생성시에 바로 써줘야함
		Panel mainp = new Panel();
		mainp.setLayout(new FlowLayout());
		mainp.setBackground(Color.gray);
		
		Label la1 = new Label();
		la1.setText("라벨");
		la1.setFont(font);
		Color color = new Color(100,40,100); // int는 RGB칼라
		//디폴트 생성자 없음
		la1.setBackground(color);
		mainp.add(la1);
		
		
		
		
		Button btn01 = new Button();
		btn01.setLabel("버튼이름");
//		btn01.setName("버튼이름");
//		btn01.setBackground(c); 버튼도 칼라 있음
		btn01.setFont(font);
		mainp.add(btn01);
		
		add(mainp);
		setLocation(100,100);
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//컴포넌트의 종류
		new Ex07();
	}
}
