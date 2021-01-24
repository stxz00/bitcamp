package com.bit.day18;

//어나니머스에서 클래스이름이 없다는 것은 여러번 쓰겠다는 것이 아닌 단 한 번 쓰겠다는 것이고 단 한 번만 객체를 찍겠다는 것 이름이 없다보니 최대의 다형성을 사용한 것

public class Ex06 {
	//단 한번만 객체를 찍어내고 기능을 쓰기위해
	
	static Inter inn3 = new Inter() {
		public void func02() {
			System.out.println("스태틱클래스를대신하는익명클래스");
		}
	};
	
	Inter inn2 = new Inter() {
		public void func02() {
			System.out.println("인스턴스클래스를대신하는익명클래스");
			
		}
	};
	public static void main(String[] args) {
		
		Inter in1 = new Inter() { //main 메소드니
			public void func02() {
				System.out.println("로컬클래스를대신하는익명클래스");
			}
		};
	}
	
}

//즉, 어나니머스 클래스는 위치, 접근제어자에 따라 스태틱,인스턴스,로컬 모두 가능 단 한 번만 객체를 찍어낼 뿐
