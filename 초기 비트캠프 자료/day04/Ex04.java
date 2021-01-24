package com.bit.day04;

class Ex04{
 public static void main(String[] args){
	int kor = 60;
	int eng = 81;
	int math = 60;
	System.out.println("성적관리프로그램ver0.1.1");
	System.out.println("---------------------------\n");
	System.out.println("구분\t점수");
	System.out.println("--------------");
	System.out.println("국어\t" + kor);
	System.out.println("영어\t" + eng);
	System.out.println("수학\t" + math);
	int sum = kor + eng + math;
	System.out.println("--------------");
	System.out.println("총점\t" + sum);
	double avg = sum*100/3/100.0;
	System.out.println("평균\t" + avg);
	System.out.println("--------------");
	
	char grade = 'F';
	
	//sum/30 으로 그냥 해결하는 것도 있음
	switch((int)(avg/10)){
		case  10 : case  9 :
			grade = 'A';
			break;
	
		case  8 :
			grade = 'B';
			break;
		case  7 :
			grade = 'C';
			break;
		case  6 :
			grade = 'D';
			break;

	/*
	char grade = 'F';
	swich(sum/30){
		case 10 :
		case 9 : grade -=1; 
		case 8 : grade -=1;
		case 7 : grade -=1;
		case 6 : grade -=2;
	}
	System.out.println(grade + "학점");







	*/
	}//outter swich end
	System.out.println(grade + "학점");
 }	
}