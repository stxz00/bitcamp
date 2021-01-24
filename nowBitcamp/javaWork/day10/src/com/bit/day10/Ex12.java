package com.bit.day10;

import java.io.InputStream;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		InputStream inn = System.in;
		Scanner sc = new Scanner(inn);
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
		//엔터를 치기 전까지 대기 엔터는 즉 개행이니 개행하면 넘어가는것
		
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		// 띄어쓸때마다 next넘어감 .split(" "); 과 비슷하네
		// 그래서 a bb 쓰면 1~2번째 a bb 쓰고 넘어가고 3번째때 ccc dddd 쓰면 ccc만 출력함
//		sc.nextInt();
		
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextInt());
		// next의 속성(띄어쓰기)이면서 Int임
		
		// 윈도우의 개행은 \r\n 가 합쳐져 있음 
		// 그래서 2번을 한거번에 인식
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextLine());
		
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextInt());
//		System.out.println(sc.nextLine());
	
		// 엔터 단위/ 띄어쓰기 or 개행/ 엔터 / 띄어쓰기 or 개행
		// 엔터 \r\n 를 하나씩 해버리기 때문에 
		// \r\n | /r \ /n\r\|/n|\r 이렇게 됨
		
		System.out.println(sc.nextInt());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextInt());
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		// 강제로 한다면 이렇게
	}
}
