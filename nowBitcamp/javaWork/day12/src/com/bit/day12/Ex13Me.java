package com.bit.day12;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex13Me {
	public static void main(String[] args) {
		// 로또 번호 생성기(ver 0.3.0)
		System.out.println("로또 번호 생성기(ver 0.3.0)");
		Random random = new Random();
		Set set1 = new TreeSet();
		while(true) {
			set1.add(random.nextInt(45)+1);
			if(set1.size() == 6) {break;}
		}
		Iterator ite = set1.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next() + "\t");
		}
	}
}
