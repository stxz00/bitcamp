package com.bit.day11;

public class Ex02 {
	public static void main(String[] args) {
		StringBuffer st1 = new StringBuffer(); //디폴트가 되어있는거 확인
		System.out.println(st1); //공백문자열이 있는거 확인
		
		StringBuffer st2 = new StringBuffer("문자열"); //문자열을 객체로 만듬
		System.out.println(st2); 
		
		// replace(CharSequance target, CharSequence replacement)
		// CharSequance는 인터페이스 String 클래스는 이 인터페이스를 상속받음(아래가 상속받는것들임)
		//All Known Implementing Classes:
		//CharBuffer, Segment, String, StringBuffer, StringBuilder
		StringBuffer st3 = new StringBuffer(st2);
		// CharSequance를 상속받는 모든 것들을 받을 수 있기 때문에 st2를 만들 수 있음
		
		StringBuffer st4 = new StringBuffer(10);
		System.out.println(st4);
		// StringBuffer는 String의 한계를 극복하기 위함.(버퍼량을 조절)
		// StringBuffer와 String의 차이점은 StringBuffer는 자기 자신이 바뀌는 것! (스스로가 동적할당 -> 사이즈를 자기가 늘림)
		// String은 계속 새로운 객체를 만들어 내기 때문에 메모리 소모량이 생기므로 
		// String 은 abc가 주어지면 그만큼만 공간만 가지고 표현, 추가, 바뀔때마다 새로운 객체를 찍음
		// StringBuffer는 주어진 문자열 외에 추가 공간을 위한 여유 공간(버퍼공간)을 더 만듬. 무분별한 객체 생성을 막음(String이 10자면 StringBuffer는 그 이상의 공간을 만들어놓는다는 것)
		// 임베디드 상으로 따지면 유리한 상황임
			
	}
}
