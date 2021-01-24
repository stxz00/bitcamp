package com.biy.stu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, int[]> data = new TreeMap<Integer, int[]>();
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
					int num = ite.next();
					int[] arr = data.get(num);
					System.out.println(num + "\t" + arr[0] + "\t" + arr[1] + "\t" + arr[2]);
				}
				
			}
			if(input == 2) {
				System.out.print("학번>");
				int num = sc.nextInt();
				if(data.get(num) != null) {
					System.out.println("이미 존재하는 학번입니다");
					continue;
				}
				System.out.print("국어>");
				int kor = sc.nextInt();
				System.out.print("영어>");
				int eng = sc.nextInt();
				System.out.print("수학>");
				int math = sc.nextInt();
				data.put(num, new int[] {kor,eng,math});
			}
			if(input == 3) {
				System.out.print("수정할 학번>");
				int num = sc.nextInt();
				if(data.get(num) == null) {
					System.out.println("존재하지 않는 학번입니다");
					continue;
				}
				System.out.print("국어>");
				int kor = sc.nextInt();
				System.out.print("영어>");
				int eng = sc.nextInt();
				System.out.print("수학>");
				int math = sc.nextInt();
				data.put(num, new int[] {kor,eng,math});
			}
			if(input == 4) {
				System.out.print("삭제할 학번>");
				int num = sc.nextInt();
				if(data.get(num) == null) {
					System.out.println("존재하지 않는 학번입니다");
					continue;
				}
				data.remove(num);
			}
		}       
		
		
		
		
		
		sc.close();
	}
}
