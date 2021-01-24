class Ex09{
 public static void main(String[] args){
	//제어문(반복문)
	// 1. for문
	// for(초기화①; 조건문②; 증감식③){반복한 명령④;}
	// ① ->② ->④-> ③ ->② ->④-> ③ ->② ->④-> ③ ->② ->④-> ③ ...
	// ②가 true일때만 반복, for end
	/*
	for(int i = 0; i < 10; i++){
		System.out.println("실행");
	}
	*/
	// 구구단 7단 출력
	for(int su =1; su <= 9;  su++){
	System.out.println("7x" + su + "= " + 7*su);
	}
	
 }
}