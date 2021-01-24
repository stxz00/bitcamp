package com.bit.day09;

public class Ex02 {
	public static void main(String[] args) {
		
		//throwable : Error(처리 불가능 시스템오류), Exception(처리 가능한 예외)
		//Exception : IOException(입출력예외), RuntimeException(실행예외)
		//IOException : FileNotFoundException, SocketException
		//RuntimeException : ArithmeticException, ArrayIndexOutOfBoundsException
		
		int[] arr = {-2,-1,0,1,2};
		int su = 10;
		for(int i = 0; i < arr.length; i++) {
			
			try {
				su = 1/arr[i];
				// i=2일때 su 값을 변경하지 않기 때문에 이전 i=1일 때의 값이 유지
			}catch(ArithmeticException e) {
				// ArithmeticException : 0일때 오류
			}
		System.out.println(su);	 
		// 트라이캐치 위치에 따라 출력되는 정도가 완전히 다름

		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			
			try {
				su = 1/arr[i];
				
			}catch(Exception e) {
				// 예외 최상위 클래스 Exception으로 처리
			}
		System.out.println(su);	 
		

		}
		
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			
			try {
				su = 1/arr[i];
				
			}catch(RuntimeException e) {
				// 실행오류이므로 ArithmeticException의 상위 클래스인 런타임 에러로 처리 
			}
		System.out.println(su);	 
		}
		
		// 이중 트라이캐치
		System.out.println();
		for(int i = 0; i < 6; i++) {
			su = 0;
			try {
			try {
				su = 1/arr[i];
				
			}catch(RuntimeException e) {
				// 실행오류이므로 ArithmeticException의 상위 클래스인 런타임 에러로 처리 
			}}catch(ArithmeticException e) {
				
			}
		System.out.println(su);	 
		}
		
		// 다중 캐치
		// 주의 : 처음에 Exception과 같이 상위클래스의 예외가 오면 다음 캐치는 수행할 필요가 없으므로 반대로 낮은 캐치에서 높은 캐치 순으로 하면 됨. ->아니면 이중 트라이캐치로 가능하면 바꾸면 됨
		System.out.println();
		for(int i = 0; i < 6; i++) {
			su = 0;
			
			try {
				su = 1/arr[i];
			}catch(ArithmeticException e) {
				su -= 100;
				// 실행오류이므로 ArithmeticException의 상위 클래스인 런타임 에러로 처리 
			}catch(ArrayIndexOutOfBoundsException e) {
				su = 100;
			
				System.out.println(e.toString()); //반드시 오류 시점에 오류 문자열 출력
				System.out.println(e.getMessage()); //반드시 오류 시점에 사유 출력 
				System.out.println(e.getLocalizedMessage()); // 반드시 오류 시점에 위 동일
				e.printStackTrace(); //에러메세지 출력
				//★★★★★★System.out.println()은 반드시 그 시점에 수행할 내용을 출력하고 넘어가야하니 컴퓨터가 여유가 있을 때 출력하는 e.printStackTrace();를 사용하는 게 맞음(오류메세지를 담아뒀다가 컴퓨터가 여유 있거나 쉬는 시간에 출력해주거나 맨 마지막에 출력해주는 등 해줌) 사실 입출력 등 컴퓨터가 쉬는 시간이 많긴 함 (IO가 가장 느림 입출력 할 때까지 기다리니까) 반드시 꼭 그 시점에 출력해야한다 하면 System.out.println(e.toString()); 등으로 쓰고...★★★★★★
				System.out.println("-----구분-----");
				StackTraceElement[] trace = e.getStackTrace();
				//e.getStackTrace(); 스택방식으로 값 얻음
				for(int j = 0; j < trace.length; j++) {
					System.out.println(trace[j].toString());
				}
				// 상세하게 오류 내용 출력, 오류가 하나일지라도 배열로 출력함, 여러 개면 배열로 여러 개 출력, 이는 참고용, 할 필요는 없음.
			}catch(Exception e) {
				System.out.println("모르는 에러가 발생했었음");
				
			}
			System.out.println(su);	 
		}
		
		//최상위 Exception으로만 구성하지 않는 이유는 각 오류마다 퍼포먼스를 다룰 수 있기 때문
		
	}
}
