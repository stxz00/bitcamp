package com.bit.day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Lec11 implements Comparable<Lec11>{
	int val;
	public Lec11(int val) {
		this.val = val;
	}
	@Override
	public int compareTo(Lec11 obj) {
		
		return this.val - obj.val;
	}
}



public class Ex11 {
	
	
	public static void main(String[] args) {
		Lec11 obj1 = new Lec11(1111);
		Lec11 obj2 = new Lec11(2222);
		Lec11 obj3 = new Lec11(3333);
		Lec11 obj4 = new Lec11(1111);
		Lec11 obj5 = new Lec11(4444);
		
		Set set = new TreeSet();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		set.add(obj5);
		System.out.println(set.size());
		Iterator<Lec11> ite = set.iterator();
		System.out.println(ite.next().val);
		System.out.println(ite.next().val);
		System.out.println(ite.next().val);
		System.out.println(ite.next().val);
		
		
	}
}
