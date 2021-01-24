package com.bit.day08;

public class Ex04 {
	public static void main(String[] args) {
		
	long su1 = 1234;
	Long su2 = 1234L;
	Long su3 = new Long(1234); // 오토캐스팅으로 long형으로 변환 후 객체만듬
	Long su4 = new Long("1234"); //(x)new Ling("1234L"); 당연한 것
	System.out.println(su4);
	}
}
