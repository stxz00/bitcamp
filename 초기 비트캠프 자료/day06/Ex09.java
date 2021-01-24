package com.bit.day06;

class Ex09{
	

	public static void main(String[] args){
		int[] arr1 = {2,4,6,8};
		int[] arr2 = new int[]{2,4,6,8}; //처음부터 값을 초기화 되고 있음
		int[] arr3 = new int[4]; // 디폴트 값으로 배열 객체 생성
		// 클래스에서는 필드의 객체의 생성 시점에 할당하고 초기화; -> 디폴트
		// 배열은 초기화를 하지 않아도 디폴트 값을 가짐
		// 생성된 객체에 값을 넣어줌
		
		for(int i = 0; i < arr3.length; i++){
			System.out.println(arr3[i]); //0 0 0 0 디폴트 값 출력
		}
		// int[] arr5; 이러면 배열 주소값을 가질 수 있겠지만 현재 디폴트 값은 null
		
		
		arr3[1] = 4;
		arr3[2] = 6;
		
		for(int i = 0; i < arr3.length; i++){
			System.out.println(arr3[i]); // 0 4 6 0
		}
		
		
	}
}