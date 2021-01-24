package com.bit.day19;

public class Ex02 {
	// 전역변수 - 클래스단에 선언된 변수
	static int su1; //클래스변수
	int su2;	//멤버필드, 인스턴스 변수
	Ex02 you = null;
	
	public static int plus() {
		return x+y;
	}
	static int x,y;
	public static void main(String[] args) {
		//변수의 라이프사이클
		// 지역변수 - 메서드 내부에서 선언된 변수
		//				메서드 내부에서만
		int a;
		
		String msg;
		Ex02 me = new Ex02();
		me.x=100;
		me.y=10;
		int x,y;
		x = 100;
		y = 10;
		int z = plus();
//		if() {}
		for(;;) {
			int b;
			//~b
		}
		
//		try {int b
			//~b
//		}catch() {}
		
		
		
		//~~~~a
	}
}
