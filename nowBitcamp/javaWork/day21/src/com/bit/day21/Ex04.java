package com.bit.day21;

import java.awt.Frame;
import java.awt.Label;
import java.util.Scanner;

class Target04 extends Thread{
	boolean w;
//		err -> java.lang.IllegalMonitorStateException
	public synchronized void menu2() {
		if(w) {
			try {wait();} catch (InterruptedException e) {}
		}
	}
	@Override
	public void run() {
		Frame f=new Frame();
		Label la=new Label();
		f.add(la);
		f.setBounds(100+1920, 100, 200, 150);
		f.setVisible(true);
		int su=0;
		while(true) {
			menu2();
			la.setText(su+++"");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu="1.실행 2.중지 3.재시작 0.종료> ";
		Target04 target=new Target04();
		Ex04 me=new Ex04();
		int input=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0) {break;}
			if(input==1) {
				target.start();
			}else if(input==2) {
				target.w=true;
			}else if(input==3) {
				target.w=false;
				target.interrupt();
			}
		}
	}
}













