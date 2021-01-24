package com.bit.day17;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex06 extends Frame implements KeyListener{
	
	public Ex06() {
		Panel p = new Panel();
		TextField tf = new TextField(10);
		tf.addKeyListener(this);
		p.add(tf);
		
		Button btn = new Button("이벤트객체");
		btn.addKeyListener(this);
		p.add(btn);
		
	//	add(p);
		this.addKeyListener(this);
		setLocation(100,100);
		setSize(300,200);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		Ex06 me = new Ex06();
	}


	@Override
	public void keyPressed(KeyEvent e) {
//		TextField tf = (TextField)e.getSource();
//		System.out.println("keyPressed : 키가 눌리는 순간 " +tf.getText());
		//넣을 값이 완벽히 전달 받은 상황은 키가 올라오는  순간만이므로 getText()가 적용됨 -> 이전에 받은 값들을 출력함
		
		//게임들은 wasd가 바로바로 그 값의 전달이 되어야하므로 
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		TextField tf = (TextField)e.getSource();
//		System.out.println("keyTyped : 키눌림 " +tf.getText());
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
//		TextField tf = (TextField)e.getSource();	
//		System.out.println("keyReleased : 키가 올라올때 " +tf.getText());
		//키를 계속 누르고 있을때는 발동되지 않고 누름과 타이핑 계속 됨
		
//		Button btn = (Button)e.getSource();
//		System.out.println("keyReleased : 키가 올라올때 " +btn.getLabel());
		//포커스 되고 있는게 확인됨
		
		Ex06 me = new Ex06();
		System.out.println("keyReleased : 키가 올라올때 " +me.getLayout());
		
	}
	// 대문자 A를 쓸 때 shift 누르면 pressed만 발동. 동작은 있겠지만 값의 전달이 없으니! 이렇게 조합이 이루어져야 하는 키는 keyTped가 발동 되지 않음.


	
}
