package com.bit.day04;

class Exercise{
	int count = 0;
	public static String a(){
		System.out.println("스태틱 출력");
		Exercise e = new Exercise();
		e.b();
		e.b();
		int y =5;
		System.out.println(y);

		e.count++;
		System.out.println(e.count);
		return  "yes";
		
	}

	public void b(){
		System.out.println("non스태틱 출력");
		
	}
	public void c(){
		System.out.println("non스태틱 출력");
		
	}
	public void d(){
		b();
		c();
		
	}
	public void e(){
		b();
		c();
		a();
		
	}
	
	static int i = 1;
	
	public void f(int o){
		b();
		c();
		a();
		int i = 2;
		int m = 5;
		final int X = 1;
		System.out.println(i + m + X);
	}




	public static void main(String[] args){
		a();
		Exercise x = new Exercise();
		x.b();
		System.out.println("-------------------------");
		x.d();
		System.out.println("-------------------------");
		x.e();
		System.out.println("-------------------------");
		x.f(6);
		System.out.println("-------------------------");
		x.a();
		System.out.println("-------------------------");
		System.out.println(x.i);
		System.out.println("-------------------------");
		a();
		x.a();
		boolean boo = a() == x.a();
		System.out.println(boo);
		System.out.println(a()==x.a());
		
	}
	
} // class end