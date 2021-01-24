/*
학생성적관리프로그램(ver 0.1.0)
----------------------------------
kor = 85;
eng = 77;
math = 93;
1. 학생의 총점과 평균(소수점2자리)을 구하시오
2. 평균학점을 구하시오

	A학점(90이상)
	B학점(~80이상)
	C학점(~70이상)
	D학점(~60이상)
	F학점(~60미만)
*/
class Ex07{
 public static void main(String[] args){
	final int SUBJECT = 3;
	int kor = 86;
	int eng = 77;
	int math = 93;
	System.out.println("학생성적관리프로그램(ver 0.1.0)");
	System.out.println("----------------------------------");
	System.out.println("국어 : " + kor);
	System.out.println("영어 : " + eng);
	System.out.println("수학 : " + math);
	System.out.println("총점 : " + (kor + eng + math));
	System.out.println("평균 : " + (kor + eng + math)*100/3/100.0); //둘째 자리만큼 곱하고 나눈 후 더블형으로 바꾸기 위해 100.0으로 씀. 
	char ch = 'F';
	if(avg>=90){
		ch = 'A';
	}else if(avg>=80){
		ch = 'B';
	}else if(avg>=70){
		ch = 'C';
	}else if(avg>=60){
		ch = 'D';
	}else {
		ch = 'F';
	}
	System.out.println(ch + "학점");

/*내가 한 것
	int sum = kor + eng + math;
	double average = (double)sum/SUBJECT;
	
	System.out.println("학생성적관리프로그램(ver 0.1.0)");
	System.out.println("----------------------------------");
	System.out.printf("학생의 총점 : %d\n", sum);
	System.out.printf("학생의 평균 : %.2f\n",average);
	
	if(average >=90){
		System.out.println("A학점입니다.");
	}else if(average >=80){
		System.out.println("B학점입니다.");
	}else if(average >=70){
		System.out.println("C학점입니다.");
	}else if(average >=60){
		System.out.println("D학점입니다.");
	}else {
		System.out.println("F학점입니다.");
	}//outter if end
*/
	
	
 }
}