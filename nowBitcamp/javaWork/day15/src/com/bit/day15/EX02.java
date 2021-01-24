package com.bit.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
//		InputStream inn = System.in;
		
//		java.util.Scanner sc;
		//java.util은 기존에 있던 자바 기능을 유용하게 쓸 수 있도록 만들어 제공하는 것들의 모음
//		sc = new Scanner(inn);
		//콘솔에서 받은 내용을 읽어들이는 InputStream을 인자로 받는 것
		
//		String msg = sc.nextLine();
		//기존 InputStream과 달리 읽어들이는 단위가 한 라인 즉, 개행 \r\n이 오기 전까지 화면을 출력해 주는것
//		System.out.println(msg);
		
//		msg = sc.next();
//		System.out.println(msg);
		// next는 개행이 아닐지라도 단위가 띄어쓰기 , 개행 등 거기까지만 출력
		
		
		
		File file = new File("test01.txt");
		InputStream inn;
		
		
		try {
			inn = new FileInputStream(file);
			java.util.Scanner sc;
			sc = new Scanner(inn);
			//콘솔에서 입력받는게 아닌 파일을 입력받는것(쉬움)
//			sc = new Scanner(file); 해도 됨 
			String msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			msg = sc.nextLine();
			System.out.println(msg);
			// 각 1개행씩 입력받고 출력
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String test = "ABCD\nEFG\n1235\n";
		java.util.Scanner sc;
		sc = new Scanner(test);
		//이렇게도 당연히 됨
		String msg1 = sc.nextLine();
		System.out.println(msg1);
		msg1 = sc.nextLine();
		System.out.println(msg1);
		msg1 = sc.nextLine();
		System.out.println(msg1);
		
	}
}
