package com.bit.day08;
/*
학생성적관리프로그램(ver 0.2.0) 문자열
--------------------------------
총원>3

1.보기 2.입력 0.종료>1
--------------------------------
학번 | 국어 | 영어 | 수학 |합계
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
public class Ex11 {
	public static void main(String[] args) {
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		String input;
		System.out.println("학생성적관리프로그램(ver 0.2.0)");
		System.out.println("--------------------------------");
		
		String table = "--------------------------------\n학번 | 국어 | 영어 | 수학 | 합계\n--------------------------------\n";
		int cnt = 0;
		
		while(true) {
			System.out.print("1.보기 2.입력 0.종료> ");
			input = sc.nextLine();
			if(input.equals("0")) {break;}
			if(input.equals("1")) {
				System.out.println(table);
			}
			if(input.equals("2")) {
				cnt++;
				table+=cnt;
				System.out.print(cnt + "번 국어>");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				table += "\t " + kor;
				System.out.print(cnt + "번 영어>");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				table += "    " + eng;
				System.out.print(cnt + "번 수학>");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				table += "     " + math;
				table += "     " + (kor+eng+math) +"\n";
				
			}
		}
		System.out.println("이용해주셔서 감사합니다");
		sc.close();
	}
}
