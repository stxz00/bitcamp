package com.bit.day05;

class Car{
	public int speed;
	public int max;
	public String company;
	public String model;
	public String color;

	public void speedUp(){
		if(speed + 10 > 150){
			speed = max;
		}else{
			speed += 10;
		}
	}
	
	public void speedDown(){
		if(speed - 10 < 0){
			speed = 0;
		}else{
			speed -= 10;
		}
	}


}



class Ex02{


 public static void main(String[] args){

	Car myCar = new Car();
	myCar.model = "모닝";
	myCar.color = "빨강";
	myCar.max = 150;
	System.out.println(myCar.color + "색 내차 "+ myCar.model + "의 현재속도 : " + myCar.speed +"km");	

	for(int i = 0; i < 50; i++){
	myCar.speedUp();
	System.out.println(myCar.color + "색 내차 "+ myCar.model + "의 현재속도 : " + myCar.speed +"km");	
	}


	for(int i = 0; i < 50; i++){
	myCar.speedDown();
	System.out.println(myCar.color + "색 내차 "+ myCar.model + "의 현재속도 : " + myCar.speed +"km");
	}
	System.out.println("--------------------------------------------");
	myCar = new Car();
	myCar.model = "그랜져";
	myCar.color = "검정";
	myCar.max = 200;
	System.out.println(myCar.color + "색 내차 "+ myCar.model + "의 현재속도 : " + myCar.speed +"km");	

	for(int i = 0; i < 50; i++){
	myCar.speedUp();
	System.out.println(myCar.color + "색 내차 "+ myCar.model + "의 현재속도 : " + myCar.speed +"km");	
	}


	for(int i = 0; i < 50; i++){
	myCar.speedDown();
	System.out.println(myCar.color + "색 내차 "+ myCar.model + "의 현재속도 : " + myCar.speed +"km");	
	}



 }
}

