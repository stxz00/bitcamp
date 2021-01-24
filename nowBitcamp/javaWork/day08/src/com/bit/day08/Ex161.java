package com.bit.day08;

import java.util.Scanner;


public class Ex161 {
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
	
		int[][]arr1 = new int[100][]; //최대 학생 입력 수 제한
		int[]arr2 = null;
		
		int studentId = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		while(true) {
			System.out.print("1.보기 2.입력 0.종료 > ");
			input = sc.nextLine();
			
			if(input.equals("1")) {
				if(studentId == 0) {
					System.out.print(menu);
					System.out.println("먼저 입력부터 하시기 바랍니다");
					continue;
				}
				
				System.out.print(menu);
				
				for(int i = 0; i < studentId; i++) {
					for(int j = 0; j < arr1[i].length; j++) {
						System.out.print(arr1[i][j]+"     ");
						}
					System.out.println();
				}
			}
			
			if(input.equals("2")) {
				if(arr1[99] != null) {
					System.out.println("더 이상 추가할 수 없습니다.");
					continue;
				}
				
				studentId++;

				System.out.print(studentId +"번 국어> ");
				kor = sc.nextInt();
				while(kor > 100 && kor < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(studentId +"번 국어> ");
					kor = sc.nextInt();
				}
				
				System.out.print(studentId +"번 영어> ");
				eng = sc.nextInt();
				while(eng > 100 && eng < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(studentId +"번 영어> ");
					eng = sc.nextInt();
				}
				System.out.print(studentId +"번 수학> ");
				math = sc.nextInt();
				while(math > 100 && math < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(studentId +"번 수학> ");
					math = sc.nextInt();
				}
				int sum = kor+eng+math;
				int avg = sum*100/3/100;
				arr2 = new int[]{studentId,kor,eng,math,sum,avg};
				arr1[studentId-1] = arr2;
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
