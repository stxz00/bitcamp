class Ex10{
 public static void main(String[] args){
	
	
//	for(int i = 0; i <10; i++){
		//int su = 100;  
//반복문 안에 변수 선언하는 것은 메모리 입장에서 손실이 많기 때문에(계속 초기화)
//쓰지 않는 것이 낫다.
		//System.out.println("출력" + su);
		//su++;
	//}
	//System.out.println("su="+su);


	//반복문 증감식 부분은 원하는 방식대로 맞게 쓰면 됨.
	for(int i = 10; i  > 0; i -= 2){
		System.out.println("출력"+i);
	}
 }
}