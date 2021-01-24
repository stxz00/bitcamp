package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

//배치관리자
//지금까지 우리가 사용했던 배치관리자는 상대적이었음(전체 화면 구조를 봤을 때 비율에 맞춰서)
//이번엔 픽스된 화면창일 때라면 위치를 정해주는 것
//절대좌표
public class Ex16 extends Frame{

	Ex16(){
//		setLayout(null); //배치관리자가 없기 때문에 직접 자기가 만들어야함
		//사이즈를 늘리거나 줄여도 그 자리에 고정되어 있음
		Panel p = new Panel();
		p.setLayout(null);
		
		Button btn = new Button("버튼");
		btn.setSize(100,50);
		btn.setLocation(0,0);
		p.add(btn);
		add(p);
		
//		btn.setLocation(1,31); //0,0하면 위치가 상태바이기때문에 먹혀버림
//		add(btn);
		
		
		
		//어디에 둘지, 사이즈를 줄 지 안정하면 버튼을 add해도 보이지 않음
		
		
		
		setBounds(100,100,500,400);
		setVisible(true);	
		setResizable(false); //화면 고정
		System.out.println(p.getWidth() + "," + p.getHeight());
		btn.setLocation(p.getWidth(),0);
	}
	
	public static void main(String[] args) {
		Ex16 me = new Ex16();
	}
}
