package com.bit.Exercise;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Ex02 extends Frame{

	public Ex02() {
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		Font font = new Font("궁서",1,13);
		
		Label la1 = new Label("치킨의 종류");
		la1.setFont(font);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbl.setConstraints(la1, gbc);
		add(la1);
		
		Label la567 = new Label(" ");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbl.setConstraints(la567, gbc);
		add(la567);
		
		Label la568 = new Label(" ");
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbl.setConstraints(la568, gbc);
		add(la568);
		
		Panel p3 = new Panel();
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("후라이드",false,cbg);
		Checkbox cb2 = new Checkbox("양념",false,cbg);
		Checkbox cb3 = new Checkbox("간장",false,cbg);
		
		p3.add(cb1);
		p3.add(new Label("  "));
		p3.add(cb2);
		p3.add(new Label("  "));
		p3.add(cb3);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 4;
		gbl.setConstraints(p3, gbc);
		add(p3);
		
		
		
		Label la2 = new Label("치킨의 양");
		la2.setFont(font);
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbl.setConstraints(la2, gbc);
		add(la2);
		
		
		Panel p2 = new Panel();
		Checkbox cb4 = new Checkbox("1인분");
		Checkbox cb5 = new Checkbox("2인분");
		Checkbox cb6 = new Checkbox("3인분");
		
		p2.add(cb4);
		p2.add(new Label("  "));
		p2.add(cb5);
		p2.add(new Label("  "));
		p2.add(cb6);
		
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 4;
		gbl.setConstraints(p2, gbc);
		add(p2);
		
	
		
		Label la4 = new Label("리뷰이벤트");
		la4.setFont(font);
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbl.setConstraints(la4, gbc);
		add(la4);
		
		CheckboxGroup cbg2 = new CheckboxGroup();
		Checkbox cb7 = new Checkbox("신청",false,cbg2);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 4;
		gbl.setConstraints(cb7, gbc);
		add(cb7);
		
		Label la5 = new Label("결제방법");
		la5.setFont(font);
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbl.setConstraints(la5, gbc);
		add(la5);
		
		
		Panel p1 = new Panel(new FlowLayout());
		
		CheckboxGroup cbg3 = new CheckboxGroup();
		Checkbox cb8 = new Checkbox("현금",false,cbg3);
		Checkbox cb9 = new Checkbox("카드",false,cbg3);
		p1.add(cb8);
		p1.add(new Label("  "));
		p1.add(cb9);
		
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 4;
		gbl.setConstraints(p1, gbc);
		add(p1);


		Button btn = new Button("주문하기");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.gridwidth = 4;
		gbl.setConstraints(btn, gbc);
		add(btn);
		
		
		
		
		setBackground(Color.lightGray);
		setLocation(100,100);
		setSize(300,500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		
	}
}
