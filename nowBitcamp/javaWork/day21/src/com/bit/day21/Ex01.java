package com.bit.day21;

import java.lang.Thread.State;

class Target01 extends Thread{
	@Override
	public void run() {
		System.out.println("target start...");
		int sum=0;
		for(int i=0; i<100000000; i++) {
			sum+=i;
		}
		try {
			sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sum=0;
		for(int i=0; i<1000000000; i++) {
			sum+=i;
		}
		System.out.println("target end...");
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Target01 target=new Target01();
		while(true) {
			Thread.State state = target.getState();
			System.out.println(state.toString());
			if(state==Thread.State.NEW) {
				target.start();
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(state==Thread.State.TERMINATED) {break;}
		}
	}

}









