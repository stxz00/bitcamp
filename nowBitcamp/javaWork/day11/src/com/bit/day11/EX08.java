package com.bit.day11;

import java.util.Date;

// 디폴트 : 현재 년월일 등을 명세해줌

public class EX08 {
	public static void main(String[] args) {
		Date d1 = new Date();
//		Date d1 = new Date("January 1, 1970, 00:00:00 GMT");
//		Date d1 = new Date(0); //1970년
//		Date d1 = new Date(System.currentTimeMillis()); //현재
//		Date d1 = new Date(2002-1900,5-1,1);
//		d1.setYear(2002-1900);
//		d1.setMonth(4);
		
		System.out.println(d1);
		System.out.println(d1.getYear() + 1900); // 1900년도 기준
		System.out.println(d1.getMonth() + 1);
		System.out.println(d1.getDate());
		System.out.println(d1.getDay());
		//0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getSeconds());
		System.out.println(d1.getTime()); //현재 시간을 long타입으로 표현
		System.out.println(System.currentTimeMillis()); //객체 생성차이 감안하면 시간 비슷
	}
}	
