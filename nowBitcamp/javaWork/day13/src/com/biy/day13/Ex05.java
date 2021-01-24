package com.biy.day13;

class Box2<A,B>{
	A obj1;
	B obj2;
	
	void set1(A obj1) {
		this.obj1 = obj1;
	}
	
	void set2(B obj2) {
		this.obj2 = obj2;
	}
	
	A get1() {
		return obj1;
	}
	
	B get2() {
		return obj2;
	}
	
}

public class Ex05 {
	public static void main(String[] args) {
//		Box2 box2 = new Box2();
		Box2<String,Integer> box2 = new Box2<String,Integer>();
		box2.set1("Ã¹¹øÂ°");
		box2.set2(1111);
		
		String param1 = box2.get1();
		int param2 = box2.get2();
		System.out.println(param1);
		System.out.println(param2);
		
	}
}
