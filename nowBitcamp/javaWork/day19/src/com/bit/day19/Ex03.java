package com.bit.day19;

public class Ex03 {
	
	
	static void func02() {
		for(int i = 0; i < 10; i++) {
			if(i != 0) {continue;}//반복문의 제어권 
			System.out.println("반복");
//			break; // 제어문의 제어권, 제어문의 탈출(if문 제외);
			//return;// 메서드의 제어권
			
		}
		System.out.println("반복문뒤");
		return;
	}
	
	
	
	static void func01() {
		return;
	}
	
	
	
	public static void main(String[] args) {
		//return은 메서드3의 종료, 초룿ㄹ한 쪽으로 돌아간다, 스택에서 뽑아낸다
		func01();
		
		return;
	}
}
