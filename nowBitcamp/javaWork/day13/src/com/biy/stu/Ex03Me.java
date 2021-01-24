package com.biy.stu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student{
	int kor;
	int eng;
	int math;
	int stu;
	
	public String toString() {
		return "\t" + kor + "\t" + eng + "\t" + math; 
	}
}

public class Ex03Me {
	public static void main(String[] args) {
		Map<Integer,Student> data = new HashMap<Integer,Student>();
		String title = "학생성적관리프로그램(ver 0.5.0)";
		System.out.println(title);
		byte[] by = title.getBytes();
		for(int i = 0; i < by.length; i++) { //바이트단위로 한글 등 길이 맞춤
			System.out.print('-');
		}
		System.out.println();
		String header = "--------------------------------------";
		header += "\n학번\t국어\t영어\t수학\n";
		header += "--------------------------------------";
		String menu = "1.보기 2. 입력 3. 수정 4.삭제 0.종료\n>";
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt();
			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(header);
				
				Set keys = data.keySet();
				Iterator<Integer> ite = keys.iterator();
				while(ite.hasNext()) {
					Integer key = ite.next();
					System.out.print(key);
					System.out.println(data.get(key));
				}
				
			}
			if(input == 2) {
				Student stu = new Student();
				System.out.print("학번>");
				int num = sc.nextInt();
				System.out.print("국어>");
				stu.kor = sc.nextInt();
				System.out.print("영어>");
				stu.eng = sc.nextInt();
				System.out.print("수학>");
				stu.math = sc.nextInt();
				data.put(num, stu);
			
			}
			if(input == 3) {
				System.out.print("수정할 학번>");
				int num = sc.nextInt();
				Student stu = new Student();
				System.out.print("국어>");
				stu.kor = sc.nextInt();
				System.out.print("영어>");
				stu.eng = sc.nextInt();
				System.out.print("수학>");
				stu.math = sc.nextInt();
				
				data.put(num, stu);	
				
			}
			if(input == 4) {
				System.out.print("삭제할 학번>");
				int num = sc.nextInt();
				
				data.remove(num);
			}
		}

		sc.close();
	}
}
