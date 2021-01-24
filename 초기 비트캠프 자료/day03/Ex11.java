class Ex11{
 public static void main(String[] args){
	// 제어문(반복문)
	// 2. while문
	// while(조건){반복할 문장;}
/*	int su = 1;
	while(su>0){
	 	System.out.println("su= " + su);
		su--;
	}
*/
	int su = 1;
	while(su <= 9){
		System.out.println("7x" + su + " = " + 7*su);
		su++;
	}	
	// for문보다 while문에 익숙해지는 게 나중에 실력차이가 됨.
	
	System.out.println("----------------------------");
	su = 1; // for문처럼 초기화 -> 조건식 -> 증감식 루트를 잘 쓰면 됨.
	while(su < 10){
		System.out.println("7x" + su + " = " + 7*su);
		su++; // while문 닫는 중괄호 바로 전에 증감식을 쓴다고 생각하면 됨.
	}
	System.out.println("----------------------------");
	// 아예 while 조건식에 증감식까지 포함시켜버리는 법도 있음
	su = 0;  //시작할때 시작할 숫자 이전으로 선언하는 게 좋음
	while(++su < 10){
		System.out.println("7x" + su + " = " + 7*su);
		
	}
	
	
 }
}