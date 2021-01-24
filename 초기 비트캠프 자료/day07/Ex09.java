package com.bit.day07;

class Ex109{
	Ex109(){
			System.out.println("부모객체생성..");
	}

}



class Ex09 extends Ex109{
	
	Ex09(){
		//super(); or this()
		System.out.println("자식생성..");
	}

	Ex09(int a){
		//super(); or this()
		System.out.println("자식객체생성..");
	}

	Ex09(String msg){
		//super(); or this()
		System.out.println(msg);
	}

	Ex09(String msg, int su){
		//super(); or this()
		System.out.println(msg);
		for(int i = 0; i < su; i++){
		System.out.println(msg);
		}
	
	// super는 아래와 같이 하면 3개들 각각 중에 맞는 생성자 내부의 생략된 this()를 없애고 super()를 생성함
	// 만약 자식 생성자 1 2 3 이렇게라면 원래 1 2 3에는 this()가 들어 있지만
	// 아래 생성자에 생성되는 부모 생성자가 해당 되는 것에 this()를 없애고 super()를 넣어서 출력하는 것!
	// 나머지 자식 생성자들은 this()가 남아 있음.
	}
	//생성자가 여러 개 있을 때 
	public static void main(String[] args){
		Ex09 me = new Ex09();
		Ex09 me1 = new Ex09("다른자식");
		Ex09 me2 = new Ex09("또다른자식",2);

	}
}