	package com.bit.day11;
	
	
	
	class MyLinked{
		
		class Node{
			Node nxt;
			int val;
			
		}
		
		Node start;
		int cnt;
		
		void add(int su) {
			cnt++;
			Node node = new Node();
			node.val = su;
			if(cnt == 1) {
				start = node;
			}else {
				Node temp = start;
				while(true) {
					if(temp.nxt == null) {break;}
					temp = temp.nxt;
				}
				temp.nxt = node;
			}
			
			
			// 1.
	//		cnt++;
	//		Node node = new Node();
	//		node.val =su;
	//		start = node;
			// 2.
	//		cnt++;
	//		Node node = new Node();
	//		node.val = su; 
	//		start.nxt = node;
			// 3.
	//		cnt++;
	//		Node node = new Node();
	//		node.val = su;
	//		start.nxt.nxt = node;
	//		// 3.
	//		cnt++;
	//		Node node = new Node();
	//		node.val = su;
	//		start.nxt.nxt.nxt = node;
			
		}
		
		int size() {
			return cnt;
		}
		
		int get(int idx) {
			// 0 -> start.val
			// 1 -> start.nxt.val
			// 2 -> start.nxt.nxt.val
			Node temp = start;
			for(int i = 0; i < idx; i++) {
				temp = temp.nxt;
			}
			return temp.val;
		}
	}
	
	public class Ex14 {
		public static void main(String[] args) {
		//	java.util.LinkedList list = new java.util.LinkedList();
			MyLinked list = new MyLinked();
			list.add(1111);
			list.add(2222);
			list.add(3333);
			list.add(4444);
			list.add(5555);
			
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}
	}
	
	//Array일일히 값 복사, Linked는 일단 객체 찍고 주소값을 null이 없는 객체에 찍는 것. 입력, 수정, 삭제 빠름
	//열람적인 측면으로는 Array이나 입력 수정 삭제 등 유동적인 방면에서는 Linked가 좋음
	
	//학생성적 관리프로그램