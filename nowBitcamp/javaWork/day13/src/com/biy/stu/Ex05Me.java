package com.biy.stu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Ex05Me implements Comparable<Ex05Me>{
	
	int num, kor, eng, math;
	
	public Ex05Me(int num) {
		this.num = num;
	}
	
	public String toString() {
		return num + "\t" + kor + "\t" + eng + "\t" + math; 
	}
	public static void main(String[] args) {
		Set<Ex05Me> data = new TreeSet<Ex05Me>();
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
				
				Iterator<Ex05Me> ite = data.iterator();
				while(ite.hasNext()) {
					Ex05Me obj = ite.next();
					System.out.println(obj);
				}
				
/*				
				Object[] obj = data.toArray();
				Arrays.sort(obj);
				for(Object o : obj) {
					System.out.println(o);
				}
*/
				
			}
			if(input == 2) {
				System.out.print("학번>");
				int num = sc.nextInt();
				Ex05Me stu = new Ex05Me(num);
				System.out.print("국어>");
				stu.kor = sc.nextInt();
				System.out.print("영어>");
				stu.eng = sc.nextInt();
				System.out.print("수학>");
				stu.math = sc.nextInt();
				data.add(stu);
				
				
			}
			if(input == 3) {
				System.out.print("수정할 학번>");
				int num = sc.nextInt();
				
				Iterator<Ex05Me> ite = data.iterator();
				while(ite.hasNext()) {
					Ex05Me obj = ite.next();
					if(obj.num == num) {
						Ex05Me stu = new Ex05Me(num);
						data.remove(stu);
						System.out.print("국어>");
						stu.kor = sc.nextInt();
						System.out.print("영어>");
						stu.eng = sc.nextInt();
						System.out.print("수학>");
						stu.math = sc.nextInt();
						data.add(stu);
						break;
					}
				}
				
				
			}
			if(input == 4) {
				System.out.print("삭제할 학번>");
				int num = sc.nextInt();
				Ex05Me stu = new Ex05Me(num);
				data.remove(stu);
			}
		}
		

		sc.close();
	}

	@Override
	public int compareTo(Ex05Me o) {
	
		return this.num - ((Ex05Me)o).num;
	}
}
