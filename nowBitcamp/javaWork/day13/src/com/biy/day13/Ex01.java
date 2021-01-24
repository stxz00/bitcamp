package com.biy.day13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		// 제네릭(1.5~)-문법적 제약
		// 기본자료형x
		// 오류 최소화(타입 안정성), 코드 간결화(형변환 생략, 타입체크)
		ArrayList<String> list = new ArrayList<String>();
//		ArrayList<Object> list = new ArrayList<Object>();
//		<Object>로 많이 써보길 바람 <Number> <comparable>
//		사용하는 시점에 소스 코드를 수정하는 것과 동일
		
		//< >안의 내용으로 제약을 두게 됨
//		list.add(1111);
//		list.add(2222);
//		list.add(3333);
//		list.add(4444);
//		list.add(3.14);
//		list.add('@');
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.add("dddd");
		
		
//		for(int i = 0; i < list.size(); i++) {
//		//  <>없을 때 int ele = (int)list.get(i) 클래스 캐스트 오류 문제
//		//  개발자가 의도한 것이 안되고 있으니 제네릭을 통해 제약을 둠
//			Object ele = list.get(i);
//			System.out.println(ele);
//		}
		
		for(int i = 0; i < list.size(); i++) {
		//제네릭을 통해 제약을 건 것으로 이제 오토캐스팅이 되지 않음!(필요X니)
			System.out.println(list.get(i));
		}
			
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1111);
		list2.add(2222);
		list2.add(3333);
		list2.add(4444);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list2.get(i));
		}
		
	}
}
