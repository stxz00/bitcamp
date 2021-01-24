package com.bit.day21;

import java.awt.Frame;
import java.awt.Label;
import java.util.Scanner;

class Target03 extends Thread{
	
	@Override
	public void run() {
		Frame f=new Frame();
		Label la=new Label();
		f.add(la);
		f.setBounds(100+1920, 100, 200, 150);
		f.setVisible(true);
		int su=0;
		while(true) {
			la.setText(su+++"");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class Ex03 {

	public static void main(String[] args) {
		Target03 target=new Target03();
		String menu="1.½ÃÀÛ 2.¸ØÃã 3.Àç½ÃÀÛ 4.ÁßÁö 0.Á¾·á> ";
		Scanner sc=new Scanner(System.in);
		int input=0;
		while(true) {
			System.out.print(menu);
			input=sc.nextInt();
			if(input==0) {break;}
			if(input==1) {
				target.start();
			}else if(input==2) {
				target.suspend();
			}else if(input==3) {
				target.resume();
			}else if(input==4) {
				target.stop();
			}
		}
	}

}












