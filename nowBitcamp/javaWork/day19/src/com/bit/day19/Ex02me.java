package com.bit.day19;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex02me extends Frame implements ActionListener{
	
	String text = "결과                                           ";
	Label la2;
	Ex02me(){
		setLayout(new BorderLayout());
		
		Panel p1=  new Panel();
		Label la1 = new Label("가위 바위 보 게임 (ver 0.5.0)");
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,30);
		la1.setFont(font);
		p1.add(la1);
		
		Panel p2=  new Panel();
		p2.setLayout(new GridLayout(1,4));
		Icon i1 = new ImageIcon("b.png");
		Icon i2 = new ImageIcon("a.png");
		Icon i3 = new ImageIcon("c.png");
		
		JButton btn1 = new JButton("0",i1);
		JButton btn2 = new JButton("1",i2);
		JButton btn3 = new JButton("2",i3);
		JButton btn4 = new JButton("종료");
		btn4.setFont(font);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		btn1.setBackground(Color.WHITE);
		btn2.setBackground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		btn4.setBackground(Color.WHITE);
		
		btn1.setForeground(Color.WHITE);
		btn2.setForeground(Color.WHITE);
		btn3.setForeground(Color.WHITE);
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btn4);
		
		Panel p3 = new Panel();
		la2 = new Label(text);
		la2.setFont(font);
		p3.add(la2);
		
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setBounds(100,100,500,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex02me me = new Ex02me();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String text = "결과 : ";
	
		Random ran = new Random();
		int com = ran.nextInt(3);
		
		if(com == 0) {
			text += "컴퓨터  가위";
		}else if(com == 1) {
			text += "컴퓨터  바위";
		}else {
			text += "컴퓨터  보";
		}
		
		JButton btn = (JButton)e.getSource();
		
		String name = btn.getLabel();
		int me = Integer.parseInt(name);
		
		
		if(me == 0) {
			text += " 당신 가위";
		}else if(me == 1) {
			text += " 당신 바위";
		}else {
			text += " 당신 보";
		}
		
		if(com == me) {
			System.out.println("비김");
		}else if(com == 0&&me ==1 
				|| com==1 && me == 2|| com ==2 && me==0){
			System.out.println("이김");
		}else {
			System.out.println("졌음");
		}
		
		la2.setText(text);
		
	}
}
