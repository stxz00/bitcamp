package com.bit.day19;

abstract class Machine01{
	void on() {System.out.println("켜다");}
	void off() {System.out.println("끄다");}
	void work() {}
}

class Tv01 extends Machine01 {
	void work() {System.out.println("방송을 보여주다");}
}


class Radio01 extends Machine01 {
	void work() {System.out.println("방송을 들려준다");}
}


public class Ex06 {
	
	public static void main(String[] args) {
		Machine01 machine = new Radio01() {}; //다형성
		machine.on();
		machine.work();
		machine.off();
		
		
		int input = 1;
		if(input ==1) {
			machine = new Tv01();
			machine.on();
			machine.work();
			machine.off();
		}
		
	}
}
