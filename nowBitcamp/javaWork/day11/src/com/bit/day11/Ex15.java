package com.bit.day11;

import java.util.Scanner;

class Node2{
	Node2 nxt;
	Object val;
}

class MyLinked2{
	private Node2 start;
	private int cnt;
	
	void add(Object su) {
		cnt++;
		Node2 node = new Node2();
		node.val =  su;
		
		if(cnt == 1) {
			start = node;
		}else {
			Node2 temp = start;
			while(true) {
				if(temp.nxt == null) {break;}
				temp = temp.nxt;
			}
			temp.nxt = node;
		}
	}
	
	int size() {
		return cnt;
	}
	
	Object get(int idx) {
		Node2 temp = start;
		for(int i = 0; i < idx; i++) {
			temp = temp.nxt;
		}
		return temp.val;
	}
	
	void remove(int idx) {
		Node2 temp = start;
		Node2 temp2 = null;
		for(int i = 0; i < idx; i++) {
			temp = temp.nxt;
		}
		temp.val = null;
	}
	
	void set(int idx, Object su) {
		Node2 node = new Node2();
		Node2 temp = start;
		for(int i = 0; i < idx; i++) {
			temp = temp.nxt;
		}
		temp.val = su;
	}
	
}


class Student2{
	int num,kor,eng,math;
	
	@Override
	public String toString() {
		return this.num + "\t"+ this.kor + "\t"+this.eng + "\t"+ this.math;
	}

}


public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = "학생성적관리 프로그램(ver 0.4.1)";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>";
		String table = "-----------------------------------------------";
		table += "\n학번\t국어\t영어\t수학";
		table += "\n-----------------------------------------------";
		System.out.println(title);
		int input = 0;
		int studentId = 0;
		MyLinked2 list = new MyLinked2();
		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt();
			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(table);
				
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i) == null) {continue;}
					System.out.println(list.get(i).toString());
				}
			}
			if(input == 2) {
				Student2 stu = new Student2();
				stu.num = ++studentId;
				System.out.print(studentId + "번 국어> ");
				stu.kor = sc.nextInt();
				System.out.print(studentId + "번 영어> ");
				stu.eng = sc.nextInt();
				System.out.print(studentId + "번 수학> ");
				stu.math = sc.nextInt();

				list.add(stu);
			}
			if(input == 3) {
				System.out.print("수정할 학번>");
				Student2 stu = new Student2();
				input = sc.nextInt();
				try {
				list.set(input-1, stu);
				}catch(ArrayIndexOutOfBoundsException | NullPointerException e){
					System.out.println("존재하지 않는 학번입니다");
					continue;
				}
				stu.num = input;
				System.out.print(input + "번 국어> ");
				stu.kor = sc.nextInt();
				System.out.print(input + "번 영어> ");
				stu.eng = sc.nextInt();
				System.out.print(input + "번 수학> ");
				stu.math = sc.nextInt();
			}
			if(input == 4) {
				System.out.print("삭제할 학번>");
				input = sc.nextInt();
				try {
				list.remove(input-1);
				}catch(ArrayIndexOutOfBoundsException | NullPointerException e){
					System.out.println("존재하지 않는 학번입니다");
					continue;
				}	
			}
		}
		System.out.println("사용해주셔서 감사합니다");
		sc.close();
	}
}
