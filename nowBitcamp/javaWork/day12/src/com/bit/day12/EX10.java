package com.bit.day12;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EX10 {
	public static void main(String[] args) {
		Set set1 = new HashSet();
		//Hash 즉, 해시코드로 정렬, 같으면 삭제 그러므로 객체가 들어가지는것
		
		System.out.println(set1.add(1111));
		System.out.println(set1.add(2222));
		System.out.println(set1.add(1111));
		List list1 = new ArrayList();
		list1.add(3333);
		list1.add(4444);
		Set set2 = new HashSet(list1);
//		set2.clear();
		System.out.println(set2.isEmpty());
		Iterator ite = set2.iterator();
		for(int i = 0; i < set2.size(); i++) {
			System.out.println(ite.next());
		}
		set2.remove(3333);
		System.out.println(set2.contains(3333));
		
		// 스택과 큐는 api를 보고 쓸 수 있을 정도만 해도 됨
		// set은 이정도까지만
	}
}
