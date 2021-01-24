package com.bit.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ex02 {
	public static void main(String[] args) {
//		ArrayList list1 = new ArrayList();
		LinkedList list1 = new LinkedList();
		//열람적인 측면으로는 이론적으론 떨어짐
		//뒤에서 등장하는 특수한 상황일 때 사용
		//데이터를 자주 수정 열람, 리스트업 등을 할 때는 ArrayList가 나음
		list1.add(1111); 
		// Object는 기본자료형을 넣을 수 없지만 오토박싱으로 인해 
		// Integer 등으로 넣게됨
		list1.add("문자열"); // Object로 다 들어감
		list1.add('@');
		list1.add(true);
		list1.add(new char[] {'a','b','c'});
		
		System.out.println(list1.add(5555));
		// add는 리턴타입이 Boolean 이므로 true false를 반환해줌
		
		list1.set(3, "추가");

		
		Object  obj = new Integer(1234);
		Integer i1 = (Integer)obj;
		int i2 = i1; //언박싱
		
		for(int i = 0; i < list1.size(); i++) {
			Object ele = list1.get(i);
			System.out.println(ele.toString());
		}
		
		// 깊은 복사
		ArrayList list2 = new ArrayList(list1);
		//얕은 복사
//		ArrayList list2 = list1;
		System.out.println("----------------------------");
		list1.add(5555);
		list2.add(list1);
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));	
		}
		System.out.println("----------------------------");
		
		list2.clear(); //싹 다 없앰
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));	
		}
		System.out.println("----------------------------");
		list2.add("11ss");
		list2.addAll(list1); // 전체 추가
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));	
		}
		System.out.println("----------------------------");
		Object obj2 = list1.clone();
		ArrayList list4 = (ArrayList)obj2;
		for(int i = 0; i < list4.size(); i++) {
			System.out.println(list4.get(i));	
		}
		System.out.println("----------------------------");
		System.out.println(list4.contains("추가"));
		System.out.println(list4.indexOf("추가"));
		System.out.println(list4.indexOf("추가53523"));
		System.out.println(list4.isEmpty());
		list4.clear();
		System.out.println(list4.isEmpty());
		
		System.out.println("----------------------------");
		list4 = new ArrayList(list1);
		System.out.println(list4.remove("추가")); //add와 동일하게 true false 반환
		list4.add(6);
//		list4.remove(6);
//		list4.remove(6); // java.lang.IndexOutOfBoundsException
		//int 숫자를 넣는 게 index와 겹치므로 가장 안좋은 방법. 
		list4.remove(new Integer(6));
		//이렇게 겹치는 걸 최소화 할 수 있음!
		list4.removeAll(list1); // list1과 겹치는 것들을 모두 없앰
		for(int i = 0; i < list4.size(); i++) {
			System.out.println(list4.get(i));	
		}
		System.out.println("----------------------------");
		list4.addAll(list1);
		java.util.List list5 = list4.subList(0, 2); // 인데스 0~2 까지 넣음
		for(int i = 0; i < list5.size(); i++) {
			System.out.println(list5.get(i));	
		}
		System.out.println("----------------------------");
		ArrayList list33 = new ArrayList();
		list33.add("1");
		list33.add("2");
		list33.add("3");
		list33.add("4");
		Object[] list6 = list33.toArray();
		System.out.println(Arrays.toString(list6));
		Integer[] list7 = (Integer[])list6;
		String[] list8 = (String[])list6;
//		안됨 : Int[] list55 = (Int[])list6;
//		안됨 : int[] list8 = new int[] list6; Object로 받고 있으므로 주의
//		안됨 : int[] list8 = (Integer[]) list6;
		
		
		
		
		ArrayList list3 = new ArrayList(4); 
		// 위처럼 하게 되면 ArrayList(int initialCapacity)
		// 즉 버퍼를 정해서 그 한도까지만 만듬
		// ArrayList의 버퍼량이 정해지지 않으면 만들어지는 버퍼량이 많음
		// StringBuffer와 동일하게 trimTOSize()됨.
		
	}
}
