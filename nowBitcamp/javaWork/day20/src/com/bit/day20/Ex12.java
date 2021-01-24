package com.bit.day20;
//어나니머스 클래스를 이용한 스레드 생성
// 단 클래스 상속은 제약이 많으므로 주의 
public class Ex12 {
	public static void main(String[] args) {
		Thread thr1 = new Thread() {
			@Override
			public void run() {
				System.out.println("work..."); //어나니머스
			}
		};
		Thread thr2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("work2...");
			}
		});
		thr1.start(); //누가 먼저실행될지는 모름
		thr2.start();
		
		
	}
}
