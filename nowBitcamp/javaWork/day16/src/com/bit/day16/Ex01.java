package com.bit.day16;

import java.awt.Button;
import java.awt.Panel;

// 자바 UI
// 초창기 : 자바 애플릿 java.applet
// 악용이 커서 안쓰려함
// 그 다음 : 자바 awt java.awt -> 정말 촌스러움, 우리가 사용할 예정
// 운영체제가 가지고 있지 않은 것은 구현할 수 없었음(버튼 등)
// 자바x스윙(javax.swing) : 자바가 직접 드로잉하기 때문에 많은 기능을 가짐

// 버튼은 javax.swing.JButton;

// UI를 사용하는 가장 쉬운 방법은 상속!
public class Ex01  extends java.awt.Frame{
	
	public Ex01() {
		Panel p = new Panel();
		Button btn1 = new Button("btn1");
		Button btn2 = new Button("btn2");
		btn2.setSize(200,200); // 해도 조정 안됨
		p.add(btn1); // 패널에 버튼을 만듬
		p.add(btn2);
		add(p); // 패널을 넣음
		
		setLocation(200,300); // 실행 시 모니터 위치 선정 
		setSize(200,300); // UI 사이즈 설정
		setVisible(true); 
		// 화면에 보일지 설정. 실행하면 화면 나옴 기본적으로 UI는 아무것도 작동 안함 할려면 이벤트 처리 해야함 최대, 최소화는 운영체제가 함 그래서 작동 안하는거
		
	}
	
	public static void main(String[] args) {
		// GUI - awt
	
		
		Ex01 me = new Ex01();
		
	}
}
