package com.bit.day08;

public class Ex01 {
	//래퍼클래스
	// 기본자료형의 객체타입
	// boxing(랩핑) : 기본자료형 -> 객체화
	// unboxing(언랩핑) : 객체타입 -> 기본자료형
	// 필요에 따라 자동으로 박싱과 언박싱이 이루어짐
	
	public static void func01(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		func01(new Ex01());
		func01("abcd");
		func01(new int[] {1,3,5,7});
		//모두 참조변수이기 때문에 가능
		func01(1234); //int 자료형인데 가능 -> wrappaer 클래스 때문(박싱) 출력할때 언박싱
		
	}
}
