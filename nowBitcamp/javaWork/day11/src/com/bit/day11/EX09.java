package com.bit.day11;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
// 명세 포맷 변경
public class EX09 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
		String d3 = df.format(d1);
		
		String d2 = DateFormat.getDateInstance().format(d1);
		//이 내용을 풀어 쓰면 위 내용
		System.out.println(d2);
		
		System.out.println(d3);
		
		String d4 = DateFormat.getDateInstance(DateFormat.SHORT).format(d1);
		System.out.println(d4);
		
		String d5 = DateFormat.getDateInstance(DateFormat.DEFAULT).format(d1);
		System.out.println(d5);
													//표시			나라
		String d6 = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN).format(d1);
		System.out.println(d6);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss"); //원하는 포맷으로 표기 갯수로 자릿수 
		String d7 = sdf.format(d1);
		System.out.println(d7);
		
	}
}
