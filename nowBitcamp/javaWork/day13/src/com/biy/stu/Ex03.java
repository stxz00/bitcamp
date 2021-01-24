package com.biy.stu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class Ex03 {
	public static void main(String[] args) {
		Map<String,Integer> data = new TreeMap<String,Integer>();
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
				
				Set<String> keys = data.keySet();
				Iterator<String> ite = keys.iterator();
				while(ite.hasNext()) {
					int kor = data.get(ite.next());
					int math = data.get(ite.next());
					int eng = data.get(ite.next());
					int num = data.get(ite.next());
					System.out.println(num + "\t" + kor +"\t" + eng +"\t"+ math);
				}
				
				
				/*
				for(int i = 0; i < data.size()/4; i++) {
					int num = data.get(i+1+"학번");
					int kor = data.get(i+1+"국어");
					int eng = data.get(i+1+"영어");
					int math = data.get(i+1+"수학");
					System.out.println(num + "\t" + kor +"\t" + eng +"\t"+ math);
				}
				*/
			
			}
			if(input == 2) {
				System.out.print("학번>");
				int num = sc.nextInt();
				if(data.get(num + "학번") != null) {
					System.out.println("중복된 학번입니다");
					continue;
				}
				System.out.print("국어>");
				int kor = sc.nextInt();
				System.out.print("영어>");
				int eng = sc.nextInt();
				System.out.print("수학>");
				int math = sc.nextInt();
				data.put(num+"학번", num);
				data.put(num+"국어", kor);
				data.put(num+"영어", eng);
				data.put(num+"수학", math);
			
			}
			if(input == 3) {
				System.out.print("수정할 학번>");
				int num = sc.nextInt();
				if(data.get(num + "학번") == null) {
					System.out.println("존재하지 않는 학번입니다");
					continue;
				}
				System.out.print("국어>");
				int kor = sc.nextInt();
				System.out.print("영어>");
				int eng = sc.nextInt();
				System.out.print("수학>");
				int math = sc.nextInt();
				
				data.put(num+"학번", num);
				data.put(num+"국어", kor);
				data.put(num+"영어", eng);
				data.put(num+"수학", math);	
				
			}
			if(input == 4) {
				System.out.print("삭제할 학번>");
				int num = sc.nextInt();
				if(data.get(num + "학번") == null) {
					System.out.println("존재하지 않는 학번입니다");
					continue;
				}
				data.remove(num + "학번");
				data.remove(num+"국어");
				data.remove(num+"영어");
				data.remove(num+"수학");	
			}
		}

		sc.close();
	}
}