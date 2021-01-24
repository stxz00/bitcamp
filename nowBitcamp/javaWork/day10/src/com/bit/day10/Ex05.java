package com.bit.day10;


// 인터페이스는 오직 추상메서드와 상수(public final static) 
interface Inter01{
	public abstract void func01();
	//Inter01(){} 생성자 자체도 없음
	//필드도 없음
}

interface Inter02{
	public void func02(); // 메서드 abstract 생략가능
	void func03(); //상속하니 디폴트,protected 의미가 없음 그냥 public임 대부분 생략함
	//private는 어차피 상속하면 오버라이드해야하니까 안됨
}

//인터페이스가 인터페이스를 상속하는 경우에만 다중 상속 가능
interface Inter03 extends Inter01, Inter02{
	
}

interface Inter04{
	public final static int su1 = 1111;
	final static int su2 = 2222;
	static int su3 = 3333;
	int su4 = 4444;
	//다 같은 형태
	
}

//인터페이스 다중 상속 가능 일반 상속은 하나만 가능
class Test05 extends Ex05 implements Inter01, Inter02{
	

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

}


public class Ex05 extends Ex04 implements Inter04{
	public static void main(String[] args) {
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		System.out.println(Inter04.su4);
		Inter04 me = new Ex05(); //상수밖에 없으니 가능
		
		
	}
}
