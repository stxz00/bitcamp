package com.bit.day16;

import java.awt.Frame;

import javax.swing.JFrame;

// UI 두번 째 방법
public class Ex02 {
	public static void main(String[] args) {
		JFrame f = new JFrame(); // javax.swing 쓰고 싶다면 그냥 J붙이면 됨
		f.setVisible(true);
		f.setSize(200,200);
		f.setLocation(200,200);
		// ★중요 : 스윙은 창 닫기를 누르면 닫히는 데 실제론 setVisable이 false로 되는 것이고 계속 이클립스 실행 중임
	}
}
