package com.bit.day16;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;

public class Ex10 {
	
	
	public static void main(String[] args) {
		Frame f = new Frame();
		
		TextArea ta = new TextArea();
		f.add(ta);
		
		
		f.setLocation(100,100);
		f.setSize(500,300);
		f.setVisible(true);
		f.setTitle("제목");
		
		// f에 종속할 창을 만드는 Dialog
		Dialog dia = new Dialog(f); //종속할 프레임을 반드시 넣어야함
		dia.setTitle("다이얼로그 창");
		BorderLayout border = new BorderLayout();
		dia.setLayout(border);
		
		Button btn = new Button("확인");
		dia.add(btn,BorderLayout.SOUTH);
		
		Label la = new Label("다이얼로그 창입니다");
		dia.add(la,BorderLayout.CENTER);
		
		dia.setSize(200,200);
		
		int x = f.getX()+f.getWidth()/2-dia.getWidth()/2;
		int y = f.getY()+f.getHeight()/2-dia.getHeight()/2;	
		dia.setLocation(x,y); //중앙 위치시키기
		dia.setVisible(true);
		f.setEnabled(false); // 다이얼로그가 켜져있으면 사용못하게
		
	}
}
