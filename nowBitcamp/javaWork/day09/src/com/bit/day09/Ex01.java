package com.bit.day09;

public class Ex01 {
	public static void main(String[] args) {
		// 예외처리
		// 오류를 처리하는게 아닌 회피하는 것!
		
		int[] arr1 = {1,3,5,7};
		
		for(int i = 0; i < 5; i++) {
			try {
			System.out.println(arr1[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				
			}
		}
		// try로 일단 실행하고 오류가 발생하면 캐치에 예외처리할 것을 잡아내서 에러코드가 났던 것을 예외처리함
		System.out.println("오류가 있었지만 회피함");
		System.out.println();
	try {
		int[] arr2 = {1,3,5,7};
		for(int i = 0; i < 5; i++) {
			
			System.out.println(arr1[i]);
			}
		
		System.out.println("오류가 있었지만 회피함");
		
		}catch(ArrayIndexOutOfBoundsException e) {
			// ArrayIndexOutOfBoundsException : 배열의 범위를 벗어남
		}
		// 오류가 발생한 시점에 System.out.println("오류가 있었지만 회피함"); 을 실행하지 못함
		// 크게나 작게 트라이 캐치 할지는 선택이 필요함(정해진 답이 없음)
	
		
	
	}
}
