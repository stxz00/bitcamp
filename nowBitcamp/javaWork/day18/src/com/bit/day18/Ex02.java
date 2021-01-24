package com.bit.day18;

class Outter02{
	
	 
	static class Inner02{
		//스태틱 클래스는 안에 있을 뿐 접근 방식은 기존과 같음
		// 제일 접근이 쉬운 클래스
		static int su3 = 3333;
		int su4 = 4444;
		
		Inner02(){
			System.out.println("create Inner..");
		}
		
		static void func03() {
			Inner02 me = new Inner02();
			System.out.println(me.su4); //내 클래스 안의 메서드이므로 가능 밴다이어그램으로 생각해보면 스태틱은 더 큰 범주고 su4는 Inner02의 내부이니까 접근할려면 객체 찍고 해야함
			System.out.println("inner static func03()..");
			System.out.println(su1);
			System.out.println(su3);
			Outter02 outt = new Outter02();
			System.out.println(outt.su2); // 당연하게 스태틱 아니면 객체생성 후 가능
			func01();
			outt.func02();
		}
		void func04() {
			System.out.println("inner func04()..");
			System.out.println(su1);
			System.out.println(su4);
			func01();
			Outter02 outt = new Outter02();
			System.out.println(outt.su2);
			outt.func02();
		}
		
		
	}

	static int su1 = 1111;
	int su2 = 2222;
	
	public Outter02() {
		System.out.println("create Outter...");
	}
	
	static void func01() {
		System.out.println("Outter static func01..");
		Inner02 inn = new Inner02();
		System.out.print(inn.su4);
	}
	void func02() {
		System.out.println("Outter non-static func02()..");
		Inner02 inn = new Inner02();
		System.out.print(inn.su4);
	}
}

	


public class Ex02 {
	
	
	public static void main(String[] args) {
		Outter02.Inner02 inner = new Outter02.Inner02();
		
		Outter02.Inner02.func03();
		System.out.println(Outter02.Inner02.su3);
		System.out.println(inner.su4);
		inner.func04();
	}
}
