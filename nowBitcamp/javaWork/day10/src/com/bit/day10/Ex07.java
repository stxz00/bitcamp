package com.bit.day10;

import java.util.Scanner;

interface Machine02{
	public void on();
	public void off();
	public void work();
}

class Tv02 implements Machine02{

	@Override
	public void on() {
		System.out.println("Tv를 켜다");
		
	}

	@Override
	public void off() {
		System.out.println("Tv를 끄다");
		
	}

	@Override
	public void work() {
		System.out.println("화면을 출력한다");
		
	}

}
class Radio02 implements Machine02{

	@Override
	public void on() {
		System.out.println("라디오를 켜다");
		
	}

	@Override
	public void off() {
		System.out.println("라디오를 끄다");
		
	}

	@Override
	public void work() {
		System.out.println("음향을 출력한다");
		
	}
	
}



public class Ex07 {
	public static void main(String[] args) {
		Machine02 machine;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1.Tv 2. Radio>");
		int input = Integer.parseInt(sc.nextLine());
		
		if(input ==1) {
			machine = new Tv02();
		}else {
			machine = new Radio02();
		}
		machine.on();
		machine.work();
		machine.off();
	}

}
