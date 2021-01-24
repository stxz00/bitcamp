package com.bit.day11;

public class Ex05 {
	public static void main(String[] args) {
		// CRUD
		StringBuffer msg = new StringBuffer("abcd");
		
		System.out.println(msg.append("efg"));
		System.out.println(msg.insert(4, "ADD")); // 중간에 끼워 놓을 위치 선정
		// msg = abcdADDefg
		System.out.println(msg.replace(4,7,"EDIT")); //4번째부터 7번째까지를 EDIT으로 교체
		// msg = abcdEDITefg
		System.out.println(msg.delete(4, 8));
		// msg = abcdefg
		System.out.println(msg.length());

		msg.reverse(); //순서를 뒤집음
		System.out.println(msg);

		char[] a = new char[7];
		msg.getChars(0, 7, a, 0);
		
		System.out.println(a);
		
		// 처음에 String을 쓰다가 StringBuffer를 사용할 지 고민하면 됨
	}
}
