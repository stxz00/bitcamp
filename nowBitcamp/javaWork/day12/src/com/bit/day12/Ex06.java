package com.bit.day12;

import java.util.LinkedList;

public class Ex06 {
	public static void main(String[] args) {
		//deque
		//딱히 쓸 일이 아예 없음
		java.util.Deque que = new LinkedList();
		//LinkedList는 Deque를 상속받음
		//Queue와 Stack을 동시에 사용함(중간의 값은 빼지 못함)
		//addFirst(e) addLast(e) / offerFirst(e) offerLast(e)
		//removeFirst() removeLast() / pollFirst() pollLast()
		//getFirst() getLast() / getLast() peekLast()
		
		
		//Queue
		que.offerFirst(1111);
		que.offerFirst(2222);
		que.offerFirst(3333);
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println("-----------------");
		que.offerLast(1111);
		que.offerLast(2222);
		que.offerLast(3333);
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println("-----------------");
		System.out.println("-----------------");
		// Stack
		que.offerFirst(1111);
		que.offerFirst(2222);
		que.offerFirst(3333);
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println(que.pollFirst());
		System.out.println("-----------------");
		que.offerLast(1111);
		que.offerLast(2222);
		que.offerLast(3333);
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());
		System.out.println(que.pollLast());	
	}
}
