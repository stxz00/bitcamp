package com.bit.day11;

import java.util.Scanner;

class Student{
	int num,kor,eng,math;
}

public class Ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = "학생성적관리 프로그램(ver 0.4.1)";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>";
		String table = "-----------------------------------------------";
		table += "\n학번\t국어\t영어\t수학";
		table += "\n-----------------------------------------------";
		System.out.println(title);
	
		System.out.print("총원>");
		int input = sc.nextInt();
		Student[] data = new Student[input];
/*		for(int i = 0; i < data.length; i++) {
			data[i] = new Student();
		}
*/		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt();
			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(table);
				
				for(int i = 0; i < data.length; i++) {
					Student stu = data[i];
					if(stu == null) {continue;}
					System.out.println(stu.num + "\t"+stu.kor + "\t"+stu.eng + "\t"+stu.math); 
				}
			}
			if(input == 2) {
				Student stu = new Student();
				System.out.print("학번> ");
				int num = sc.nextInt();
				
				try{
					data[num-1] = stu;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("존재하지 않는 학번입니다");
					continue;	
				}
				stu.num = num;
				System.out.print("국어>");
				stu.kor = sc.nextInt();
				System.out.print("영어>");
				stu.eng = sc.nextInt();
				System.out.print("수학>");
				stu.math = sc.nextInt();
				data[num-1] = stu;
				
			}
			if(input == 3) {
				Student stu = new Student();
				System.out.print("수정할 학번> ");
				int num = sc.nextInt();
				
				try{
					data[num-1] = stu;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("존재하지 않는 학번입니다");
					continue;	
				}
				stu.num = num;
				System.out.print("국어>");
				stu.kor = sc.nextInt();
				System.out.print("영어>");
				stu.eng = sc.nextInt();
				System.out.print("수학>");
				stu.math = sc.nextInt();
				data[num-1] = stu;
			}
			if(input == 4) {
				Student stu = new Student();
				System.out.print("삭제할 학번> ");
				int num = sc.nextInt();
				try{
					data[num-1] = stu;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("존재하지 않는 학번입니다");
					continue;	
				}
				data[num-1] = null;
			}
			
		}
		System.out.println("이용해주셔서 감사합니다");
		sc.close();
	}
}
