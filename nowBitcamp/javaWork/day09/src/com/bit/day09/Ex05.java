package com.bit.day09;

//사용자 적용 Exception 클래스

class MyErr extends Exception{ 
	//Exception을 상속함 -> MyErr 객체를 만들 때 Exception나도록!
	MyErr(){
		super("0으로 나눠서"); 
	}
}

public class Ex05 {
	public static void main(String[] args) {
		int su = 0;
		try {
			func01(su);
		}catch(MyErr e) {
			e.printStackTrace();
		}
		System.out.println(su);
	}
	
	public static void func01(int a) throws MyErr {
		int b = 0;
//		Object obj = new Object();
//		throw obj; //기존에 Exception 클래스가 아니면 throw가 안됨
		MyErr obj = new MyErr(); 
		if(a == 0) {throw obj;}
		b = 10/ a;
		System.out.println(10 + " / " + a + " = " + b);
	}
}
