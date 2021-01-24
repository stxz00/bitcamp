/*
주민번호 검사
java.util.Scanner sc = new.java.util.Scanner(System.in);

String input = sc.nexLine();
	//"123456-12345678";
	//정상적인 주민등록번호가 입력되도록 씀
		   당신은 22살 남성입니다.
sc.close();

1. 7번째 - 표시 외 다른 곳에서 쓸 시 한무 반복
2. 8번째  56 78 은 외국인 표시 9면은 한무 반복
3. 15자 초과 시 한무 반복
*/


package com.bit.day06;

import java.util.Scanner;

class Ex14{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		boolean boo = true;
		char[] c;
		String[] s;
		
		
		do{	
			System.out.println("1. 15자 초과 입력하지 않도록 주의하세요.");
			System.out.println("2. 7번째 주민번호 구분 -표기를 하고 입력해주세요.");
			System.out.println("3. 7번째 제외 숫자로만 입력하세요.");
			System.out.println("4. 8번째 숫자에 1~8 내 숫자를 입력하세요.");
			System.out.println("5. 주민등록 뒷자리 첫번째 번호를 꼭 잘 입력해주세요.");
			
			String input = sc.nextLine();
			
			c = input.toCharArray();
			s = input.split("");
			

			if(c.length == 14){
				if(c[6] == '-'){
					int count = 0;
					for(int i = 0; i < c.length; i++){
						if(i == 6){ i = 7;}
							
						if(c[i] < '0' && c[i] > '9'){ 
							count++;
						}
					}
						
					if(count == 0){

						if(c[7] >= '0' && c[7] <= '9'){

						boo = false;

						} else{
						System.out.println("***** 오류4 : 8번째 자리에는 1~8 까지만 입력*****");
						} //if4 end

					} else{
						System.out.println("***** 오류3 : 숫자 외 잘못된 문자 입력*****");
					}// if3 end
				} else{
					System.out.println("***** 오류2 : 7번째 자리 주소 구분 표시 '-' 미기입*****");
					
				} // if2 end
			}else{
				System.out.println("***** 오류1 : 15자 미만, 초과*****");
			}// if1 end
		}while(boo); //do-while end
		

		int age =Integer.parseInt(s[0])*10 + Integer.parseInt(s[1])-1; 

		if((c[7] == '1') || (c[7] == '2') || (c[7] == '5') || (c[7] == '6')){

			System.out.print("당신은 " + (2020-(1900+age)) + "살 ");

			if((c[7] == '1') || (c[7] == '5')){
				System.out.print("남성 ");
			}else{
				System.out.print("여성 ");
			}
			
			if(c[7] == '1' || c[7] == '2'){
				System.out.println("내국인입니다.");
			}else{
				System.out.println("외국인입니다.");
			} 
		}else{
			System.out.print("당신은 " + (2020-(2000+age)) + "살 ");

			if((c[7] == '3') || (c[7] == '7')){
				System.out.print("남성 ");
			}else{
				System.out.print("여성 ");
			}

			if(c[7] == '3' || c[7] == '4'){
				System.out.println("내국인입니다.");
			}else{
				System.out.println("외국인입니다.");
			} 
		}
				
			

		sc.close();
	}	//main end
} 	//class end