package com.bit.day09;

public class Ex09 {
	public static void main(String[] args) {
		
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		System.out.println("학생성적관리프로그램(ver 0.3.0)");
		System.out.print("총원> ");
		int tot = Integer.parseInt(sc.nextLine());
	
		int[][] data = new int[tot][];
		int input = 0;
		int cnt = 0;
	
		while(true) {
			System.out.print("1.보기 2.입력 0.종료>");
			input = Integer.parseInt(sc.nextLine());
			
			if(input == 0) {
				break;
			}else if(input == 1) {
				System.out.println("========================================");
				System.out.println("학번\t|국어\t|영어\t|수학\t|합계");
				System.out.println("----------------------------------------");
				for(int i = 0; i < data.length; i++) {
					int[] stu = data[i];
							if(stu == null) {break;}
					System.out.print(i+1+"\t|");
					int sum = 0;
					for(int j = 0; j <stu.length; j++) {
						sum += stu[j];
						System.out.print(stu[j]+"\t|");
						
					}
					System.out.println(sum);
				}
			}else if(input == 2) {
				String[] title = {"국어","영어","수학"};
				int[] stu = new int[3];
				for(int i = 0; i < stu.length; i++) {
					System.out.print(title[i] + ">");
					stu[i] = Integer.parseInt(sc.nextLine());
				}
				data[cnt++] = stu;
			}
		}
		sc.close();
	}
}
