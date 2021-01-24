package com.bit.day16;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;

public class Ex09 extends Frame{
	public Ex09() {
		GridLayout grid = new GridLayout(5,1);
		setLayout(grid);
		
		Panel p1 = new Panel();
		Checkbox ch1 = new Checkbox("item1"); // item1을 눌러도 체크됨
		Checkbox ch2 = new Checkbox("item2",true);
		Checkbox ch3 = new Checkbox("item3",true); //true 넣으면 시작할 때부터 체크표시
		Checkbox ch4 = new Checkbox("item4",false); //false면 똑같이 노체크
		
		
		p1.add(ch1);
		p1.add(ch2);
		p1.add(ch3);
		p1.add(ch4);
		
		Panel p2 = new Panel();
		
		CheckboxGroup cbg = new CheckboxGroup();
		//라디오 박스, 그룹 중 단 하나만 선택 가능하도록!
		Checkbox ra1 = new Checkbox("item1",true, cbg);
		Checkbox ra2 = new Checkbox("item2",false, cbg);
		Checkbox ra3 = new Checkbox("item3",true, cbg);
		Checkbox ra4 = new Checkbox("item4",false, cbg);
		//true가 두 개 라도 어차피 마지막 true만이 됨
		p2.add(ra1);
		p2.add(ra2);
		p2.add(ra3);
		p2.add(ra4);
		
		Panel p3 = new Panel();
		Choice cho = new Choice();
		cho.addItem("item1"); //add로 해도 같음, 구별하도록 이렇게 쓰기
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4"); 
//		cho.select(2); // 시작부터 3번째에 있는 것 선택
		cho.select("item2");
		//추가한 아이템 중에 선택
		p3.add(cho);
		
		Panel p4 = new Panel();
		List list = new List(6,true); //java.awt.List
		//펼쳐진 상태로 다중 선택
		//6개 펼쳐진 상태로,리스트보다 작게 펼치면 스크롤 바 나옴 true : 다중 선택, false : 하나만 선택
		
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.add("item5");
		list.add("item6");
		
		list.select(2); //3번째가 보이는 부분부터 펼침
		
		p4.add(list);
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		setLocation(100,100);
		setSize(500,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex09();
	}
}
