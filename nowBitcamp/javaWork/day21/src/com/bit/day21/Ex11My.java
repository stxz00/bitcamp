package com.bit.day21;

import java.awt.BorderLayout;
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
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Ex11My extends Frame implements ActionListener, Runnable {

	Icon icon0 = new ImageIcon("ball.jpg");
	Icon icon1 = new ImageIcon("chuk.jpg");
	Icon icon2 = new ImageIcon("nong.jpg");
	Icon icon3 = new ImageIcon("ya.jpg");
	
	//main에서 run() 재정의를 위한 static 변경 -> JButton 배열로 만들면 코드 간소화
	static JButton btn1 = new JButton(); 
	static JButton btn2 = new JButton();
	static JButton btn3 = new JButton();
	static JButton btn4 = new JButton();
	static JButton btn5 = new JButton();
	static JButton btn6 = new JButton();
	static JButton btn7 = new JButton();
	static JButton btn8 = new JButton();
	static JButton btn9 = new JButton();
	static JButton btn10 = new JButton();
	static JButton btn11 = new JButton();
	static JButton btn12 = new JButton();
	static JButton btn13 = new JButton();
	static JButton btn14 = new JButton();
	static JButton btn15 = new JButton();
	static JButton btn16 = new JButton();
	
	JButton btn17 = new JButton("시작");
	
	Random ran = new Random();
	
	Label la2 = new Label("60초");
	
	Label la4 = new Label("            0점");
	
	private int count = 0; // 점수
	
	private boolean boo = false; //시작버튼 눌림 여부 -> 초시계 시작
	
	private int su = 60; // 60초세기
	
	public Ex11My() {
		
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,13);
		
		setLayout(new BorderLayout());
		
		Panel ps = new Panel();
		ps.setLayout(new BorderLayout());
		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(1,2));
		Label la1= new Label("축구공 맞추기 게임");
		
		la1.setFont(font);
		la2.setFont(font);
		
		la1.setAlignment(Label.LEFT);
		la2.setAlignment(Label.RIGHT);
		
		p1.add(la1);
		p1.add(la2);
		
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(4,4));
		btn1.setBackground(Color.WHITE);
		btn2.setBackground(Color.WHITE);
		btn3.setBackground(Color.WHITE);
		btn4.setBackground(Color.WHITE);
		btn5.setBackground(Color.WHITE);
		btn6.setBackground(Color.WHITE);
		btn7.setBackground(Color.WHITE);
		btn8.setBackground(Color.WHITE);
		btn9.setBackground(Color.WHITE);
		btn10.setBackground(Color.WHITE);
		btn11.setBackground(Color.WHITE);
		btn12.setBackground(Color.WHITE);
		btn13.setBackground(Color.WHITE);
		btn14.setBackground(Color.WHITE);
		btn15.setBackground(Color.WHITE);
		btn16.setBackground(Color.WHITE);
		
		image(btn1);
		image(btn2);
		image(btn3);
		image(btn4);
		image(btn5);
		image(btn6);
		image(btn7);
		image(btn8);
		image(btn9);
		image(btn10);
		image(btn11);
		image(btn12);
		image(btn13);
		image(btn14);
		image(btn15);
		image(btn16);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btn12.addActionListener(this);
		btn13.addActionListener(this);
		btn14.addActionListener(this);
		btn15.addActionListener(this);
		btn16.addActionListener(this);
		
		btnOnOff(false);
		
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		p2.add(btn10);
		p2.add(btn11);
		p2.add(btn12);
		p2.add(btn13);
		p2.add(btn14);
		p2.add(btn15);
		p2.add(btn16);
		
		Panel p4 = new Panel();
		Label la3 = new Label("맞으면 1점, 틀리면 -2점                               ");
	
		
		la3.setFont(font);
		la4.setFont(font);
		
		la3.setAlignment(Label.LEFT);
		la4.setAlignment(Label.RIGHT);
		
		p4.add(la3);
		p4.add(la4);
		
		ps.add(p1,BorderLayout.NORTH);
		ps.add(p2,BorderLayout.CENTER);
		ps.add(p4,BorderLayout.SOUTH);
		
		Panel p3 = new Panel();
		p3.setLayout(new GridLayout(2,1));
		
		JButton btn18 = new JButton("종료");
		font = new Font(Font.SANS_SERIF,Font.BOLD,30);
		
		btn17.setFont(font);
		btn18.setFont(font);
		
		btn17.setBackground(Color.WHITE);
		btn18.setBackground(Color.WHITE);
		
		btn17.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				boo = true;
				btnOnOff(true);
				su = 60;
				count = 0;
				la4.setText("             0점");
			}
		});
		
		btn18.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		p3.add(btn17);
		p3.add(btn18);
		
		add(ps, BorderLayout.CENTER);
		add(p3, BorderLayout.EAST);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setBounds(100,100,500,500);
		setVisible(true);
	}
	
	public void image(JButton btn) {
		int btnsu = ran.nextInt(4);
		if(btnsu == 0) {
			btn.setText("0");
			btn.setForeground(Color.WHITE);
			btn.setIcon(icon0);
		} else if(btnsu == 1) {
			btn.setText("1");
			btn.setForeground(Color.WHITE);
			btn.setIcon(icon1);
		} else if(btnsu == 2) {
			btn.setText("2");
			btn.setForeground(Color.WHITE);
			btn.setIcon(icon2);
		} else if(btnsu == 3) {
			btn.setText("3");
			btn.setForeground(Color.WHITE);
			btn.setIcon(icon3);
		}
	}
	
	void btnOnOff(boolean btnBoo) {
		btn1.setEnabled(btnBoo);
		btn2.setEnabled(btnBoo);
		btn3.setEnabled(btnBoo);
		btn4.setEnabled(btnBoo);
		btn5.setEnabled(btnBoo);
		btn6.setEnabled(btnBoo);
		btn7.setEnabled(btnBoo);
		btn8.setEnabled(btnBoo);
		btn9.setEnabled(btnBoo);
		btn10.setEnabled(btnBoo);
		btn11.setEnabled(btnBoo);
		btn12.setEnabled(btnBoo);
		btn13.setEnabled(btnBoo);
		btn14.setEnabled(btnBoo);
		btn15.setEnabled(btnBoo);
		btn16.setEnabled(btnBoo);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		
		int bsu = Integer.parseInt(btn.getLabel());
		if(bsu == 1) {
			count++;
			la4.setText("            " + count + "점");
		}else {
			count = count -2;
			if(count < 0) {
				count = 0;
			}
			la4.setText("            " + count + "점");
		}
		image(btn);
	}
	
	synchronized void wa() {
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			if(boo) {
				if(su == 0) {
					boo = false;
					btnOnOff(false);
				}else {
					System.out.println(Thread.currentThread().getName());
					if(su == 0) {break;}
					Thread.yield();
					wa();
					su--;
					la2.setText("" + su + "초");
				}
			}else {
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) {
		Ex11My me = new Ex11My();
		
		Thread thr1 = new Thread(me);
		thr1.setDaemon(true); //main 스레드 종료
		
		Thread thr2 = new Thread(me) {
			synchronized void wa() {
				
				try {
					System.out.println(Thread.currentThread().getName());
					wait(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			@Override
			public void run() {
				while(true) {
					wa();
					me.image(btn1);
					me.image(btn2);
					me.image(btn3);
					me.image(btn4);
					me.image(btn5);
					me.image(btn6);
					me.image(btn7);
					me.image(btn8);
					me.image(btn9);
					me.image(btn10);
					me.image(btn11);
					me.image(btn12);
					me.image(btn13);
					me.image(btn14);
					me.image(btn15);
					me.image(btn16);
				}
			}
		};
		thr2.setDaemon(true);
		
		thr1.start();
		thr2.start();
	}
}
