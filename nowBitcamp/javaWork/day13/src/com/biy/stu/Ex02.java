package com.biy.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		List<int[]> data = new ArrayList<>();
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
	
		String menu = "1.보기 2. 입력 3. 수정 4.삭제 0.종료";
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			System.out.println(menu);
			input = sc.nextInt();
			if(input == 0) {break;}
			if(input == 1) {
				System.out.println(header);
				for(int i = 0; i < data.size(); i++) {
					int[] stu = data.get(i);
					System.out.print(stu[0] + "\t"+stu[1] + "\t"+stu[2] + "\t"+stu[3] + "\n");
				}
			}
			if(input == 2) {
				System.out.print("학번>");
				int num = sc.nextInt();
				System.out.print("국어>");
				int kor = sc.nextInt();
				System.out.print("영어>");
				int eng = sc.nextInt();
				System.out.print("수학>");
				int math = sc.nextInt();
				int[] stu = {num,kor,eng,math};
				data.add(stu);
			}
			if(input == 3) {
				System.out.print("수정할 학번>");
				int num= sc.nextInt();
				for(int i = 0; i < data.size(); i++) {
					int[] stu = data.get(i);
					if(stu[0] == num) {
						int[] newStu = new int[4];
						newStu[0] = num;
						System.out.print("국어>");
						newStu[1] = sc.nextInt();
						System.out.print("영어>");
						newStu[2] = sc.nextInt();
						System.out.print("수학>");
						newStu[3] = sc.nextInt();
						data.set(i,newStu);
						break;
					}
				}	
			}
			if(input == 4) {
				System.out.print("삭제할 학번>");
				int num= sc.nextInt();
				for(int i = 0; i < data.size(); i++) {
					int[] stu = data.get(i);
					if(stu[0] == num) {
						data.remove(i);
						break;
					}
				}
				
			}
		}
		
		
		
		
		
		sc.close();
	}
}
