package com.bit.day07;

public class Ex11 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Machine obj;
		System.out.print("1.Tv 2.Radio 3.Audio \n >");
		int input = Integer.parseInt(sc.nextLine());
		
		if(input == 1) {
			obj = new Tv();
		}else if(input == 2) {
			obj = new Radio();
		}else {
			obj = new Audio();
		}
		//같은 코드지만 어떤 객체를 넣어주느냐에 따라서 수행할 문장과 실행이 다른것 -> 다형성
		obj.on();
		obj.work();
		obj.off();
		
		
		/*
		Tv obj1 = new Tv();
		obj1.on();
		obj1.work();
		obj1.off();
		Radio obj2 = new Radio();
		obj2.on();
		obj2.work();
		obj2.off();
		Audio obj3 = new Audio();
		obj3.on();
		obj3.work();
		obj3.off();
		*/
	}
}
