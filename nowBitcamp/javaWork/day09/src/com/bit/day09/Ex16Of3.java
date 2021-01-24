package com.bit.day09;

import java.util.Scanner;

public class Ex16Of3 {
	public static void main(String[] args) {
		String title = "학생성적관리프로그램(ver 0.2.0)";
		System.out.println(title);
		
		for(int i = 0; i < title.length(); i++) {
			System.out.print('-');
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		String input = null;
		
		String menu = "---------------------------------------\n학번| 국어 | 영어 | 수학 | 합계 | 평균 |\n---------------------------------------\n"; 
	
		 
		int[][]arr1 = null; 
		int[]arr2 = null; // arr1 열 입력용
		int[][]arr3 = null; // arr1 저장, 복사용
		
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
					for(int j = 0; j < arr3[i].length; j++) {
						System.out.print(arr3[i][j]+"     ");
						}
					System.out.println();
				}
			}else if(input.equals("2")) {
				
				studentId++;
/////////////////////////////복사한 행까지만 카피//////////////////////		
				arr1 = new int[studentId][6];
				if(studentId != 1) {
					for(int i = 0; i < studentId-1; i++) {
						System.arraycopy(arr3[i], 0, arr1[i], 0, arr3[i].length);
					}
				}
//////////////////////////////////////////////////////////////////////				

				System.out.print(studentId +"번 국어> ");
				kor = Integer.parseInt(sc.nextLine());
				while(kor > 100 || kor < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(studentId +"번 국어> ");
					kor = Integer.parseInt(sc.nextLine());
				}
				
				System.out.print(studentId +"번 영어> ");
				eng = Integer.parseInt(sc.nextLine());
				while(eng > 100 || eng < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(studentId +"번 영어> ");
					eng = Integer.parseInt(sc.nextLine());
				}
				System.out.print(studentId +"번 수학> ");
				math = Integer.parseInt(sc.nextLine());
				while(math > 100 || math < 0) {
					System.out.println("0~100점 이내로 입력하세요");
					System.out.print(studentId +"번 수학> ");
					math = Integer.parseInt(sc.nextLine());
				}
				System.out.println("숫자로만 입력하세요");
					
				
				int sum = kor+eng+math;
				int avg = sum*100/3/100;
				arr2 = new int[]{studentId,kor,eng,math,sum,avg};
				
				arr1[studentId-1] = arr2;
//////////////////////////////////////////////////////////////////////				
				arr3 = arr1.clone(); //복제
//////////////////////////////////////////////////////////////////////				
			}else if(input.equals("0")) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}else {
				System.out.println("올바른 번호를 입력바랍니다");
			}
		}
		sc.close();	
	}

}



	