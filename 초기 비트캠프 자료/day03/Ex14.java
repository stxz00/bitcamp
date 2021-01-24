class Ex14{
 public static void main(String[] args){
	System.out.println("Q1. 1~10까지 홀수를 출력하시오");
	System.out.println("1.while문");
	int q1 = 0;
	while(++q1 <=10){
		if(q1 %2 !=0){
		 System.out.print(q1);
		}else{
		 System.out.print(" "); // 첫 조건식에서 더하고 홀수일경우 숫자출력, 짝수일 경우 공간 출력
		}
	}
	System.out.println("");
	q1 = 0;
	while(++q1 <=10){
		System.out.print(q1 + " "); // 첫 조건식에서 미리 더하고 차후에 또 더하는 것
		q1++;
		
	}
	System.out.println("");
	System.out.println("2.for문");
	for(int i = 1; i <10; i+=2){
		System.out.print(i + " "); // 1 + 2n 식 
	}
	System.out.println("");

	for(int i = 1; i < 10; i++){
		if(i %2 == 0){
			System.out.print(" "); // 짝수일때 공간 출력
		}else{
			System.out.print(i); // 홀수일때 숫자 표기
		}
	}

	System.out.println("Q2. 1~10까지 짝수들의 합을 구하시오");
	
	System.out.println("1.while문");
	int q2 = 0;
	int q2Sum = 0;
	while(++q2 <= 10){
		++q2;
		q2Sum+=q2; //조건문과 반복문 안에 증감식을 쓴 후 합계에 증감
	}
	System.out.println(q2Sum);

	q2 = 0;
	q2Sum = 0;
	while(++q2 <= 10){
		if(q2 %2 ==0){
		q2Sum+=q2;   //조건문에 증감식을 쓴 후 짝수일때 합계 증감
		}
	}
	System.out.println(q2Sum);

	System.out.println("2.for문");
	q2Sum = 0;
	for(int i = 1; i<=10; i++){
		if(i %2 == 0){
			q2Sum += i; //짝수일경우 합계 증감
		}	
	}
	System.out.println(q2Sum);
	
	q2Sum = 0;
	for(int i = 2; i <= 10; i+=2){
		q2Sum += i;	// 2씩 증가하며 합계 증감
	}
	System.out.println(q2Sum);

	System.out.println("Q3. 다음을 출력하시오 \n 1+3+5+7+9=0000");
	
	System.out.println("1.while문");
	int q3 = 0;
	int q3Sum = 0;
	while(++q3 <= 9){
		if(q3 %2 == 0){
			System.out.print(" + ");
		}else{
			System.out.print(q3); //q3이 증가할때마다 짝수면 더하기 출력, 홀수면 값출력 후 그 값을 합계에 증감
			q3Sum += q3;
		}
	}
	System.out.println(" = " + q3Sum);

	q3 = 1;
	q3Sum = 0;
	while(q3 <= 9){
		if(q3 == 9){
			System.out.print(q3);
			q3Sum += q3;
			break;	
		}else{
			System.out.print(q3 + " + ");
			q3Sum += q3;
		} //outter if end  // 9일때까지 1에서 2n씩 더하면서 합계 증감. 9인 순간에 합계 더하고 if문 나가기.
		q3 += 2;
	} // outter while end
	System.out.println(" = " + q3Sum);
	
	System.out.println("2.for문");
	q3Sum = 0;
	for(int i = 1; i <10; i++){
		if(i %2 == 0){
			System.out.print(" + ");
		}else{
			System.out.print(i);
			q3Sum += i; // 홀수면 값 출력 후 합계에 값 더하기, 짝수면 더하기 표시
		} // outter if end
	}
	System.out.println(" = " + q3Sum); 
	q3Sum = 0;
	for(int i = 1; i <10; i += 2){
		if( i == 1){
			System.out.print(i);
			q3Sum += i;
		}else{
			System.out.print(" + " + i); //1+2n씩 증감하며 1일때 값과 합계에 값 더하기, 이외 더하기 표시와 값 출력 후 합계에 값 더하기
			q3Sum += i;
		} // outter if end
	} 
	System.out.println(" = " + q3Sum);

	System.out.println("Q4. 알파벳 A~Z까지를 출력하시오");
	System.out.println("1.while문");
	int q4 = 'A';
	while(q4 <= 'Z'){
		System.out.print((char)q4 + " "); // 문자의 숫자값을 이용 후 char형으로 명시적 형변환 후 출력
		q4++;
	}
	System.out.println("");
	System.out.println("2.for문");

	for(int i = 'A'; i < 'Z' +1; i++){
		System.out.print((char)i + " "); // 문자의 숫자값을 이용 후 char형으로 명시적 형변환 후 출력
	}
	System.out.println("");

	System.out.println("Q5. 알파벳을 다음의 형식으로 출력하시오\nA(a), B(b), C(c), D(d), ....Z(z)");
	System.out.println("1.while문");
	int q5 = 'A';
	int q51 = 'a';
	while(q5 <= 'Z'){
		System.out.print((char)q5);
		System.out.print("(" + (char)q51 + ")"); // 대소문자의 숫자값을 이용 후 char형으로 명시적 형변환 후 출력 및 증감, q51이 z일때까지 "," 출력
		if(q51 != 'z'){
			System.out.print(",");
		}
		q5++;
		q51++;
	}
	System.out.println("");
	
	q5 = 'A';
	q51 = 'a' - 'A';
	while(q5 <= 'Z'){
		System.out.print((char)q5);
		System.out.print("(" + (char)(q5 + q51) + ")"); //대소문자를 서로 빼서 그 간격만큼의 값을 도출하고 소문자 출력할 시에 대문자 값에 간격 값을 더한 후 출력, q5가 Z일때까지 ","출력
		if(q5 != 'Z'){
			System.out.print(",");
		}
		q5++;
	}
	System.out.println("");
	System.out.println("2.for문");
	
	for(int i = 'A'; i < 'Z' +1; i++){
		System.out.print((char)i);
		System.out.print("(" + (char)(i + q51) + ")"); // 위와 동일
		if(i != 'Z'){
			System.out.print(",");
		}	
	}
	System.out.println("");
	q51 = 'a';
	for(int i = 'A'; i < 'Z'+1; i++,q51++){
		System.out.print((char)i);
		System.out.print("(" + (char)q51 + ")");	 // 위 while 문의 대소문자 값 선언 후 출력하는 것과 동일
		if(i != 'Z'){
			System.out.print(",");
		}
	}

	System.out.println("");
	
	System.out.println("구구단을 다음의 형식으로 출력하시오\n2x1=2	3x1=3	4x1=4	....	9x1=9\n2x2=4	3x2=6	4x2=8	....	9x2=18\n...\n2x9=18	3x9=27	4x9=36	....	9x9=81");
	
	System.out.println("1.while문");
	int q61 = 0;
	while(++q61 <= 9){
		int q6 = 1;
		while(++q6 <=9){
			System.out.print(q6 + " x " + q61 + " = " + q6 * q61); // while문 안에 while문 사용하여 출력
		}
		System.out.println("");
	}
	System.out.println("");

	q61 = 0;
	while(++q61 <= 9){
		for(int i = 2; i <= 9; i++){
			System.out.print(i + " x " + q61 + " = " + i * q61); // while문 안에 for문 사용하여 출력
		}
		System.out.println("");
	}
	System.out.println("");
	System.out.println("2.for문");
	for(int i = 1; i <= 9; i++){
		for(int j = 2; j <= 9; j++){
			System.out.print(i + " x " + j + " = " +i * j); // for문 안에 for문 사용하여 출력
		}	
		System.out.println("");
	}
	
	System.out.println("");
	for(int i =1; i <10; i++){
		int j = 1;	
		while(++j <= 9){
			System.out.print(i + " x " + j + " = " +i * j); // for문 안에 while문 사용하여 출력
		}
		System.out.println("");
	}
	
 } // main end
} // class end