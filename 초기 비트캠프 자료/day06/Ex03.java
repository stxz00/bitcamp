package com.bit.day06;

class Ex03{
	
	public static void main(String[] args){

		String st1 = "java";
		String st2 = "java";
		String st3 = new String(st1);
		
		System.out.println(st1 == st2); //true
		System.out.println(st1.equals(st2)); //true
		System.out.println(st1 == st3); //false
		System.out.println(st1.equals(st3)); //true
		
		// equals() 비교는 레퍼런스 비교가 아닌 객체와 상관없이 value값 비교를 함
		// == 동등비교 연산자는 참조변수면 레퍼런스를 비교. 기본자료형이면 value값을 비교
		
	}	
}