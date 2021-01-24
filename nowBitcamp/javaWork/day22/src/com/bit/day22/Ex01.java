package com.bit.day22;

import java.awt.BorderLayout;
import java.awt.Button;
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

public class Ex01 extends Frame implements Runnable{
	int score;
	Label labTop, labDown;
	int cnt = 0;
	Button btn01;
	JButton[] btn;
	Panel cp;
	
	Ex01(){
		
		String title =  "두더지 게임(ver 0.1.0)";
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,26);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setTitle(title);
		setLayout(new BorderLayout());
		
		Panel np = new Panel();
		cp  = new Panel();
		Panel sp = new Panel();
		Panel ep = new Panel();
		cp.setLayout(new GridLayout(4,4));
		ep.setLayout(new GridLayout(2,1));
		
		np.setLayout(new GridLayout(1,2));
		
		Label sub = new Label(title);
		sub.setFont(font);
		np.add(sub);
		
		labTop = new Label(60 + "초");
		labTop.setAlignment(Label.RIGHT);
		np.add(labTop);
		
		labDown = new Label("야구공 +1점, 다른공 -2점");
		sp.add(labDown);
		final Ex01 me2 = this; //로컬클래스 어나니머스 안에 스레드를 넣는 경우
		btn01 = new Button("시작");
		btn01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cnt == 0) {
					cnt = 10;
					Thread thr = new Thread(me2);
					thr.start();
					btn01.setEnabled(false);
				}
				
			}
		});
		
		
		Button btn02 = new Button("종료");
		btn01.setFont(font);
		btn02.setFont(font);
		
		btn02.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		ep.add(btn01);
		ep.add(btn02);
		
		String[] imageName = {"1", "2", "3", "4"};
		
		btn = new JButton[16];
		for(int i = 0; i < btn.length; i++) {
			Icon icon = null;
			icon = new ImageIcon(imageName[i/4]+".png");
			btn[i] = new JButton(icon);
			btn[i].setEnabled(false);
			if(i/4 == 2) {
				btn[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						score++;
						labDown.setText("점수 : " + score);
					}
				});
			}else {
					btn[i].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						score = score -2;
						labDown.setText("점수 : " + score);
					}
				});
			}
			cp.add(btn[i]);
		}

		add(np,BorderLayout.NORTH);
		add(cp,BorderLayout.CENTER);
		add(sp,BorderLayout.SOUTH);
		add(ep,BorderLayout.EAST);
		
		setBounds(100,30,700,700);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		Ex01 me = new Ex01();
		
		
	}

	@Override
	public void run() {
		Random ran = new Random();
		for(int i = 0; i < btn.length; i++) {
			btn[i].setEnabled(true);
		}

		while(true) {
			
			for(int j = 0; j <100; j++) {
				int random =ran.nextInt(16);
				JButton temp = btn[0];
				btn[0] = btn[random];
				btn[random] = temp;
				for(int i = 0; i < btn.length; i++) {
					cp.add(btn[i]);
				}
				revalidate(); //강제갱신
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int j = 0; j <100; j++) {
				int random =ran.nextInt(16);
				JButton temp = btn[0];
				btn[0] = btn[random];
				btn[random] = temp;
				for(int i = 0; i < btn.length; i++) {
					cp.add(btn[i]);
				}
				revalidate(); //강제갱신
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			cnt--;
			labTop.setText(cnt + "초");
			if(cnt == 0) {break;}
			
			}
		
		btn01.setEnabled(true);
		for(int i = 0; i < btn.length; i++) {
			btn[i].setEnabled(false);
		}
		
	}
}
