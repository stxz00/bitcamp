package com.bit.day05;

class Ex01{

 public static int speed;

 public static void speedUp(){
	if(speed+13>200){
	speed = 200;
	}else{	
	speed += 13;
	}
 }

 public static void speedDown(){
	if(speed-11>0){
	speed -= 11;
	}else{	
	speed = 0;
	}
 }


 public static void main(String[] args){
	System.out.println("내차의 현재속도 : " + speed +"km");	
	for(int i = 0; i < 50; i++){
	speedUp();
	System.out.println("내차의 현재속도 : " + speed +"km");	
	}


	for(int i = 0; i < 50; i++){
	speedDown();
	System.out.println("내차의 현재속도 : " + speed +"km");	
	}



 } // main end
} // class end