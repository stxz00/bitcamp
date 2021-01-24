package com.bit.day20;

public class Ex15 {
	public static void main(String[] args) {
		System.out.println("start...");
		Long a = System.currentTimeMillis();
		try {
			Thread.sleep(1000); // 1초는 반드시 쉬지만 1초 후 바로 진행한다는 보장은 없음(당연함)
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		Long b = System.currentTimeMillis();
		System.out.println((int)(b-a));
		System.out.println("end...");
	}
}
