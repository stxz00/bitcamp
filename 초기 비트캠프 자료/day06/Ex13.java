package com.bit.day06;

class Ex13{

	public static void main(String[] args){
		String msg1 = new String("abcd");	
		String msg2 = new String("aaca");
		System.out.println(msg1.compareTo(msg2));  //1이 나옴
		//같으면 0 다르면 얼마나 다른지 차이 보여줌 1. 문자의 길이가 같은지 2. 처음 틀린부분부터 얼마나 다른지 숫자로 알려줌!
		
	}
}