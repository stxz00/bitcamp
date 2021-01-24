package com.bit.day17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

//마우스인풋리스너

public class Ex04 extends Frame implements MouseInputListener{
	
	public Ex04() {
		Panel p = new Panel();
		Label la = new Label("라벨");
		la.setBackground(Color.GREEN);
		la.addMouseListener(this);
		p.add(la);
		
		
		Button btn01 = new Button("버튼");
		btn01.addMouseListener(this);
		p.add(btn01);
		p.addMouseListener(this); //창이 마우스리스너 인식
		this.addMouseListener(this); // 패널이 꽉차게 먹었으니까 패널을 걷어내면 창에 넣은 마우스리스너 인식, 닫기 등 쪽에서는 인식안되게 되어있음
//		add(p);
		setLocation(100,100);
		setSize(500,400);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex04();
	}


	@Override				//마우스 이벤트와 관련된 정보를 가져오는 것
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked : 클릭했을때");
		//시간차에 따라 클릭이 되는 여부가 다름
				//누른채 다른 데로 이동 후 뗀다던지 아예 빠져나가서 뗀다던지, 시간차 등에 따른 클릭 발동여부가 다름
		Object obj = e.getSource();
		
		
//		((Button)obj).setLabel("클릭");
//		System.out.println(obj);
//		System.out.println(((Button)obj).getLabel());
		//버튼을 눌렀을 때 java.awt.Button[button0,244,5,38x23,label=버튼]
		//이벤트 객체가 나오고 있음 
		System.out.println(e.getX() + " : " + e.getY()); 
		//해당 엘리먼트 값 내부 (상대적)픽셀값
		System.out.println(e.getXOnScreen() + " : " + e.getYOnScreen());
		//스크린 기준 엘리먼트 좌표
		
		//그런데 움직임과 관련된 내용은 나오지 않음 -> 별도로 만들어놓음
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("mouseEntered : 마우스 이벤트객체 위로 가져갔을때");
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("mouseExited : 빠져나갈때");
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		System.out.println("mousePressed : 마우스 버튼을 누르는 순간");
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		System.out.println("mouseReleased : 마우스 버튼이 올라오는 순간");
		
	}


	@Override
	public void mouseDragged(MouseEvent arg0) {
		System.out.println("mouseDragged");
	}


	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("mouseMoved");
		
	}
}
