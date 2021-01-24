package com.bit.day04;

class Ex06{
	//메서드
	// static 메서드, 클래스메서드 등...
	// non-static 메서드, 인스턴스 메서드, 멤버메서드,...
	// call(호출)
	/*
스태틱에서 스태틱의 접근 : static-method -> static method 클래스로 접근
		static-method -> non-static method  	참조변수로 접근
		non-static method -> non-static method 바로 접근(타클래스에서 접근 시에는 참조변수로)
		non-static method -> static method	클래스로 접근
	*/

	/* 오버로드 가능 여부(static과 void 유무가지고 따지는 게 아님) 오직 매개변수로만 따짐.
		1. 매개변수(인수) = 파라미터 유무
		2. 매개변수 갯수
		3. 매개변수 타입

	*/

	public static void func01(){
		System.out.println("static-method...");
		String msg = "문자열";
		Ex06 me; 	// 변수의 선언, 참조변수 = 클래스타입의 변수
		me = new Ex06();	// 초기화
		me.func04();
	}
	//non-static 메서드는 static 메서드를 통해 불러올 수 있다.
	

	public static void func04(){
		System.out.println("static-func04");
	}

	// 그냥 호출 시 오류, 구분가능
	public void func02(String msg){
		System.out.println("non-static method...");
	}
	public void func02(int msg){
		System.out.println("non-static method...");
	}

	public void func02(){
		System.out.println("non-static method...");
	}
	
	// static 메소드 와 같은 이름은 할 수 없음.
	// 단 public static void func() 와 public void func(int a)는 구별이 되므로 가능 
	//public void func04(){
	//	System.out.println("non-static-func04");
	//}


	public void func03(){
		func02();
	}
		
	public static void main(String[] args){
		func01(); // Ex06.func01();
		
		//일반 non-static 호출할 시 
		Ex06 me = new Ex06(); 
		me.func02("a222");
		me.func02();
		
		func04();
		
	}//main end
	
} // class end