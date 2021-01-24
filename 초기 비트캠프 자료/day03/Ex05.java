class Ex05{
 public static void main(String[] args){
	int su = 0;
	/*
	if(su>0){
		System.out.print("양수이고 ");
		if(su%2 == 0){
		System.out.println("짝수입니다");
		}else {
		System.out.println("홀수입니다");
		}
	}//outter if end
	*/
	if(su > 0 && su %2 == 0){
		System.out.println("양수 짝수");
	}	
	if(su > 0 && su %2 !=0){
		System.out.println("양수 홀수");
	}//outter if end
 }//main end

}//class end