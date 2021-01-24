package com.bit.day08;

public class Ex10 {
	public static void func01() {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {return;} 
			// 메소드 stack영역에서 value값을 반환 
			// 5일때 스택영역에서 메서드가 걷어지니 끝나는것임
			System.out.println("return " + i); 
		}
		System.out.println("return end"); //그래서 이것마저도 출력안됨
	}
	public static void func02() {
		for(int i = 0; i < 10; i++) {
			if(i == 5) {break;} 
			// break - switch, for, while, do~while 에서의 탈출 그 외 사용이 안됨
			System.out.println("break " + i);
		}
		System.out.println("break end");
	}
	public static void func03() {
		// continue - 반복문에서만 쓰임
		for(int i = 0; i < 10; i++) {
			if(i == 5 || i == 9) {continue;}
			System.out.println("continue " + i);
		}
		System.out.println("continue end");
	}
	public static void main(String[] args) {
		func01();
		func02();
		func03();
		//System.exit(0); 
		//종료코드, 정말 안씀 (0 : 정상종료, 1 이상, 0 미만 : 강제 종료)
		//사실 자바에서는 어떻게 종료되든(무슨 숫자가 들어가든) 상관없음
		//하지만 운영체제 등에서는 무언가의 의미가 있으니 
		//retrun; 을 사용하는 게 맞음
	}
}
