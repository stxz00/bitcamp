package com.bit.day06;


class Ex01{

	public static void main(String[] args){
	
		String st1 = "문자열"; //String은 클래스타입, 참조변수 -> 객체생성 가능
		String st2 = new String();
		String st3 = new String(st1);
		String st4 = "문자열";
		String st99 = null; // + "aaa" 연산을 추가해도 안됨! 이상하게 되어버림
		String st5 = new String(st1);
		String st6 = "문자" + "열"; //상수와 상수의 연산 -> 즉 어차피 st1과 같으므로 st의 주소값으로 가는 것임!!(메모리 이득적으로 생각하면 됨)
		
		// st4와 st5은 다름 st4는 문자를 하나도 가지고 있지 않은 객체(이것도 하나의 집합임.)
		// st5는 객체가 없음.(가리킬 게 없다는 것) 하지만 표시를 해야하므로 null이라고 표시하는 것임
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
		System.out.println(st1 == st4); // true
		System.out.println(st2 == st3); // false
		System.out.println(st3 == st5); // false  객체와 객체는 주소가 다름(값을 비교하는 것이 아니므로)
		System.out.println(st1 == st6); // true
		System.out.println(st1 == st2); // false
		//이것이 자바 문법의 특성. 
		//객체의 표현으로 생각하면 일반 String들을 만들때 새로운 객체라고 해서 메모리 낭비나므로
		//일반 사용자가 상식적으로 납득할 수 있는 부분까지만 인정해줌. 
		// == 은 레퍼런스(주소값) 비교.
		// String 외 다른 객체에서는 이렇지 않으므로 주의!


	}

}
