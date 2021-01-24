package com.bit.day16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.LinearGradientPaint;
import java.awt.Panel;


public class Ex03 extends Frame{
	public Ex03() {
		// 배치관리자
//		FlowLayout layout = new FlowLayout();
//배치를 처음 윗줄 중앙에 놓고 오른쪽에 그다음씩 배치하고 
//맨 윗줄에 더이상 사이즈가 되지 않으면 그 다음 줄로 배치함
//화면 직접 조정해도 그에 맞게 배치됨
// 버튼 btn2.setSize(200,200); 해도 조정 안됨(버튼 안의 내용에 따라 크기 조정됨)
//		setLayout(layout);
	
		
//		GridLayout layout = new GridLayout(2,3); //세로, 가로 몇 개
		// 세로줄 우선이고 그 다음 가로줄을 동적으로 나옴(반드시 써놓은 가로줄로 되는 게 아님)
		//사이즈를 줄여도 위치 변하지 않음
//		setLayout(layout);
		
		
// 		이 두 방법은 이미 배치 방법이 정해져 있음
		
		BorderLayout layout = new BorderLayout();
		setLayout(layout);
		//퍼포먼스 당시에 어떻게 넣을 지 정하는 것
		//add 할 시에 정함
		//add 시 위치를 지정해줘야함, 꽉차게 나옴
		
		
		// 컴포넌트 추가
	
/*		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		add(btn1,"North");
		add(btn2,"South"); //그냥 추가하면 버튼2가 화면 다 먹어버림
//		add(btn2"); //또 추가해도 안나옴
		add(btn3,"West");
		add(btn4,"East"); 
		add(btn5,"Center"); 
		setLocation(100,100);
		setSize(800,800);
		setVisible(true);
*/		
//		Panel east = new Panel(); 
		GridLayout layout2 = new GridLayout(2,3);
		Panel west = new Panel(); 
		
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		
//		east.add(btn4);
		west.add(btn2);
		west.add(btn4);
		west.setLayout(layout2); //패널에 레이아웃을 넣어 가능
		
		
		add(btn1,BorderLayout.NORTH);
//		add(btn1,"North"); //상수로 정해놓음 
//		add(btn2,"South"); 
		add(west,BorderLayout.WEST);
//		add(west,"West");
//		add(east,"East"); 
		add(btn5,BorderLayout.CENTER);
//		add(btn5,"Center"); 
		setLocation(100,100);
		setSize(800,800);
		setVisible(true);
		
		//Grid 빼고 Border 등은 안드로이드도 됨
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
