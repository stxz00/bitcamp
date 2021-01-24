package com.bit.day20;

public class Ex13 implements Runnable{
	
	public static void main(String[] args) {
//		String name = "main";
		String name = Thread.currentThread().getName(); //현재 main 쓰레드이니 main의 네이밍이 나온다 
		System.out.println(name + "thread...");
		

		Thread me = new Thread(new Ex13(),"첫번째"); // 직접 네이밍을 줄 수 있음
		Thread you = new Thread(new Ex13(),"두번째");
		you.setName("두번째"); // 따로 네이밍 줄수도 있음
		me.start();
		you.start();
	}
	
	@Override
	public void run() {
		Thread me = Thread.currentThread(); //getName();  new Ex13() 으로 인자를 넣은 경우 
		System.out.println(me.getName() + "thread...");
	}
}
