package com.bit.day08;
/*
주민번호 체크

123456-1234567
당신은 00세 0성입니다
*/

import java.util.Scanner;

public class MyEx09 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("주민번호 체크기(ver 0.2.0)");
	System.out.println("---------------------------");
	String input;
	
	char[] arr1;
	char[] arr2 = {'0','1','2','3','4','5','6','7','8','9'};
	char[] arr3 = {'영','일','이','삼','사','오','육','칠','팔','구'};


	
	boolean boo = true;
	boolean boo1 = true;
	do {
		System.out.print("주민번호를 입력하세요\n>");
		 input = sc.nextLine();
		 arr1 = input.toCharArray();
			for(int i = 0; i < arr1.length; i++) {
				for(int j = 0; j < arr3.length; j++) {
					if(arr1[i] == arr3[j]) {
						arr1[i] = arr2[j];
					}
				}
			}

		input = new String(arr1);
		if(input.length() == 14 && input.charAt(6) == '-') {
			
			for(int i = 0; i < arr1.length; i++) {
				if(i !=6) {
					boolean ifDigit = Character.isDigit(arr1[i]);
					if(ifDigit != true) {
						boo1 = false;
					}
				}	
			}
			
			if(boo1) {
				boo = false;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}
			
		}else {
			System.out.println("입력포멧을 다시 확인하시기 바랍니다");
			System.out.println("예시)123456-1234567");
			System.out.println("일이삼사오육-일이삼사오육칠");
		}
		
		
	}while(boo);
	
	char su7 = input.charAt(7);
	int age = 2020 + 1;
	if(su7 <= '2') {
		age -= 1900;
	}else {
		age -= 2000;
	}
	
	String  calculateAge = input.substring(0,2); 
	age = age -(Integer.parseInt(calculateAge));
	
	System.out.println(age);
	
	char manOrWoman = input.charAt(7); 
	
	if(manOrWoman == '1' || manOrWoman == '3') {
		manOrWoman = '남';
		System.out.println("당신은 " + age + "세 " + manOrWoman + "성입니다.");
	}else if(manOrWoman == '2' || manOrWoman == '4') {
		manOrWoman = '여';
		System.out.println("당신은 " + age + "세 " + manOrWoman + "성입니다.");
	}
	
	
	sc.close();
	}
}
