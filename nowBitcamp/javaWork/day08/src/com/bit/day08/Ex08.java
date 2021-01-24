package com.bit.day08;

public class Ex08 {
	public static void main(String[] args) {
		char ch1 = 'a';
		Character ch2 = 'A';
		Character ch3 = new Character('A');
		System.out.println("유니코드인지 : " + Character.isAlphabetic(ch1));
		System.out.println("유니코드인지 : " + Character.isLetter(ch1));
		//그냥 둘이 같음
		System.out.println("숫자인지 : " + Character.isDigit(ch1));
		System.out.println("대문자인지 : " + Character.isUpperCase(ch1));
		System.out.println("소문자인지 : " + Character.isLowerCase(ch1));
		System.out.println("스페이스인지 : " + Character.isSpace(ch1));
		System.out.println("스페이스인지 : " + Character.isWhitespace(ch1));
		char ch4 = 'a';
		System.out.println(Character.toUpperCase(ch4));
		System.out.println(ch4);
		System.out.println(Character.toLowerCase(ch4));
	}
}
