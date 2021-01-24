package com.bit.day18;

//내부 클래스
//되도록 안쓰는 게 나음

//국내 잘 사용x 국외 사용 o
//단, 어나니머스 클래스는 많이 사용함
//상속과 유사 

//자바말고 cmd로 만들면 
//Ex01.java Ex02\Lec11.class Ex02\Lec01.class Ex02\Lec111.class 파일이 만들어짐
//이러한 이유로 달러표시와 언더바를 일반 클래스 이름을 지을 때 사용하지 않도록 주의

public class Ex01 {
	
	//1. 인스턴스 클래스, no-static inner 클래스
	class Lec01{
		
		
		
	}
	
	//2. 스태틱 클래스, static inner 클래스
	static class Lec111{
		
		
	}
	
	public void func() {
		//3.로컬 클래스, 지역 클래스
		class Lec11{
			
		}
	}
	
	//~~
	//4. 익명 클래스
	
	
	public static void main(String[] args) {
		//내부 클래스
	}
}
