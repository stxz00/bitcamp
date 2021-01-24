package com.bit.day12;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		long before = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			list1.add("추가"+i);
		}
		
		long after = System.currentTimeMillis();
		
		System.out.println(after-before);
		
		LinkedList list2 = new LinkedList();
		
		before = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++) {
			list2.add("추가"+i);
		}
		
		after = System.currentTimeMillis();
		
		System.out.println(after-before);
		//추가는 시간 차이가 별차이 안남
		Object temp = null;
		before = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			temp = list1.get(i);
		}
		after = System.currentTimeMillis();
		System.out.println(after-before);
		// ArrayList는 더 엄청 빠름
		
		
		temp = null;
		before = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			temp = list2.get(i);
		}
		after = System.currentTimeMillis();
		System.out.println(after-before);
		// LinkedList는 엄청 시간이 지나야 끝남
		
		//이래서 ArrayList를 쓰게 됨
		//하지만 LinkedList는 자료 표현이 많음 큐,디큐 등
	}
}
