package com.bit.day07;

class Ex108{
	int su1 = 1111;
	protected void func01(){
		//System.out.println("super.su1 = " + super.su1);
		System.out.println("this.su1 = " + this.su1);
		System.out.println("su1 = " + su1);
	}
}

class Ex08 extends Ex108{
	int su1 = 2222;
	//오버라이드 시 위 메서드의 this는 Ex108를 가리키고 현재 오버라이드된 매서드의 this는 Ex08을 가리킴 
	
	public void func01(){
	System.out.println("super.su1 = " + super.su1);
	System.out.println("this.su1 = " + this.su1);
	System.out.println("su1 = " + su1);
	}
	void func02(){
		System.out.println("자식만의 가능...");
	}
/*
	//상속된 것보다 더 열려있어야 하거나 같아야함
	public void func01(){
		//System.out.prinltn("super.su1 = " + super.su1);
		System.out.println("this.su1 = " + this.su1);
		System.out.println("su1 = " + su1);
	}
*/
	public static void main(String[] args){
		Ex108 you = new Ex108();
		you.func01();
		System.out.println("------------------------");
		Ex08 me = new Ex08();
		me.func01();
		me.func02();
		System.out.println("------------------------");
		//다형성
		//하나의 코드가 여러 자료형으로 구현되어 실행되는 것
		Ex108 ex1 = new Ex08(); 
		System.out.println("ㅎㅎㅎㅎㅎ" + ex1.su1); // 부모의 su1인 1111이 생성 
		System.out.println("ㅎㅎㅎㅎㅎ" + ((Ex08)ex1).su1); // 자식의 su1인 2222이 생성 
		ex1.func01(); // super는 부모 su1을, this는 자식의 su1을 가리킴 su1도 자식의 su1을 가리킴
		System.out.println(me.su1);
		((Ex08)ex1).func02();
		//자식의 타입으로 부모 객체 생성 시 자식의 타입은 사용할 수 없으므로 다운캐스팅을함.
		//타입은 부모인데 자식의 기능을 실행함. 실행 할 수 없는 것은 부모가 가지고 있지 않은 자식의 필드와 메서드임.
		System.out.println("------------------------");
		Object obj = new Ex08();
		System.out.println(obj.toString());
		System.out.println("------------------------");
		String msg = "abcd";
		me.func03(msg);
		me.func03(new Ex01());
		((Ex08)obj).func02();
		
		//래퍼클래스 = 기본 자료형을 대체하는것
		//Double은 double의 래퍼클래스
		
		me.func03(true); //Object를 통해 기본자료형 등등도 출력이 가능함.

	}

	void func03(Object obj){
		System.out.println(obj.toString());
	}
	//Object로 하면 제약이 많지만 모든 클래스들을 받을 수 있다.
}