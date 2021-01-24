package com.bit.day21;

class Target02{
	int sum;
	
	public void plus(int a, int b) {
		for(int i=a; i<=b; i++) {
			synchronized(this) {
				int temp=sum+i;
				sum=temp;
			}
			String name=Thread.currentThread().getName();
			System.out.println("working "+name+" thread...");
		}
	}
	
	public void printSum() {
		System.out.println("sum="+sum);
	}
}

class User021 extends Thread{
	Target02 target02;
	public User021(Target02 target) {
		target02=target;
	}
	@Override
	public void run() {
		target02.plus(1, 50);
	}
}

class User022 extends Thread{
	Target02 target02;
	public User022(Target02 target) {
		target02=target;
	}
	@Override
	public void run() {
		target02.plus(51, 100);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		//sum=500500
		Target02 target02=new Target02();
		User021 user1=new User021(target02);
		User022 user2=new User022(target02);
		user1.start();
		user2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		target02.printSum();//sum=500500
	}

}













