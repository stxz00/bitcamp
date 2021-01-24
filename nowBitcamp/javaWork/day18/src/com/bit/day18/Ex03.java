package com.bit.day18;

import com.bit.day18.Outter03.Inner03;

class Outter03{
	static int su1 = 1111;
	int su2 = 2222;
	
	public Outter03() {
		System.out.println("create Outter03");
	}
	
	static void func01() {
		System.out.println("func01()");
		System.out.println(Inner03.su3);
		Outter03 outt = new Outter03();
		Inner03 inn = null;
		inn = outt.new Inner03(); //static은 객체를 찍는 것과 상관없이 static 공간에 들어가므로 우리가 직접 Outter 객체를 찍어야 가능
	}
	
	void func02() {
		System.out.println("func02()");
		Inner03 inn = null;
		inn = new Inner03(); //non-static은 객체를 찍어야하지만 이미 Outter03의 객체가 찍혀야만 가능하므로 되는 것
	}
	
	class Inner03{
		// 인스턴스 클래스는 내부에 satic 접근제어자를 넣을 수 없음
		// 단! 예외 한 가지 상수(상수형변수)는 가능 -> 클래스영역에 올리므로
//		static int su3 = 3333;
		final static int su3 = 3333;
		int su4 = 4444;
		
		public Inner03() {
			System.out.println("create Inner03()");
		}
		
//		static void func03() {}
		
		void func04() {
			System.out.println("func04()");
			System.out.println(su3);
			System.out.println(su4);
			System.out.println(su1);
			System.out.println(su2);
			func01();
			func02();
		}
	}
}


public class Ex03 {
	public static void main(String[] args) {
		
		System.out.println(Outter03.Inner03.su3); //상수니까 당연히 따로 가능
		
		//스태틱 클래스가 아니므로 직접 접근 불가능(잘생각해보면 클래스니까 당연하다)
		
		Outter03.func01();
		System.out.println("------------------------");
		Outter03 outt = new Outter03();
		outt.func02();
		Outter03.Inner03 inn = null;
		inn =  outt.new Inner03(); //아우터 찍은 객체에 내부 객체를 찍어야 가능
		
		System.out.println(inn.su4);
		inn.func04();
		
	}
}
