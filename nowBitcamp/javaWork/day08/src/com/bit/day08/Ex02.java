package com.bit.day08;

public class Ex02 {
	public static void main(String[] args) {
		// int -> Integer
		int su1 = 1234;
		Integer su2 = 1234; // 박싱
		Integer su3 = new Integer(su1); //박싱, 래핑
		Integer su4 = new Integer("1234"); // 문자열 -> 숫자
		
		System.out.println(su1+1);
		System.out.println(su2+1); //연산 시 객체에서 기본자료형으로 언랩핑
		System.out.println(su3);
		System.out.println(su4);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		System.out.println(su3==su4); //다른 주소값
		System.out.println(su3+0==su4+0); //언래핑하기 때문에 기본자료형 value값
		System.out.println(su3.equals(su4)); //value 값
		System.out.println(su3.intValue()); //return값이 int형(언래핑)
		System.out.println(su3.intValue()==su4.intValue());
		System.out.println(su3.doubleValue()==su4.doubleValue());
		System.out.println(su3.longValue()==su4.longValue()); //long형으로 언래핑
		String msg = "1223";
		int su5 = Integer.parseInt(msg); //파스인트하는 순간 바로 인트형 return값 int
		int su6 = new Integer(msg); //객체가 인티저가 되기 위해 언래핑 return값 Integer
		int su7 = Integer.valueOf(msg); //return타입이 객체 return값 Integer
		System.out.println(Integer.reverse(-2)); //비트단위로 0에서 -2를 뺀 값
		int su8 = 6554;
		System.out.println("2진수 : " + Integer.toBinaryString(su8)); //return 타입 String
		System.out.println("8진수 : " + Integer.toOctalString(su8));
		System.out.println("16진수 : " + Integer.toHexString(su8));
		int su9 = 17; 
		System.out.println(Integer.min(su8, su9)); // 둘 중 작은 값
		System.out.println(Integer.max(su8, su9)); // 둘 중 큰 값
		System.out.println(Integer.sum(su8, su9)); // 합계
		
		System.out.println(Integer.compare(su8, su9)); 
		System.out.println(su3.compareTo(su4));
		// 같으면 0 앞이 크면 1 뒤가 크면 -1
		// compare는 Int일 때 쓰고, compareTo는 Integer일 때 씀
	}
}
