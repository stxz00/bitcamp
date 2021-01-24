package com.bit.day05;

class Ex13{
	// 문자열을 숫자로 받는 방법
	// 받아야할 문자가 숫자로만 이루어져야함
	public static void main(String[] args){
		String msg = "12";
		System.out.println(msg+1); //문자열에 문자 1을 추가
		int su = Integer.parseInt(msg); // 인티저 파스인트는 문자열을 int형으로 변환
		System.out.println(su+1);
	}
}