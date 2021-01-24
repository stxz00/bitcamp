package com.bit.day08;

public class Ex09 {
	public static void main(String[] args) {
		int age = 0;
		char gender = '-';
		String input = null;
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		boolean boo = false;
		
		do {
			System.out.print("주민번호를 입력해주세요\n>");
			input = sc.nextLine();
			if(input.length() == 14) {
				boolean boo2 = true;
				if(input.charAt(6) == '-') {
					for(int i = 0; i < input.length(); i++) {
						if(i==6) {continue;}
						char su = input.charAt(i);
						if(!Character.isDigit(su)) {
							boo2 = false;
						}
					}
				}
				if(boo2) {break;}
			}
		}while(boo);
			

		age = 2020-(1900+Integer.parseInt(input.substring(0,2))-1);
		if(input.charAt(7) < '3') {
			age -= 100;
		}
		
		if(input.charAt(7) == '1' || input.charAt(7) == '3'){
				gender = '남';
		}else {
				gender = '여';
		}
		System.out.println("당신은 " + age + "세 " + gender + "성 입니다");
	}
}
