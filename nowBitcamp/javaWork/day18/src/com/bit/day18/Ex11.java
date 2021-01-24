package com.bit.day18;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Panel;

public class Ex11 extends Frame implements ItemListener{
	
	public Ex11() {
		
		Panel p = new Panel();
		
		List list = new List();
		list.addItem("item1");
		list.addItem("item2");
		list.addItem("item3");
		list.addItem("item4");
		list.addItemListener(this); //아이템 상태변화에 따른 
		
		Choice cho = new Choice();
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		cho.addItemListener(this);
		
		p.add(list);
		p.add(cho);
		
		add(p);
		
		setBounds(100,100,400,300); 
		//각 위치와 사이즈 2개씩(셋로케이션과 셋사이즈 통합)
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex11 me = new Ex11();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println(e.getItem()); // 그동안 다르게 리스트의 인덱스 번호가 나옴, 초이스는 네이밍이 나옴
		System.out.println(e.getSource());
		
	}
}
