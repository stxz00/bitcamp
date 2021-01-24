package com.bit.day08;

import java.util.Scanner;

/*
학생성적관리프로그램(ver 0.2.0) 다중배열이나 객체배열로
--------------------------------
총원>3 

1.보기 2.입력 0.종료>1
--------------------------------
학번 | 국어 | 영어 | 수학 |합계
--------------------------------


1.보기 2.입력 0.종료>2
1번 국어>90
1번 영어>80
1번 수학>70

1.보기 2. 입력 0.종료>1
--------------------------------
학번 | 국어 | 영어 | 수학  |합계
--------------------------------
1      90    80      70		000


*/
public class Ex16 {
		
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
		
		int students = 0;
		
		int studentId = 0;
		
		System.out.print("총원> ");
		input = sc.nextLine();
		
		students = Integer.parseInt(input);
		
		int[][]arr1 = new int[students][]; 
		
		
		
		
		while(true) {
			System.out.print("1.보기 2.입력 0.종료 > ");
			input = sc.nextLine();
			
			if(input.equals("1")) {
				
				if(studentId == 0) {
					System.out.println("먼저 입력부터 하시기 바랍니다");
					continue;
				}
				
				System.out.print(menu);
				
				for(int i = 0; i < arr1.length; i++) {
					for(int j = 0; j < arr1[i].length; j++) {
						System.out.print(arr1[i][j]+"     ");
						}
					System.out.println();
				}
				
			}
			
			if(input.equals("2")) {
				studentId++;
				if(students+1 == studentId) {
					System.out.println("총원 모두 입력하셨습니다");
					continue;
				}
				System.out.print(studentId +"번 국어> ");
				int kor = sc.nextInt();
				System.out.print(studentId +"번 영어> ");
				int eng = sc.nextInt();
				System.out.print(studentId +"번 수학> ");
				int math = sc.nextInt();
				int sum = kor+eng+math;
				int avg = sum*100/3/100;
				int[]arr2 = {studentId,kor,eng,math,sum,avg};
				arr1[studentId-1] = arr2;
				sc.nextLine();
			}
			
			if(input.equals("0")) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			
		}
		
	}
}
