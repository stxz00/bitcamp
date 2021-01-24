package com.bit.exercise;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Random;

public class Ex01 extends Frame {
	int my = 0;
	int com = 0;
	String select = new String();
	String comsel = new String();
	Label la = new Label();
	FileDialog fdi = new FileDialog(this);
	
	Ex01(){
		setLayout(new BorderLayout());
		
		add(new Label("                             가위바위보 ver 0.6.0"),BorderLayout.NORTH);
		
		
		Panel p = new Panel();
		
		Button btn1 = new Button("가위");
		btn1.setBackground(Color.WHITE);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select = "                        당신 : 가위";
				int my = 1;
				computer();
				la.setText(select + comsel);
				
			}
		});
		
		p.add(btn1);
		
		Button btn2 = new Button("바위");
		btn2.setBackground(Color.WHITE);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select = "                        당신 : 바위";
				int my = 2;
				computer();
				la.setText(select + comsel);
			}
		});
		
		p.add(btn2);
		
		Button btn3 = new Button("보");
		btn3.setBackground(Color.WHITE);
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				select = "                        당신 : 보";
				int my = 3;
				computer();
				la.setText(select + comsel);
			}
		});
		
		p.add(btn3);
		
		Button btn4 = new Button("종료");
		btn4.setBackground(Color.WHITE);
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		
		p.add(btn4);
		
		add(p,BorderLayout.CENTER);
		
		
		Menu m1 = new Menu("파일");
		MenuItem mi1 = new MenuItem("열기");
		mi1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				fdi.setVisible(true);
				
			}
		});
		m1.add(mi1);
		MenuItem mi2 = new MenuItem("닫기");
		m1.add(mi2);
		
		Menu m2 = new Menu("정보");
		MenuItem mi3 = new MenuItem("보기");
		m2.add(mi3);
		
		la = new Label("                   가위, 바위, 보 버튼을 선택하세요");
		add(la,BorderLayout.SOUTH);
		
		
		
		
		MenuBar mb = new MenuBar();
		mb.add(m1);
		mb.add(m2);
		setMenuBar(mb);
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
			}
			@Override
			public void windowIconified(WindowEvent arg0) {
			}
			@Override
			public void windowDeiconified(WindowEvent arg0) {
			}
			@Override
			public void windowDeactivated(WindowEvent arg0) {
			}
			@Override
			public void windowClosing(WindowEvent arg0) {
				dispose();
			}
			@Override
			public void windowClosed(WindowEvent arg0) {
			}
			@Override
			public void windowActivated(WindowEvent arg0) {
			}
		});
		
		setResizable(false);
		setBounds(100,100,300,150);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
	}
	
	public void computer() {
		Random ran = new Random();
		com = ran.nextInt(3) + 1;
		
		if(com == 1) {
			comsel = "   컴퓨터 : 가위";
		}else if(com == 2) {
			comsel = "   컴퓨터 : 바위";
		}else if(com == 3) {
			comsel = "   컴퓨터 : 보";
		}
	}
}
