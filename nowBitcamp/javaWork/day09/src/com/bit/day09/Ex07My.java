package com.bit.day09;
//
/*
 * 주민번호 체크
 * 123456-1234567
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class Ex07My {
	public static void main(String[] args) {
		int age = 0;
		char gender = '-';
		String input = null;
		java.util.Scanner sc;
		sc = new java.util.Scanner(System.in);
		boolean boo = false;
		
		do{
			System.out.print("주민번호를 입력해주세요\n>");
			input = sc.nextLine();
			String[] s1 = input.split("-");
			String[] s2 = input.split("");
			
			if(s2[6].equals("-") == false) {
				System.out.println("7번째 자리에 - 표시하시기 바랍니다");
				continue;
			}
			
			try {
				Integer.parseInt(s1[0]);
				Integer.parseInt(s1[1]);
				
				String[] s3 = new String[14];
				s3[13] = s2[13]; // 14자리 이내면 인덱스오류
				for(int i = 0; i < s2.length; i++) {
					s3[i] = s2[i]; // 14자리 초과 시 인덱스 오류
				}
			}catch(NumberFormatException e){
				System.out.println("숫자 이외는 입력할 수 없습니다");
				continue;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("14자리 까지만 입력하세요");
				continue;
			}
				break;
		}while(true);
			
		age = 2020-(1900+Integer.parseInt(input.substring(0,2))-1);
		if(input.charAt(7) >= '3') {
			age -= 100;
		}			
		if(input.charAt(7) == '1' || input.charAt(7) == '3'){
			gender = '남';
		}else {
			gender = '여';
		}
		System.out.println("당신은 " + age + "세 " + gender + "성 입니다");
		sc.close();
	}
}
