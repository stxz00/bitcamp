package com.bit.day16;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

//grid로 원하는 화면을 만드는 것은 매우 어려움. 나중에 더 쉬운 방법이 있으니 굳이 구현하려 노력하지 않아도 됨

public class Ex04 extends Frame {
	public Ex04() {
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		//퍼포먼스 당시에 어떻게 넣을 지 정하는 것
		//add 하기 전에 위치 정함
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		Button btn3 = new Button("btn3");
		Button btn4 = new Button("btn4");
		Button btn5 = new Button("btn5");
		Button btn6 = new Button("btn6");
		Button btn7 = new Button("btn7");
		
		 GridBagConstraints gbc=new GridBagConstraints();
		 // gbc.fill -> 위치를 기준으로 어떻게 채울지(실제로 채움 여부임)
		 //위치(아래 3개를 설정해야 위치가 결정됨)
		 //	가로, 세로위치
		 //	넓이,높이
		 //	가중치
		 // 위치의 속성은 상대적임 잘 따져야함(미리 바둑판식으로 사이즈 정해놓고 하면 됨)
		 
		 
	      gbc.fill=1; //채움 어떻게 할 지 , 0은 채우지 않고 위치조정
//	      gbc.fillGridBagConstraints.BOTH; 함께 채움 위치
	      // Field descriptor #12 I
//	      public static final int RELATIVE = -1;
//	      
//	      // Field descriptor #12 I
//	      public static final int REMAINDER = 0;
//	      
//	      // Field descriptor #12 I
//	      public static final int NONE = 0;
//	      
//	      // Field descriptor #12 I
//	      public static final int BOTH = 1;
//	      
//	      // Field descriptor #12 I
//	      public static final int HORIZONTAL = 2;
//	      
//	      // Field descriptor #12 I
//	      public static final int VERTICAL = 3;
//	      
//	      // Field descriptor #12 I
//	      public static final int CENTER = 10;
	      gbc.gridx=0; // 가로 위치 
	      gbc.gridy=0; // 세로 위치
	      //넓이와 높이는 상대적인 크기임(픽셀단위x)
	      gbc.gridwidth = 1; //넓이
	      gbc.gridheight = 1; //높이
	      gbc.weightx = 1.0; // 가중치 : 동일 비율로 어떻게 설정할지 고르는 것. 디폴트는 0임
	      // 가중치는 각각의 줄 등 요소마다 비율이 다르므로 조심!
	      // 위는 가로가 총 2칸, 아랫줄은 3칸이면 그것이 가중치에 따름
	      gbc.weighty = 1.0; 
	      gbl.setConstraints(btn1, gbc);
	      add(btn1);
	      
	      gbc.gridx=1;
	      gbc.gridy=0;
	      gbc.gridwidth=1;
	      gbl.setConstraints(btn2, gbc);
	      add(btn2);
	      
	      gbc.gridx=2;
	      gbc.gridy=0;
	      gbc.gridwidth=1;
	      gbl.setConstraints(btn3, gbc);
	      add(btn3);
	      
	      gbc.gridx=0;
	      gbc.gridy=1;
	      gbc.gridwidth=1;
	      gbl.setConstraints(btn4, gbc);
	      add(btn4);
	      
	      gbc.gridx=1;
	      gbc.gridy=1;
	      gbc.gridwidth=2;
	      gbl.setConstraints(btn5, gbc);
	      add(btn5);
	      
	      gbc.gridx=0;
	      gbc.gridy=2;
	      gbc.gridwidth=2;
	      gbl.setConstraints(btn6, gbc);
	      add(btn6);
	      
	      gbc.gridx=2;
	      gbc.gridy=2;
	      gbc.gridwidth=1;
	      gbl.setConstraints(btn7, gbc);
	      add(btn7);

		setVisible(true);
		setLocation(100,100);
		setSize(300,300);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}
