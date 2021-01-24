class Ex13Instructor{
 public static void main(String[] args){
	System.out.println("Q1. 1~10까지 홀수를 출력하시오");	
	for(int i = 1; i <10; i+=2){
		System.out.println(i);
	}
	System.out.println("---------------------------");
	for(int i = 1; i <= 10; i++){
		if(i %2 != 0){
		System.out.println(i);
		}
	}
	System.out.println("1~10까지 짝수들의 합을 구하시오");
	int hap = 0;
	for(int i = 0; i<=10; i++){
		if(i %2 == 0){
			hap += i; // hap == hap + i;
		}
	} // outter for end
	System.out.println("hap="+hap);
	/*
	for(int i =2; i<10; i+=2){
		hap += i;
	}
	System.out.println(hap);
		
	for(int i = 2; i <= 10; i++){
		hap += i;
		i++;
	}
	System.out.println("hap = " + hap);
	*/	
	System.out.println("Q3. 다음을 출력하시오\n1+3+5+7+9=0000");
	hap = 0;
	for(int i =1; i < 10; i++){
		if(i %2 !=0){
			System.out.print(i);
			hap += i;
		}else{
			System.out.print("+");
		}
	}
	System.out.println("=" + hap);
	System.out.println("---------------------------");
	for(int i = 1; i<10; i++){
		if(i %2 != 0){
			if(i !=1){
				System.out.print("+");
			}
			System.out.print(i);
		}
	}	
	System.out.println("=" + hap);
	System.out.println("Q4. 알파벳 A~Z까지를 출력하시오");
	for(int i = 65 ; i < 91 ; i++){
		System.out.print((char)i);
	}
	System.out.println("");
	int gap = 'a'-'A';
	for(int i = 'A' ; i < 'Z'+1 ; i++){
		if(i != 'A'){
			System.out.print(',');
		}
		System.out.print((char)(i));
		System.out.print("(" + (char)(i + gap) + ")");
	}
		
	
 } // main end
} // class end
