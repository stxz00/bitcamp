package com.bit.Exercise;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.Scanner;

import javax.swing.JDialog;


public class Ex01 extends Frame{
	
	public Ex01() {
		
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = 0;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
				
		
		Label la1 = new Label("이름");
		TextField tf1 = new TextField(26);
		gbl.setConstraints(la1, gbc);
		add(la1);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbl.setConstraints(tf1, gbc);
		add(tf1);
		
		
		Label la2 = new Label("성별");
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("남자",true,cbg);
		Checkbox cb2 = new Checkbox("여자",false,cbg);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(la2, gbc);
		add(la2);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb1, gbc);
		add(cb1);
		
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb2, gbc);
		add(cb2);
		
		
		
		Label la3 = new Label("주민번호");
		Panel p3 = new Panel();
		TextField tf3 = new TextField(6);
		Label la33 = new Label("-");
		TextField tf33 = new TextField(8);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbl.setConstraints(la3, gbc);
		add(la3);
		
		p3.add(tf3);
//		gbc.gridx = 1;
//		gbc.gridy = 2;
//		gbc.gridwidth = 1;
//		gbl.setConstraints(tf3, gbc);
//		add(tf3);
		
		p3.add(la33);
//		gbc.gridx = 2;
//		gbc.gridy = 2;
//		gbc.gridwidth = 1;
//		gbl.setConstraints(p3, gbc);
//		add(p3);
		
		p3.add(tf33);
//		gbc.gridx = 3;
//		gbc.gridy = 2;
//		gbc.gridwidth = 1;
//		gbl.setConstraints(tf33, gbc);
//		add(tf33);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 3;
		gbl.setConstraints(p3, gbc);
		add(p3);
		
		
		Label la4 = new Label("주소");
		TextField tf4 = new TextField(26);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbl.setConstraints(la4, gbc);
		add(la4);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbl.setConstraints(tf4, gbc);
		add(tf4);
		
		
		Label la5 = new Label("전화번호");
		Panel p5 = new Panel();
		Choice ch1 = new Choice();
		ch1.addItem("010");
		ch1.addItem("011");
		ch1.addItem("016");
		ch1.addItem("017");
		ch1.addItem("018");
		ch1.addItem("019");
		TextField tf5 = new TextField(20);
		
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbl.setConstraints(la5, gbc);
		add(la5);

/*
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbl.setConstraints(ch1, gbc);
		add(ch1);
		
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbl.setConstraints(tf5, gbc);
		add(tf5);
*/		

		p5.add(ch1);
		p5.add(new Label(" "));
		p5.add(tf5);
		
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbl.setConstraints(p5, gbc);
		add(p5);
		
		
		Label la6 = new Label("취미");
		Panel p6 = new Panel();
		Checkbox cb6 = new Checkbox("공부1");
		Checkbox cb66 = new Checkbox("공부2");
		Checkbox cb666 = new Checkbox("공부3");


		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbl.setConstraints(la6, gbc);
		add(la6);
		
/*
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb6, gbc);
		add(cb6);
		
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb66, gbc);
		add(cb66);
		
		gbc.gridx = 3;
		
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbl.setConstraints(cb666, gbc);
		add(cb666);
*/
		p6.add(cb6);
		p6.add(new Label("    "));
		p6.add(cb66);
		p6.add(new Label("    "));
		p6.add(cb666);
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.gridwidth = 3;
		gbl.setConstraints(p6, gbc);
		add(p6);
		
		
		Label la7 = new Label("자기소개");
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbl.setConstraints(la7, gbc);
		add(la7);
		
		TextArea ta = new TextArea();
		
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.gridwidth = 4;
		gbl.setConstraints(ta, gbc);
		add(ta);
		

		
		
	
		setTitle("window title");
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		
		
		JDialog dl = new JDialog(me);
		FlowLayout fl = new FlowLayout();
		dl.setLayout(fl);
		
		Panel p55 = new Panel(new BorderLayout());
		
		Label lad = new Label("상세하게 입력바랍니다");
		p55.add(lad,BorderLayout.CENTER);
		
		Button btn1 = new Button("확인");
		p55.add(btn1,BorderLayout.SOUTH);
		
		dl.add(p55);
		
		dl.setEnabled(true);
		dl.setSize(200,100);
		dl.setLocation(me.getX() + me.getWidth()/2 - dl.getWidth()/2 ,me.getY() + me.getHeight()/2 - dl.getHeight()/2);
		dl.setVisible(true);
		me.setEnabled(false);
		
		
		
		
		
	}
}
