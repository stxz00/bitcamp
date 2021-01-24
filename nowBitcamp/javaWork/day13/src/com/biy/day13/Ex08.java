package com.biy.day13;

import java.util.Scanner;

class Node{
	void func() {
		System.out.println("기능 실행...");
	}
	
	
}

class Ex88{
	//싱글톤 패턴 객체를 하나만 찍고 하는 것(방법은 다양함 private와 static을 잘 이용
	private static Scanner sc;
	
	private Ex88() {}
	static Scanner getScanner() {
		if(sc == null) {sc = new Scanner(System.in);}
		return sc;
	}
}


public class Ex08 {
	
	public static String input() {
		return Ex88.getScanner().nextLine();
	}
	

	
	public static void main(String[] args) {
		System.out.print("첫번째 입력>");
		System.out.println("입력하신 내용은 " + input());
		System.out.print("두번째 입력>");
		System.out.println("입력하신 내용은 " + input());
		System.out.print("세번째 입력>");
		System.out.println("입력하신 내용은 " + input());
		/*
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		*/
	}
}
