package com.bit.day20;
import java.awt.Font;
//sleep
import java.awt.Frame;
import java.awt.Label;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//ui
public class Ex16 extends Frame implements Runnable{
	static Label la;
	public Ex16() {
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,30);
		la = new Label();
		la.setFont(font);
		la.setAlignment(Label.CENTER); //센터 정렬
		add(la);
		
		setBounds(100,100,200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex16 me = new Ex16();
		Thread thr = new Thread(me);
		thr.start();
	}

	@Override
	public void run() {
		while(true) {
			//la.setText(new Date().toString());
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String msg = sdf.format(date);
			la.setText(msg);
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
