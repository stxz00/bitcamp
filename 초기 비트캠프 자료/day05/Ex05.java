package com.bit.day05;

class Car{
	public final String model; //한번 생성자를 호출하면 아예 바꿀 수 없게(한 번 모델은 무조건 그 모델이니)
	public String color;
	public int speed;
	public int max;

	public Car(String a,String b, int c){
		model = a;
		color = b;
		max = c;
	}


	public void  speedUp(){
		speed +=10;
	}
	public void speedDown(){
		speed -= 10;
	}
	public void showSpeed(){
		System.out.println(color + "색 내 차 " +model + "는 " + speed + "km로 달린다");  
	}
	
}


class Ex05{

	public static void main(String[] args){
		Car myCar = new Car("K5","흰",200);
		myCar.speedUp();
		myCar.showSpeed();
		myCar.speedDown();
		myCar.showSpeed();
		


	}// main end
}