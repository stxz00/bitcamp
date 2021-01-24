package com.bit.day11;

public class Ex03 {
	public static void main(String[] args) {
		StringBuffer st1 = new StringBuffer("ab");
		StringBuffer st2 = new StringBuffer("cd");
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println("----------------------------");
		System.out.println(st1.append(st2));//(st1 + st2); append 메소드를 통해 더하기
		System.out.println("----------------------------");
		System.out.println(st1); // 위에 st2를 추가하였으므로 자기 자신이 바껴 abcd가 나옴.
		System.out.println(st2);
		//append는 캐릭터 시퀀스, 배열의 특정 인덱스, 숫자 등등 가능함
		System.out.println(st1.append(1234));
		System.out.println(st1.append("추가"));
		System.out.println(3.14);
		System.out.println("----------------------------");
		// charAt, indexOf, length(), replace(), substring(), toString() 있음
		
	}
}
