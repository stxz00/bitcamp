package com.biy.day13;

// api 문서해석

import java.util.ArrayList;
import java.util.List;

class Box03<T extends Number>{ //Number를 상속 받는 것들만 오도록 제약
	T su;
	void set(T su) {
		this.su = su;
	}
	T get() {
		return su;
	}
	
	// <? super(extends) Object> 괄호안의 객체의 본인과 본인의 부모(자식)를 상속하는 것만 되도록 제약 
	void func(java.util.List<? extends Number> list) {

	}
}

public class Ex07 {
	public static void main(String[] args) {
		Box03<Number> box = new Box03<>(); 
		box.set(2222);
//		System.out.println(box.get()+1);
//		Number는 객체니까 그냥 연산하면 안되므로 intValue()메서드 등 사용
		System.out.println(box.get().intValue()+1);
		List<Integer> list = new ArrayList<>();
		box.func(list);
		
		Box03<Integer> box1 = new Box03<>(); 
		box1.set(2222);
		System.out.println(box1.get() + 35353);

	}
}
