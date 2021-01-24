/*
Q1. 1~10까지 홀수를 출력하시오
Q2. 1~10까지 짝수들의 합을 구하시오 
Q3. 다음을 출력하시오
	1+3+5+7+9=0000
Q4. 알파벳 A~Z까지를 출력하시오
Q5. 알파벳을 다음의 형식으로 출력하시오
	A(a), B(b), C(c), D(d), ....Z(z)
Q6. 구구단을 다음의 형식으로 출력하시오
	2x1=2	3x1=3	4x1=4	....	9x1=9
	2x2=4	3x2=6	4x2=8	....	9x2=18
	...
	2x9=18	3x9=27	4x9=36	....	9x9=81

*/

// 내가 한 풀이
class Ex13{
 public static void main(String[] args){
	System.out.println("-----------1번문제------------");
	int su1 = 0;
	while(++su1 <= 10){
		if(su1%2 != 0){
		System.out.print(su1 + " ");
		}
	}
	
	System.out.println("");

	System.out.println("-----------2번문제------------");
	
	int su2 = 0;
	int sum = 0;
	while(++su2 <= 10){
		if(su2 %2 == 0){
			sum += su2;
		}
	}
	System.out.println(sum);

	System.out.println("-----------3번문제------------");

	int su3 = 0;
	int sum2 = 0;
	while(++su3 <= 10){
		if(su3 == 1){
			System.out.print(su3);
			sum2 += su3;
		} else if(su3%2 != 0){
			System.out.print(" + " +su3);
			sum2 += su3;
		} else if(su3 == 10){
			System.out.print(" = " + sum2 + "\n");
		}
	}
	
	System.out.println("-----------4번문제------------");
	char su4 = 'A';
	while(su4 <= 'Z'){
		System.out.print(su4 + " ");
		su4++;
		}
	System.out.println("");
	System.out.println("-----------5번문제------------");
	char su5 = 'A';
	char su51 = 'a';
	while(su5 <= 'Z'){
		System.out.print(su5);
		su5++;
		if(su51 == 'z'){
			System.out.print("(" +su51 + ")");
		}else{
			System.out.print("(" +su51 + "), "); 
		
		su51++;
		}
	}
	System.out.println("");
	System.out.println("-----------6번문제------------");
	int su61 = 0;
	while(++su61 <= 9){
		int su6 = 1;
		while(++su6 <= 9){
			System.out.print(su6 + " x " + su61 + " = " + (su6 * su61) + "   ");
		}
		System.out.println("");
	}
 }// main end
} // class end