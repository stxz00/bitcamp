package com.bit.day18;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Ex17 extends Frame{
	int my = 0;
	String my1 = new String();
	String com1 = new String();
	Label la2;
	Ex17(){
		setLayout(new GridLayout(3,1));
		Label la1 = new Label("가위 바위 보 게임(ver 0.5.0)");
		
		add(la1);
	
	
		Panel p = new Panel();
		Button btn1 = new Button("가\n위");
		btn1.setBackground(Color.WHITE);
		btn1.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				my = 1;
				my1 = "당신 : 가위";
				computer();
				la2.setText(com1 + my1);
			
			}
			
		});
		Button btn2 = new Button("바\n위");
		btn2.setBackground(Color.WHITE);
		btn2.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				my = 2;
				my1 = "당신 : 바위";
				computer();
				la2.setText(com1 + my1);
			}
			
		});
		
		Button btn3 = new Button("보");
		btn3.setBackground(Color.WHITE);
		btn3.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				my = 3;
				my1 = "당신 : 보";
				computer();
				la2.setText(com1 + my1);
			}
			
		});
		Button btn4 = new Button("종료");
		btn4.setBackground(Color.WHITE);
		btn4.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				dispose();
				la2.setText(com1 + my1);
				
			}
			
		});
		
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		
		add(p);
		
		
		la2 = new Label();

		add(la2);
	
		setBounds(100,100,300,300);
		setVisible(true);
		setResizable(false);
	}
	
	public void computer() {
		Random random = new Random();
		int num = random.nextInt(3);
		num++;
		if(num == 1) {
			com1 = "컴 : 가위   ";
		}else if(num == 2) {
			com1 = "컴 : 바위   ";
		}else if(num == 3) {
			com1 = "컴 : 보   ";
		}
	}
	
	
	public static void main(String[] args) {
		Ex17 me = new Ex17();
	}
}
