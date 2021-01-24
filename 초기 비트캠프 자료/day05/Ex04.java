package com.bit.day05;



class Ex04{
	//상수형 변수
	//public final static int B;
	public final int D;

	public Ex04(){
		D=4444;
	}
	
	public Ex04(int a){
		D=a;
	}

	public static void main(String[] args){
	//final : a는 변수이지만 값을 바꾸지 못하는 변수 즉 상수형 변수로 바꿔준다.
	// 모두 대문자로만 쓴다.
	final int SU; //변수선언
	SU=1234; //변수초기화
	//B = 4321; //값을 바꿔주는것
	//System.out.println("SU="+SU);
	//System.out.println("B="+B);
	

		
	Ex04 me = new Ex04();
	System.out.println("D=" + me.D);
	
	Ex04 me1 = new Ex04(1234);
	System.out.println("D=" + me1.D);

	//생성자는 생성시점에 단 한 번 호출되며 final D값을 선언하는 것이므로 가능해 지는 것
	//생성자는 하고자 하는 일에 하는 것 즉, 필드값의 초기화가 주 업무.

	
	
	}
}