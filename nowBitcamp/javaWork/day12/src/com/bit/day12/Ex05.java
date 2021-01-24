package com.bit.day12;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex05 {
	public static void main(String[] args) {
		// 스택은 클래스로 따로 만들어놓음
		// 인터페이스 vector를 상속받음
		// 후입선출(LIFO)
		//peek 선택 pop 제거 push 추가
		
		Stack stack = new Stack();
		stack.push("첫번째");
		stack.push("두번째");
		stack.push("세번째");
		stack.push("네번째");
		System.out.println(stack.search("세번째")); //indexOf
	
/*
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
*/
		/*
		try {
			while(true) {
				System.out.println(stack.peek());
				stack.pop();
			}
		}catch(EmptyStackException e) {}
		 */
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
	}
}
