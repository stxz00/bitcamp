package com.bit.day11;
// 자료구조
public class Ex01 {
	public static void main(String[] args) {
		// String 외 문자열
		// StringBuffer, StringBuilder 는 동일함, 그냥 스레드 안정,불안정 차이
		String st1 = "문자열";
		String st2 = new String(st1);
		//st1은 만들어 놓고 시작, st2는 나중에 만드는 차이
		StringBuffer st3 = new StringBuffer(st1);
		StringBuilder st4 = new StringBuilder(st1); //무조건 이렇게만 만들 수 있음
//		StringBuffer st5 = "문자열"; //얘는 시점만 다를뿐 st1임 
//		StringBuffer st6 = new String(st1); //String 클래스를 상속받는게 아닌 Object를 상속받기 때문
		
		System.out.println(st3);
		System.out.println(st4);
//		System.out.println(st3 + st3);
//		System.out.println(st4 + st4);
//		System.out.println(st3 + st4);
		//더하는 건 오직 String 클래스만 가능함 똑같은 문자열 클래스지만오직 메서드만 사용가능함.(일반 객체라고 생각하면 됨)
		
	}
}
