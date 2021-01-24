package com.bit.day17;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


//마우스모션리스너 : 무브와 드래그
public class Ex05 extends Frame implements MouseMotionListener{
	
	public Ex05() {
		
		
		addMouseMotionListener(this);
		setLocation(100,100);
		setSize(500,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex05 me = new Ex05();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged : 드래그 " + e.getX() +" : " + e.getY() );
		//왼쪽 위 0,0 기준으로 x,y 좌표가 나옴 화면 밖으로 나와도 클릭을 하고 있으니 이벤트가 동작되고있음(마우스 이벤트의 특이점)
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		System.out.println("mouseMoved");
		
	}
}
