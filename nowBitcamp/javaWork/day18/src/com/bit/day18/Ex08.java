package com.bit.day18;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
class Item1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("첫번째");	
	}
	
}

class Item2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("두번째");
	}
}
*/

public class Ex08 {//implements ActionListener{
	
	public static void main(String[] args) {
		
//		Ex08 me = new Ex08();
		
		Frame f = new Frame();
		
		MenuItem mi1 = new MenuItem("기능1");
		MenuItem mi2 = new MenuItem("기능2");
		int su = 2222;
		ActionListener listen = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번" + su);
			}
		};
		
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("1번" + su);
			}
		});
		mi2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("2번" +su);
			}
		}); //이렇게 인터페이스를 바로 어나니머스 클래스로 활용하면 엄청 쉬워지고 코딩도 직관적이고 간결하고 앞서 su를 넣는것처럼 접근도 쉽게 됨!!
		
		Menu mn = new Menu("기능들");
		mn.add(mi1);
		mn.add(mi2);
		
		MenuBar mb = new MenuBar();
		mb.add(mn);
		
		f.setMenuBar(mb);
		f.setLocation(100,100);
		f.setSize(500,300);
		f.setVisible(true);
	}
/*
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("액션");
		
	}
*/	
}
