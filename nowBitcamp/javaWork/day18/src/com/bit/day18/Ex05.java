package com.bit.day18;

//어나니머스 클래스 

interface Inter{
	void func02();
}

public class Ex05 {
	//추상의 타입 Inner는 처음에 결론된 게 없으므로 안되고
	//타입을 Object로 하면 어차피 Inner란 존재가 없어서 안되고
	//그래서 인터페이스를 만들어서 상속해버린다면 가능함
	public static Inter func01() {
		//Inner는 로컬에 선언되었는데 가능한 것은 변수의 유효범위를 벗어난 상황 -> 인터페이스는 클래스가 아니지만 변수의 라이프 사이클을 무시함 -> 함수형 문법에서의 클로저 라고 함
		
		//클래스이름이 필요없으니 없애고 클래스가 없으니 클래스를 없애고 임플리먼트할 게 없으니 없애고 다 없애면 결국 아래처럼 인터페이스 본인만 남게 됨
		return new Inter(){
			public void func02() {
				System.out.println("로컬클래스기능");
			}
		};
//		return new Inner();
	}
	
	
	
	
	public static void main(String[] args) {
		Inter inn = func01(); //구현인페이스 이름 //메서드의 리턴값이 Inter이므로
		inn.func02();
		
		Inter inn2 = new Inter() { // 조상클래스 이름
			public void func02() {
				System.out.println("로컬클래스기능");
			}
		};
		inn.func02();
		
		Inter inn3 = new Inter() { //조상클래스 이름, 기존 오버라이딩
			@Override
			public void func02() { 
				System.out.println("로컬클래스기능");
			}
		};
		inn3.func02();
		//셋 다 클래스는 없지만 클래스가 있음. ;표시에 . 붙이면 나옴
		
		
	}
}
