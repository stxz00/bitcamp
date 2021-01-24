package com.bit.day08;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		// 1,90.80,77@2,10,20,20@2,10,20,20@
		
		String data ="";
		String title = "학생성적관리프로그램(ver 0.2.1)";
		String menu = "1.보기 2.입력 0.종료";
		String table = "----------------------------------------------\n";
		table += "학번\t|국어\t|영어\t|수학\t|합계|\t|평균|\n";
		table += "----------------------------------------------\n";
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println(title);
		for(int i = 0; i < title.length(); i++) {
			System.out.print('-');
		}
		System.out.println();
		
		String input = null;
		
		int cnt = 0;
		
		while(true) {
			System.out.print(menu);
			input = sc.nextLine();
			if(input.equals("0")){break;}
			if(input.equals("1")) {
				System.out.println(table);
				String[] students = data.split("@");
				for(int i = 0; i < students.length; i++) {
					String student = students[i];
					String[] stu = student.split(",");
					int kor = Integer.parseInt(stu[1]);
					int eng = Integer.parseInt(stu[2]);
					int math = Integer.parseInt(stu[3]);
					int sum = kor + eng + math;
					double avg = sum *100/3/100.0;
					System.out.println(stu[0]+"\t|" + stu[1] +"\t|" + stu[2] +"\t|" + stu[3] +"\t|" + sum+"\t|" + avg);
				}
				
			}
			if(input.equals("2")) {
				cnt++;
				System.out.print(cnt + "번 국어>");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				System.out.print(cnt + "번 영어>");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				System.out.print(cnt + "번 수학>");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				if(cnt!=1) {
					data+="@";
				}
				data += cnt+","+kor+","+eng+","+math;
			}
			
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
}
