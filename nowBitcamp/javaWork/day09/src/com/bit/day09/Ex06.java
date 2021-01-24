package com.bit.day09;
//예외처리와 함께 쓰는 것
public class Ex06 {
	
	public static void func(int a) throws ArithmeticException{
		
		// ~jdk 1.7
		try {
			int su = 10/a;
			if(a == 0) {return;} 
			//원래는 return하면 나가야하는데 finally가 반드시 실행됨
			System.out.println(su);
//		}catch(ArithmeticException e) {
//			System.out.println(0);
		}finally {
			System.out.println("반드시 수행함");
		}
		
		//원래는 try catch finally 지만 1.8부터는 try finally로도 됨
}
	
	public static void main(String[] args) {
		try {
			func(0);
		}catch(ArithmeticException e){
			System.out.println("예외처리함"); 
			//위에 캐치 ArithmeticException e 하면 
			//이미 예외처리했으므로 실행 안됨
		}
		
		
	}
}
