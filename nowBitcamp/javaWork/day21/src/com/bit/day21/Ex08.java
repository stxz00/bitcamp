package com.bit.day21;

class Target08 extends Thread{
	
	public synchronized void func() {
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		System.out.println(getName()+" start...");
		func();
		System.out.println(getName()+" end...");
	}
}

public class Ex08 {

	public static void main(String[] args) {
		Target08 target=new Target08();
		target.start();
	}

}
