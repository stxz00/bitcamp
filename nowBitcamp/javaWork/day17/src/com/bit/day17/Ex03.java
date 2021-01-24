package com.bit.day17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

//스윙에서의 프레임
//JFrame에서는 이미 구현되어 있음

public class Ex03 extends JFrame {
	
	public Ex03() {
		// 0 - Do_NOTHING_ON_CLOSE()
		// 1 - HIDE_ON_CLOSE (setVisible(false);)
		// 2 - DISPOSE_ON_CLOSE (dispose())
		// 3 - 	EXIT_ON_CLOSE (System.exit(0);)
	
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		//클로즈 할 때 어떻게 할 지 정하는 것
		//0은 그냥 frame과 동일(아무것도 안함) 1은 디폴트값과 동일하게 종료안된채 창만 닫음(setVisible(false);)
		//2는 (안전하게)닫기(dispose()) DISPOSE_ON_CLOSE, 3은 빨리 닫기(exit) EXIT_ON_CLOSE
		
		setLocation(100,100);
		setSize(400,300);
		setVisible(true); //JFrame은 닫힐 때 false로 변하고 실제로 닫히진 않음
	}
	
	public static void main(String[] args) {
		Ex03 me = new Ex03();
	}

}
