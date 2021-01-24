package com.bit.day08;

public class Ex03 {
	public static void main(String[] args) {
		byte su1 = 127; 
		Byte su2 = 1;
		//Byte su3 = new Byte(1); 우리가 쓰는 숫자는 int이므로 오류남
		Byte su3 = new Byte(su1); 
		Byte su4 = new Byte("1"); 
		// Byte su4 = new Byte("128"); 
		//문자열인데 바이트 기준 숫자 범위를 벗어났으므로 인식 못함
		
		System.out.println(su3);
		System.out.println(su4);
		
	}
}
