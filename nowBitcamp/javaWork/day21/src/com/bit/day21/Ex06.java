package com.bit.day21;

class Target06 extends Thread{
	int su;
	@Override
	public void run() {
		for(int i=su; i<su+10; i++){
			if(i<100) {yield();}
			System.out.println(getName()+" working..."+i);
		}
	}
}

public class Ex06 {

	public static void main(String[] args) {
		Target06 target1=new Target06();
		Target06 target2=new Target06();
		target1.su=10;
		target2.su=100;
		target1.start();
		target2.start();
	}

}
