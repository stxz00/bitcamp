package com.bit.day10;

public class Ex06 implements Cloneable {
	public static void main(String[] args) {
		Ex06 me = new Ex06();
		
		try {
			Object obj = me.clone(); 
			System.out.println(obj);
			//만일 Object가 클론이 되면 모든 클래스는 객체 복사가 가능하니까 막아놈
			//그래서 인터페이스 Cloneable 을 상속하면 가능해짐
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
	}
}
