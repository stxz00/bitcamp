package com.bit.day11;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] data;
		String title = "학생성적관리 프로그램(ver 0.4.1)";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료>";
		String table = "-----------------------------------------------";
		table += "\n학번\t국어\t영어\t수학";
		table += "\n-----------------------------------------------";
		System.out.println(title);
	
		System.out.print("총원>");
		int input = sc.nextInt();
		data = new int[input][3];
		
		while(true) {
			System.out.print(menu);
			input = sc.nextInt();

			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(table);
				for(int i = 0; i < data.length; i++) {
					int[] stu = data[i];
					String msg = i+1+"\t"+stu[0]+"\t"+stu[1]+"\t"+stu[2];
					System.out.println(msg);
				}
				
			}
			if(input == 2) {
				int[] stu = new int[3];
				System.out.print("학번>");
				int num = sc.nextInt();
				
				try{
					data[num-1] = stu; //얕은 복사로 아래 정보 출력 가능
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("존재하지 않는 학번입니다");
					continue;	
				}
				System.out.print("국어>");
				stu[0] = sc.nextInt();
				System.out.print("영어>");
				stu[1] = sc.nextInt();
				System.out.print("수학>");
				stu[2] = sc.nextInt();

			}
			if(input == 3) {
				int[] stu = new int[3];
				System.out.print("수정할 학번>");
				int num = sc.nextInt();
				
				try{
					data[num-1] = stu;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("존재하지 않는 학번입니다");
					continue;	
				}
				System.out.print("국어>");
				stu[0] = sc.nextInt();
				System.out.print("영어>");
				stu[1] = sc.nextInt();
				System.out.print("수학>");
				stu[2] = sc.nextInt();
				
			}
			if(input == 4) {
				System.out.print("삭제할 학번>");
				int num = sc.nextInt();
				
				try{
					data[num-1] = new int[3];
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("존재하지 않는학번입니다");
					continue;	
				}

			}
			
		}
		System.out.println("이용해주셔서 감사합니다");
		
		sc.close();
	}
}
