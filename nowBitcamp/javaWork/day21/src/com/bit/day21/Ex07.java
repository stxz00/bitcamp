package com.bit.day21;

class Target07 extends Thread{
	boolean boo2=true;
	boolean boo=true;
	@Override
	public void run() {
		while(boo2) {
			if(boo) {
				System.out.println(getName()+" working...");
				for(long i=0; i<1000000000; i++) {}
			}else {
				yield();
			}
		}
	}
	
}

public class Ex07 {

	public static void main(String[] args) {
		Target07 target1=new Target07();
		Target07 target2=new Target07();
		target1.boo=true;
		target2.boo=false;
		target1.start();
		target2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		target2.boo=true;
		target1.boo=false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		target1.boo=true;
		target2.boo=false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		target2.boo2=false;
		target1.boo2=false;
	}

}
