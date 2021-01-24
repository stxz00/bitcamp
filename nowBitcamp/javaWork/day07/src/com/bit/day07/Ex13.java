package com.bit.day07;

import java.util.Scanner;

/*
학생성적관리프로그램(ver 0.2.0) 문자열
--------------------------------
총원>3

1.보기 2.입력 0.종료>1
--------------------------------
학번 | 국어 | 영어 | 수학  |합계
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

public class Ex13 {
		static int ID = 0;
		int korean = 0;
		int english = 0;
		int math = 0;
		int count = 0;

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생성적관리프로그램(ver 0.2.0)");
		System.out.println("--------------------------------");
		System.out.print("총원>");
		int input = sc.nextInt();
		
		int total = input;
		int[] studentID = new int[total];
		int[] studentKorean = new int[total];
		int[] studentEnglish = new int[total];
		int[] studentMath= new int[total];
		int[] totalPoint= new int[total];
		
		boolean boo2 = false;
		
		
		boolean boo = true;
		while(boo) {
			System.out.print("1.보기 2.입력 0.종료>");
			input = sc.nextInt();
			if(input == 1) {
				if(boo2 != true) {
					System.out.println("입력을 먼저 하세요");
				}else {
	
					System.out.println("--------------------------------");
					System.out.println("학번 | 국어 | 영어 | 수학 |합계");
					System.out.println("--------------------------------");
					
					for(int i = 0; i < total; i++) {
						System.out.println(studentID[i]+"      " +studentKorean[i]+"     "+studentEnglish[i]+"    "+studentMath[i]+"     "+totalPoint[i]);
					}
				}
					
			}else if(input == 2) {
				for(int i = 0; i < total; i++) {
					ID++;
					studentID[i] = ID;
					System.out.println("학번 " + studentID[i] +"번의 점수를 입력하세요");
					
					System.out.print("국어 > ");
					studentKorean[i] = sc.nextInt();
					while(studentKorean[i] >100 || studentKorean[i] < 0) {
						System.out.println("0~100점 이내로 입력하세요");
						System.out.print("국어 > ");
						studentKorean[i] = sc.nextInt();
					}
					
					System.out.print("영어 > ");
					studentEnglish[i] = sc.nextInt();
					while(studentEnglish[i] >100 || studentEnglish[i] < 0) {
						System.out.println("0~100점 이내로 입력하세요");
						System.out.print("영어 > ");
						studentEnglish[i] = sc.nextInt();
					}
					
					System.out.print("수학 > ");
					studentMath[i] = sc.nextInt();
					while(studentMath[i] >100 || studentMath[i] < 0) {
						System.out.println("0~100점 이내로 입력하세요");
						System.out.print("수학 > ");
						studentMath[i] = sc.nextInt();
					}
					totalPoint[i] = studentKorean[i] + studentEnglish[i] + studentMath[i];
					if(ID == total) {
						ID = 0;
						boo2 = true;
					}
				}
					
					
				
				
			}else if(input == 0) {
				System.out.println("프로그램을 종료합니다.");
				boo = false;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		sc.close();
		
	}
}
