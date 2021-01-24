package com.bit.day17;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ex02 extends Frame implements WindowListener{
	//윈도우리스너는 인터페이스, 강제 오버라이딩
	//창과 관련된 이벤트
	public Ex02() {
		
		addWindowListener(this); //본인  
		
		
		setLocation(100,100);
		setSize(200,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex02 me = new Ex02();
		
		System.out.println("메인을 리턴하겠습니다");
		return;
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated : 활성화");
		//창이 열릴 때 먼저 나옴
		this.setBackground(Color.WHITE);
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed : 사용자종료시 요청할 사항 실행(실제로 닫혀야 보임)");
		
		
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing : 닫기버튼을 눌렀을때");
//		dispose(); //GUI 종료요청 -> closed 실행
		//반드시 dispose()를 하는 게 아닌 닫기버튼을 눌렀을 때 다른 이름으로 저장하거나 파일다이알로그를 실행하는 등을 만드는 등으로 사용함
		FileDialog dia = new FileDialog(this,"저장",1);
		dia.setLocation(200,200);
		dia.setSize(400,200);
		dia.setVisible(true);
		
//		System.exit(0); // 시스템 강제종료 -> closed가 실행되진 않음
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated : 비활성화");
		// 창이 닫힐때 
		this.setBackground(Color.GRAY);
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified : 최소화에서 원래로(비아이콘화)");
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified : 최소화됨(작업표시줄에 아이콘화)");
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened : 열림");
		// 창이 열릴때 액티브드와 함께 나옴
	}
}
