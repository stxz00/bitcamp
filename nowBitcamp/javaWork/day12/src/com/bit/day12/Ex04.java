package com.bit.day12;

import java.util.LinkedList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
//		List list = new LinkedList();
//		list.poll(); //인터페이스가 안되도록 막아놈 
		
		//큐는 선입선출, 먼저 나온 얘가 먼저 나오게(ex)전화응대, 관공서 동시접속)
		
		java.util.Queue que = new LinkedList();
		
		// 접속 대기자들을 큐로 저장했다가(대기) 순서가 오면 접속시킴
		// insert , remove, element 이 3개 메서드만 있음(원래 각 명칭이 offer, poll, peek 이었는데 명칭 통일함)
		que.offer("1번째");
		que.offer("2번째");
		que.offer("3번째");
		que.offer("4번째");
		
		/*
		System.out.println(que.peek()); 
		que.poll(); //끄집어 내야 다음 픽이 가능
		System.out.println(que.peek()); 
		que.poll();
		System.out.println(que.peek()); 
		que.poll();
		System.out.println(que.peek()); 
		que.poll();
		 */
/*
		while(que.peek() != null) {
			System.out.println(que.poll());
		}
*/
		while(true) {
			if(que.peek() == null) {break;}
			System.out.println(que.poll());
		}
		
		
		
	}
}
