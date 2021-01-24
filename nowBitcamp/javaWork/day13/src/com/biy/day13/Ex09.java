package com.biy.day13;
/*
class Node{
	void func() {
		System.out.println("기능 실행...");
	}
}
*/
class Temlate{
	// static T newInstance(T node2) { 클래스에 스태틱을 쓰면 객체를 안쓰고 되니까 제네릭이 안됨
	static <T>Box<T> newInstance(T ball) {
	//제네릭 메서드
	//메서드의 선언부에 제네릭 타입이 선언된 것
	//Box<T>타입으로 리턴할건데 선언부에 타입변수를 놓음으로써 Box<T>의 무슨 타입으로 정해서 리턴할건지 확정을 내게 해줌
		
		Box<T> box = new Box<>();
		box.push(ball);
		return box;
	}
	//리턴타입이 제네릭이 붙었고 그 박스의 타입을 제네릭으로함
}

public class Ex09 {
	public static void main(String[] args) {
		BaseBall ball = new BaseBall();
		
		Box<BaseBall> box = Temlate.newInstance(ball);
//		Box<BaseBall> box = Temlate.<BaseBall>newInstance(ball); 뒤 제네릭 생략가능
		box.pull().play();
	}
}
