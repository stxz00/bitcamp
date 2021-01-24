package com.bit.day21;

class Target10 extends Thread{
	@Override
	public void run() {
		System.out.println(getName()+" working...");
		for(long i=0; i<10000000000L; i++) {}
		System.out.println(getName()+" end...");
	}
}

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("main start...");
		Target10 target=new Target10();
		target.setDaemon(true);
		target.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end...");
	}

}
