package com.bit.day21;

class Target05{
	boolean boo;
	
	public synchronized void func() {
		if(boo) {
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class User05 extends Thread{	
	Target05 tar05;
	
	public User05(Target05 target) {
		tar05=target;
	}
	@Override
	public void run() {
		while(true) {
			tar05.func();
			System.out.println(getName()+" working...");
		}
	}
}

public class Ex05 {

	public static void main(String[] args) {
		Target05 target=new Target05();
		User05 user1=new User05(target);
		User05 user2=new User05(target);
		user1.start();
		user2.start();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		target.boo=true;
	}

}
