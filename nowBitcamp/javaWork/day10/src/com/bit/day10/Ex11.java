package com.bit.day10;

import java.util.Random;

public class Ex11 {
	public static void main(String[] args) {
		java.util.Random ran = new Random();
		//자료형이 가능한 범위까지 랜덤한 값 받음
		System.out.println(ran.nextBoolean());
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt(3));
		System.out.println(ran.nextInt(3));
	}
}
