package com.bit.day18;

abstract class Lec07{
	public abstract void func01();
}

interface Inter07{
	void func02();
}
// 추상클래스, 인터페이스 모두 상속을 통하고 추상메서드로 구현하니 가능함
public class Ex07 {
	
	
	public static void main(String[] args) {
		Lec07 ex01 = new Lec07() {
			
			@Override
			public void func01() {
				System.out.println();
			}
		};
		
		Inter07 ex02 = new Inter07() {
			public void func02() {
				System.out.println();
			}
		};
	}
}
