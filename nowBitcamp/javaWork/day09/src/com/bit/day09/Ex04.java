package com.bit.day09;

public class Ex04 {
	public static void main(String[] args) {
		Ex04 me = new Ex04();
		Object obj = new Object();
		try {
		obj = func01(me);
		
		}catch(CloneNotSupportedException e) {		
			e.printStackTrace();
			System.out.println(obj.hashCode());
		}
	}
	/*
	public static Object func01(Ex04 me) {
		Object obj = null;
		try {
		obj=me.clone(); //protected 상속 안되어 있으니 오류
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();

		}
	}
	*/
	
	public static Object func01(Ex04 me) throws CloneNotSupportedException{
		Object obj = null;
		//try {
		obj=me.clone(); 
		//clone은 아까랑 다르게 트라이캐치 하라고 함
		//이유는 clone메서드가 CloneNotSupportedException을 떤진다고 정의되었기 때문 그래서 try/catch 또는 이 메서드를 throws 강제함
		//} catch(CloneNotSupportedException e) {
		//	e.printStackTrace();

		//}
		return obj;
	}
	
	// 호출하면 Exception이 생길 수 있으므로 main에 출력시 try/catch로 e.printStackTrace();를 하고 있었던 것!
	
	// 내가 원하는 에러 객체를 만들고 에러를 떤질 수 있음 아이디 길이라던지 이런거 예를 들 수 있다 
	// 코드 상에서도 에러를 만들어 떤진다
}
