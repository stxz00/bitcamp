package com.bit.day20;
//Runnable
public class Ex11 implements Runnable{
	
	
	public static void main(String[] args) {
		System.out.println("main start...");
		Ex11 me = new Ex11(); // 실행할 나를 만들고
		Thread thr1 = new Thread(me); // 스레드가 수행할 나를 생성자로 넣음
		Thread thr2 = new Thread(me);
		thr1.start(); // 스레드로 시작 코어에게 일을 주고 관리하도록 떤져줌
		thr2.start(); // 다중의 스레드는 start를 여러개 만들면 됨.
		System.out.println("main end...");
		
	}
	
	
	@Override
	public void run() {
		System.out.println("work..."); //할 일 리스트
		
	}

}
