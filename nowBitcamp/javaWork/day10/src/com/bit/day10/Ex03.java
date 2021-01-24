package com.bit.day10;

// 부모 클래스를 사용하고 싶지 않을 때 추상클래스 선언
abstract class Machine01{
	void on() {
		System.out.println("전원on");
	}
	void off() {
		System.out.println("전원off");
	}
	abstract void work(); // 메서드 강제성 부여
}

class Tv01 extends Machine01{
	void work() {
		System.out.println("화면을 전송한다");
	}
}

class Radio01 extends Machine01{
	void work() {
		System.out.println("소리를 전송한다");
	}
}

class Audio01 extends Machine01{

	@Override //어노테이션, 해당 메서드가 명세한 기능 대상이 아니면 오류남
	void work() {
		
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		
	
	Machine01 machine = new Tv01();
	machine.on();
	machine.off();
	machine.work();
	
	}

}
