package com.bit.day04;

class Ex01{
	//클래스 구성요소
	//메서드 : 값을 전달받을 수 있다
	//	 반복문과는 다르게 값을 달리 주면서 전달할 수 있다.
	//	 매개변수가 있는 메서드인데 값이 없으면 호출할 수 없다.
	//	 매개변수가 없는 메서드인데 값을 넣으면 오류가 뜬다.
	//	 매개변수와 다른 자료형이면 오류가 된다.(오토캐스팅이 가능하다면 오류안뜸)
	//	 동일한 이름을 가진 메서드는 불가능하다.
	//	 메서드의 위치는 위 아래 전혀 상관없다.(클래스 안에만 있으면 됨 절차지향인 c언어와는 다름)
	//	 main함수도 메서드. 그 클래스에 있는 main을 호출하겠다고 약속됨. 매개변수 String[] args를 쓰지 않으면(안받게 하면) 호출할 수 있는게 없다.
	//           main함수도 메서드이므로 String[] args 의 args를 아무 이름으로 지어도 변함 없다.
	//	 매개변수의 갯수의 제한은 없다.
	//	 메서드는 자료형에 대입하여 쓸 수 있다.
	//	 int su = func01();
	//	 System.out.println("su="+su);
	//	 나오는 결과
	//	 func()...
	//	 su=1234
	//	 메서드 명 앞에는 return 타입 형을 쓰지만, return 값이 없으면 void이다.
	//	 메서드는 만들어놓고 사용 안해도됨.


	//	 강사님 정리
	//	 메서드
	//	 public static 자료형(void) 메서드명(매개변수1, 매개변수2, ...){}
	// 	 자료형의 결정은 return value이 결정, vlaue가 없으면 void
	//	 메서드의 호출 -> 메서드명(전달할 값, ...)
	//	 메서드는 코드의 재사용성에 목표다(외,내부 클래스에서 코드를 넣으면 언제든 호출하는 것)
	//	 void는 return은 항상 존재한다(생략가능한 것) 단지 value가 없을뿐
	//	 return은 2개 이상 존재하지 않고 하나의 return에 여러개를 써야함.
	//	 다른 클래스에서 해당 클래스의 메서드를 쓰려면 먼저 해당 클래스가 컴파일 되어 있어야함.
	
 public static int func01(){
	System.out.println("func()...");
	return 1234;
 }

 public static void func02(){
	System.out.println("func02()...");
	return; //위 강사님 설명에 value가 없다는 뜻이 이것임.
 }


 public static void main(String[] args){

	System.out.println("hello world");
	int temp = 1;
	if(temp>0){
		return; // 리턴은 호출이 종료된다는 것이므로 main 함수가 끝나버림(아래 호출 X)
		         // 그냥 쓰면 의미없는 리턴이 뭐냐고 잘못된거 같다라고 인식하기 때문에 if문으로 싸서 컴퓨터를 속임.
	}
	
	//func01();
	//func01(1234);
	//func01(4321);
	//func01(43.21);
	//func01(3,5);
	int su = func01(); //호출될때 fun()... 값 출력
	func02();
	int su2 = func01();
	//System.out.println("su="+su);
 }
}

class Ex101{}

