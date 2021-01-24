package com.bit.day11;

public class Ex04 {
	public static void main(String[] args) {
		// capacity() 버퍼를 확인하는 메서드
		// buffer -> +16
		StringBuffer st1 = new StringBuffer();
		StringBuffer st2 = new StringBuffer(10);
		StringBuffer st3 = new StringBuffer("java");
		System.out.println(st1.capacity()); // 디폴트 버퍼는 16인걸 확인
		
		for(int i = 0; i<16; i++) {
			System.out.println(st1.append("a")); 
		}
		System.out.println(st1.capacity()); // 16 ,16까지는 버퍼량 변경없는 게 확인
		System.out.println(st1.append("b")); // 17*2 이 시점에 성능이 늘어나고 자원소모도 늘어남
		System.out.println(st1.capacity()); // 동적으로 사이즈를 늘림 부족할 때마다 추가할 공간의 양을  부족한 양의 두배로 올림 
		//배수의 양을 보면서 처음에 쓸 버퍼량을 감안하면서 초기값을 써야함
		//★★★★버퍼는 한 번 늘어나면 줄어들지 않음★★★★
		// trimToSize() : 사용하지 않을 뒤의 빈 버퍼량을 잘라냄
		st1.trimToSize();
		System.out.print(st1.capacity()); 
		// 버퍼량의 정점, 또는 완전 사용을 하였을 때 쓰면 됨. 너무 남발하면 String보다 성능 저하가 됨
		// 개발을 하게 되면 매 번 사용량이 바뀌므로 그 때마다 평균 값을 구하여 trimToSize()를 씀
//		System.out.println(st2.capacity()); 
//		System.out.println(st3.capacity()); 
	}
}
