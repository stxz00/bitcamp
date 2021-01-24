package com.bit.day07;

class Ex107{
	int su1 = 1111;

/*	
	Ex107(){
		System.out.println("부모 객체 생성");
	} 
	// 자식 생성자 호출 시 부모 객체 생성이 먼저 되는걸 확인 할 수 있음
*/

	Ex107(int a){
		System.out.println("부모 객체 생성");
	} 
	//부모와 자식 각각의 생성자 호출이 없을때 오류 떨어짐 대신 생략된 super 키워드를 사용해 가능함

	void func01(){
		System.out.println("부모기능...");
	}
}

class Ex07 extends Ex107{

	Ex07(){
		//super(); 부모객체의 참조변수 역할 this() 같이 
		// 복습 : this와 this()의 차이는 자기의 참조변수를 가리키는 것과 자기의 생성자를 가리키는것
		super(1234); 
		//단 this()와 super()는 같이 공존할 수 없음
		//부모 클래스 생성자 호출
		System.out.println("자식 객체 생성");
		System.out.println(">" + su1);
		System.out.println(">" + this.su1);
		System.out.println(">" + super.su1); //차이 정확히 알기!
	}
		
	// 필드는 너는 너 나는 나기 때문에 따로따로인 것임.
	private int su1 = 2222;
	// 상속을 받게 되면 내 객체 뿐만 아니라 부모 객체를 먼저 생성함
	// 한마디로 필드를 그냥 덮어쓰는 것

	//오버라이드(메서드만 가능, 필드는 없음)
	 //메서드 오버라이드 
	// 부모의 기능을 재정의함
	void func01(){
		super.func01(); //자식의 기능에 부모의 기능 추가
		System.out.println("자식기능...");
	}

	public static void main(String[] args){
		Ex07 me = new Ex07();
		me.func01();
		System.out.println(me.su1);
	}
}