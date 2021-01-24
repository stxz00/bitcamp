package com.bit.day11;
//날짜

import java.time.Year;
import java.util.Calendar;

class Test01{
	private static Test01 me = new Test01();
	private Test01(){
		
	}
	public static Test01 getInsteance() {
		return me;
	}
	public String toString() {
		return "Test01 class...";
	}
}


public class Ex06 {
	public static void main(String[] args) {
		// 자바는 시간을 표시하려면 그 객체가 만들어질 때 나오므로 정확하지 않음 그래서 보다 정확하기 위해 자바 버전업할때마다 새롭게 냄
		
		// Calendar : 오래된 방식, protected로 상속을 받아야 사용가능
		
		Test01 you = Test01.getInsteance(); // 이렇게 Test01을 사용가능
		System.out.println(you.toString());
		
		// 날짜는 일 등 불규칙적이고 필요에 따라 연산이 필요하는 등 
		// 연산 시 그 시점을 기준으로 연산을 함
		
		Calendar me = Calendar.getInstance(); // getInstance()로 protected를 품, new를 사용하지 않음
		// because Calendar는 추상클래스이기 때문에 객체를 생성할 수 없음(GregorianCalendar가 상속 받아 getInstance() 메서드로 받는것)
		// 이는 GregorianCalendar로 새로운 객체를 생성할 수 있다는 것
		
		//set 현재를 다른 시점으로 바꾸기
		me.set(Calendar.YEAR, 2002);
		me.set(Calendar.MONTH, 4);	//5월
		
		System.out.println(me); 
		System.out.println(me.get(Calendar.DAY_OF_YEAR) + "일째");
		System.out.println(me.get(Calendar.WEEK_OF_MONTH) + "주차");
		System.out.println(me.get(Calendar.WEEK_OF_YEAR) + "주차");
		System.out.println(me.get(1));	//get(field) 필드값을 반환 1은 YEAR 등등 인데 static으로 정의해놓음
		System.out.println(me.get(Calendar.YEAR ) +  "년"); 
		// MONTH 0 ~ 11
		System.out.println(me.get(2)+1);
		System.out.println(me.get(Calendar.MONTH) + 1 + "월");
		System.out.println(me.get(5));
		System.out.println(me.get(Calendar.DATE) + "일");
		System.out.println(me.get(Calendar.DAY_OF_MONTH) + "일");
		System.out.println(me.get(Calendar.DAY_OF_WEEK) + "요일"); //요일을 int로 줌
		//SUNDAY(1), MONDAY(2), TUESDAY(3),
		//WENDNESDAY(4), THURSDAY(5); FRIDAY(6), SATURDAY(7)
		char week = '-';
		if(me.get(Calendar.DAY_OF_WEEK) == 1 ) {week='일';}
		if(me.get(Calendar.DAY_OF_WEEK) == 2) {week='월';}
		if(me.get(Calendar.DAY_OF_WEEK) == 3) {week='화';}
		if(me.get(Calendar.DAY_OF_WEEK) == 4) {week='수';}
		if(me.get(Calendar.DAY_OF_WEEK) == 5) {week='목';}
		if(me.get(Calendar.DAY_OF_WEEK) == 6) {week='금';}
		if(me.get(Calendar.DAY_OF_WEEK) == 7) {week='토';}
		
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {week='일';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {week='월';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {week='화';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {week='수';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.THURSDAY) {week='목';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {week='금';}
		if(me.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {week='토';}
		
		System.out.println(week + "요일");
		
		if(me.get(Calendar.AM_PM) == 0) {      // 0이면 오전 1이면 오후 
			System.out.println("am.");
		}else {
			System.out.println("pm.");
		}
		System.out.println(me.get(Calendar.HOUR) + "시");	//12시 기준으로 나옴
		System.out.println(me.get(Calendar.HOUR_OF_DAY) + "시");	//0~23시 기준으로 나옴
		System.out.println(me.get(Calendar.MINUTE) + "분");
		System.out.println(me.get(Calendar.SECOND) + "초");
		System.out.println(me.get(4));
		
		System.out.println(me.before(me)); //대상보다 전인지 
		System.out.println(me.after(me)); // 후인지
		
	


	}
}
