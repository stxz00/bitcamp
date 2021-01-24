package com.biy.day13;

import java.util.ArrayList;



public class Ex06 {

	public static void main(String[] args) {
		// 1.7~ 뒤 제네릭 생략가능
		ArrayList<Integer> list = new ArrayList<>();
		/*
		ArrayList<Integer>();
		list = new ArrayList();
		
		*/
		list.add(1111);
		list.add(2222);
//		list.add("");
		
		//주의할 점 : 아래처럼 앞에 제네릭을 붙지 않고 뒤에 쓰면 앞이 어차피 안잡혀 있으니 기존처럼 아무거나 들어갈 수있음
		
		ArrayList list2;
		list2 = new ArrayList<Integer>();
		list2.add(3333);
		list2.add("test");
		
		ArrayList<?> list3 = new ArrayList<>(); //<?> : 와일드카드, 당장 어떻게 쓸지 모르니 나중에 결정하겠다는 뜻 그냥 ?만 쓰면 Object나 다름없음 이는 <? extends Object>와 동일
//		list3.add(3333);
		// 와일드카드는 메서드에서 사용함
		
		
		
	}


}
