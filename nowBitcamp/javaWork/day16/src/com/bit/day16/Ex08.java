package com.bit.day16;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Ex08 extends Frame{
	
	public Ex08() {
		setLayout(new FlowLayout());
		Label la1 = new Label("id:");
		TextField tf1 = new TextField(10); 
		//괄호안은 사이즈
		//단 여기에서의 사이즈는 픽셀단위가 아니라 글자 10개가 보일 수 있는 정도의 사이즈임. 하지만 만약 사이즈 10을 만들었다 하면 영문자는 12자 한글은 8자 정도가 보임. 즉 절대적인 사이즈가 아니라는 것!
		//하지만 만약 위에 한글 넣어서 한다면 해당 문자열이 보이는 크기만큼 사이즈 만들음!
		tf1.setText("아이디를 입력");
		tf1.setBackground(Color.RED);
		tf1.setEditable(true); //수정 여부, false면 수정은 안되지만 복사는 됨
		tf1.setEnabled(true); //수정 불가능 여부, false면 아예 막힘.
		add(la1);
		add(tf1);
		Label la2 = new Label("pw:");
		TextField tf2 = new TextField("pasword"); //1줄만 입력가능
		tf2.setText("1234");
		tf2.setEchoChar('#'); //1234를 #으로 변경
		System.out.println(tf2.getText());
		add(la2);
		add(tf2);
		Button btn = new Button("로그인");
		btn.setFocusable(false); //탭으로 버튼에도 갈 수 있을 지, false면 x
		btn.setEnabled(true);
		add(btn);
		
		TextArea ta1 = new TextArea("초기값",3,30,TextArea.SCROLLBARS_VERTICAL_ONLY); //여러줄 입력가능, 디폴트 사이즈있음, 초기값,세로,가로,스크롤 순 스크롤 0은 디폴트, 개행 안할 때 1은 아래로 스크롤 표시, 2는 옆으로만 스크롤 표시, 3은 아예 스크롤 안나옴
		
	
		add(ta1);
		
		setLocation(100,100);
		setSize(500,300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex08();
	}
}
