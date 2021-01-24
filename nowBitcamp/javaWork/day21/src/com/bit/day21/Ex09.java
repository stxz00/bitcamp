package com.bit.day21;

class Target09 extends Thread{
	
	@Override
	public void run() {
		System.out.println(getName()+" start...");
		for(long i=0; i<10000000000L; i++) {}
		System.out.println(getName()+" end...");
	}
}

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("main start...");
		Target09 target1=new Target09();
		Target09 target2=new Target09();
		target1.start();
		target2.start();
		try {
			target1.join(10000);
			target2.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end...");
	}

}








