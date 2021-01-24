package com.bit.exercise;

import java.util.Scanner;

public class Form {
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("학생 성적 프로그램 HashSet ver.");
			System.out.println("------------------------------------");
			
			String main ="1.보기 2.입력 3.수정 4.삭제 0.종료\n>";
			String menu = "------------------------------------\n";
			menu +="학번\t국어\t영어\t수학\n";
			menu += "------------------------------------";
			String input = null;
			while(true) {
				System.out.print(main);
				input = sc.nextLine();
				if(input.equals("0")) {
					break;
				}
				if(input.equals("1")) {
					System.out.println(menu);
						
			
					
					
					
				}
				if(input.equals("2")) {
					System.out.print("학번>");
					input = sc.nextLine();
						
					
					
				}
				if(input.equals("3")) {
					System.out.print("수정할 학번>");
					input = sc.nextLine();
				
					
					
					
				}
				if(input.equals("4")) {
					System.out.print("삭제할 학번>");
					input = sc.nextLine();
					
				}
		}
		System.out.println("이용해주셔서 감사합니다");
		sc.close();
	}
}
