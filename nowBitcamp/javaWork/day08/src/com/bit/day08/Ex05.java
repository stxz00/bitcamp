package com.bit.day08;

public class Ex05 {
	public static void main(String[] args) {
		double su1 = 129.14;
		Double su2 = 3.14;
		Double su3 = new Double(su1);
		Double su4 = new Double("3.14");
		
		System.out.println(su3);
		System.out.println(su4);
		byte su5 = su3.byteValue();
		System.out.println(su5);
		double su6 = Double.parseDouble("3.14"); //동일하게 double자료형으로 받음
		System.out.println(su6); 
		System.out.println("16진수 : " + Double.toHexString(su6));
		
		//int su7 = 1/0; 오류
		double su8 =2.0/0.0; 
		System.out.println(Double.isInfinite(su8));
		//분자가 크면 값이 커지고 분모가 크면 값이 작아짐
		//분자가 작으면 값이 작아지고 분모가 작으면 값이 커짐
		//분자와 분모의 숫자간의 증가량과 감소량이 항상 일정하지 않음
		//분모의 소수점으로 갈수록(0으로 수렴할수록) 무한으로 가고 있음
		// 1.0/0.0; infinity 무한
		// 0.0/1.0 0.0
		// 0.0/0.0 NaN 연산이 잘못되었다고 표시
		
		
		//System.out.println(su7);
		System.out.println(su8);
		System.out.println(Double.isFinite(1.0/0.0));
		System.out.println(Double.isFinite(0.0/1.0));
		System.out.println(Double.isFinite(1.0/0.0));
		System.out.println(Double.isFinite(0.0/0.0));
		System.out.println(Double.isNaN(0.0/0.0));
	}
}
