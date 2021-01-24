package com.bit.day06;

class Ex08{
	public static void func01(int[] arr){
		for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i] +" ");
		
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		int[] arr1 = {1,3,5,7,9}; //int[] arr1 = new int[]{1,3,5,7,9}; new int[]가 생략
		int[] arr2 = {1,3,5,7,9};
		//배열의 얕은복사
		int[] arr3 = arr1;
		System.out.println(arr1 == arr2);	//false 배열객체의 레퍼런스 비교
		System.out.println(arr1.equals(arr2));	//false 어떤값을 기준으로 비교할지? 라는 정의가 없기 때문(배열값의 기준을 정의하지 않았음)
		System.out.println(arr1 == arr3);	//true 같은 배열값의 주소를 비교하므로
		
		func01(arr1);  // arr1이 실제로 있는 주소값의 위치 스택영역(arr1의 value는 힙)인데 주소값만 불러내서 하므로 옅은 복사임
		

		/*
		//배열의 깊은 복사
		//타입이 같은 배열을 만들고 값을 넣어줌
		int[] arr4 = new int[5];
		for(int i = 0; i < arr4.length; i++){
			arr4[i] = arr1[i];
		}
		
		
		int[] arr4 = new int[5];
		System.arraycopy(원본, 원본어디서부터, 대상, 대상어디서부터, 몇개);
		System.arraycopy(arr1,0,arr4,0,5); //깊은 복사
		System.out.println(arr1 == arr4); //false 
		
		arr1[0] = 0;
		func01(arr4);
		func01(arr1);
		*/
	}
}