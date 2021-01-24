package com.bit.day08;

import java.util.Scanner;


public class Ex162 {
	
	static int totalStudentCount = 0;
	
	Ex162(){
		totalStudentCount++;
		studentId = totalStudentCount;
	}
	int studentId = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;
	int sum = kor + eng + math;
	int avg = sum*100/3/100;

	
	String table(){
		return (studentId + "     " + kor + "     " + eng + "     " + math + "     " +  sum + "     " + avg);
	}
	
	
	public static void main(String[] args) {
		String title = "학생성적관리프로그램(ver 0.2.0)";
		System.out.println(title);
		
		for(int i = 0; i < title.length(); i++) {
			System.out.print('-');
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		String input = null;
		
		String menu = "---------------------------------------\n학번| 국어 | 영어 | 수학 | 합계 | 평균 |\n---------------------------------------\n"; 
		
		Ex162[] totalStudent = new Ex162[100]; //최대 학생 입력 수 제한

		int count = 0;
		
		while(true) {
			System.out.print("1.보기 2.입력 0.종료 > ");
			input = sc.nextLine();
			
			if(input.equals("1")) {
				
				if(totalStudentCount == 0) {
					System.out.print(menu);
					System.out.println("먼저 입력부터 하시기 바랍니다");
					continue;
				}
				
				System.out.print(menu);
				
				for(int i = 0; i < count; i++) {
					System.out.println(totalStudent[i].table());
				}
				
			}
				
			
			if(input.equals("2")) {
				
				if(totalStudent[99] != null) {
					System.out.println("더 이상 추가할 수 없습니다.");
					continue;
				}
				count++;
				Ex162 student = new Ex162();
				System.out.print(student.studentId +"번 국어> ");
				student.kor = sc.nextInt();
				while(student.kor > 100 || student.kor < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(student.studentId +"번 국어> ");
					student.kor = sc.nextInt();
				}
				
				System.out.print(student.studentId +"번 영어> ");
				student.eng = sc.nextInt();
				while(student.eng > 100 || student.eng < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(student.studentId +"번 영어> ");
					student.eng = sc.nextInt();
				}
				System.out.print(student.studentId +"번 수학> ");
				student.math = sc.nextInt();
				while(student.math > 100 || student.math < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(student.studentId +"번 수학> ");
					student.math = sc.nextInt();
				}
				totalStudent[count-1] = student;
				
				
				sc.nextLine();
			}
			
			if(input.equals("0")) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			
		}
		
		sc.close();
		
		
	}
}
