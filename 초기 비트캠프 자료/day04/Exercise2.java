package com.bit.day04;

class Exercise2{
	static int s = 1;
	public static String a(){
		System.out.println("출력합니다");
		Exercise p = new Exercise();
		p.b();
		int s = 11;
		System.out.println(s);
		return "Z";
	}
		
	public void b(){
		System.out.println("non");
		int s = 3;
		System.out.println(s);
	}
	

	public static char c(){
		System.out.println("판별");
		return 'Z';
	}

	public int i(){
		
		return 6;
	}

	public Exercise2(){}


	public static void main(String[] args){
		a();
		System.out.println("---------------------------");
		Exercise2 e = new Exercise2();
		e.a();
		System.out.println("---------------------------");
		e.b();
		System.out.println("---------------------------");
		Exercise2 f = new Exercise2();
		f.a();
		
		boolean boo1 = a()==f.a();
		System.out.println(boo1);

		boolean boo2 = c()==f.c();
		System.out.println(boo2);
		System.out.println("---------------------------");
		System.out.println(c()==f.c());
		System.out.println(e.i() == f.i());
		System.out.println("---------------------------");
		Exercise2 v = new Exercise2();	
		Exercise2 q = new Exercise2();
		System.out.println(v == q);
		System.out.println(v.i());
		System.out.println(v.i() == q.i());

	}
}
