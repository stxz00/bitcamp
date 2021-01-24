package com.bit.day06;

class Ex04{

	public static void main(String[] args){
		String st1 = "문자";
		String st2 = "열";
		String st3 = st1 + st2;
		String st4 = "문자열";
		System.out.println(st1 + st2);
		System.out.println(st3 == st4);  // false
		// 정말 단순한 연산일때만 true가 나오는 것   ex)상수와 상수의 연산
		// ->변수의 값은 다를 수 있기 때문에 false가 나오는 것이다

		st4 = st1 + "열"; // st1의 값이 변하면 st4의 값도 영향을 주므로 x
		System.out.println(st3 == st4);  // false
		System.out.println(st1); 
		// 문자의 객체를 찍어냄.

		String st5 = st1 + "열";
		System.out.println(st1 == st5); // false
		System.out.println(st4 == st5); // false
		

		System.out.println(st1.concat("열")); // 문자열
		// .concat(" "); 더하기 연산자.

		String st6 = "문자" + "열";
		String st7 = "문자" + "열";
		String st8 = "문자" .concat("열");
		System.out.println(st6 == st7); // true
		System.out.println(st6 == st8); // false 
		// -> 두 케이스 모두 문자와 열 더하기 연산자지만 .concat()은 무조건 새로운 문자열을 찍어냄
		// 이래서 특수한 경우가 아니면 그냥 + 연산자를 쓰는 게 나음.
	
	}
}