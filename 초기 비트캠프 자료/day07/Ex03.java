package com.bit.day07;


class Ex103{
	// 디자인 패턴(싱글톤 패턴);
	static Ex103 me = new Ex103(); 
	//내 자신 클래스니까 객체 생성됨 -> 자기 자신으로 객체를 생성해 놓았으므로 생성 가능(싱글톤패턴)
	// static으로 객체 생성 없이 호출 가능함
	// 즉 자기 클래스 내부의 하나의 객체만으로 기능을 제공하게 되는 것. 아래 Math.random(); 이 그것임!
	// 대신 자기 자신 EX103은 private 생성자로 막았으므로 생성 불가능하게 만들어짐(싱글톤패턴 특징)

	private Ex103(){} // private로 외부클래스 생성자 접근제한 
	
	public void func(){
		System.out.println("func()....");
	}
}

class Ex03{
	
	public static void main(String[] args){
		//Math math = new Math(); // 오류 : 객체 생성자체가 제한되어있음(private 생성자)
		//System.out.println(Math.random()); //이건 됨

		Ex103 ex3 = Ex103.me;
		ex3.func();
		Ex103 ex4 = Ex103.me;
		ex4.func();
		Ex103 ex5 = Ex103.me;
		ex5.func();
	}
}