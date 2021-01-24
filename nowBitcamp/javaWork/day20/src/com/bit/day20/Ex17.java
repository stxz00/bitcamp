package com.bit.day20;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex17 extends Thread{
	static Label la;
	
	@Override
	public void run() {
		while(true) {
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String msg = sdf.format(date);
			la.setText(msg);
			la.setAlignment(Label.CENTER);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		Frame f = new Frame();
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,30);
		la = new Label();
		la.setFont(font);
		
		f.add(la);
		f.setBounds(100,100,200,150);
		f.setVisible(true);
		
		Ex17 me = new Ex17();
		me.start();
		
	}
	
}
