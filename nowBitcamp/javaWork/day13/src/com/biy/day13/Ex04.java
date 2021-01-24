package com.biy.day13;


class Ball{
	void play() {
		System.out.println("공이 굴러갑니다");
	}
}

class BaseBall extends Ball{
	String color = "흰색";
	void play() {
		System.out.println(color + " 야구공을 던지고 놉니다");
	}
}

class Bowling extends Ball{
	String color = "주황색";
	void play() {
		System.out.print("핀을 향해 " + color +" 볼링");
		super.play();
	}
}

// T 외에 다른 문자 써도 됨.
// 일반적으로 T,E,K,V...
class Box<T>{ //T결정 안하면 그냥 Object
	
	T ball;
	
	void push(T myBall){
		ball = myBall;
	}
	
	T pull(){
		return ball;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		BaseBall ball1 = new BaseBall();
		Bowling ball2 =new Bowling();
//		ball.color = "검정색";
		
		Box<Ball> box = new Box<Ball>(); // T의 결정을 여기서 해줌
		box.push(ball1); // 제네릭의 상속받은 클래스 넣을 수 있음
		
		Ball myball = box.pull(); // 캐스팅이 필요없게 됨
//		System.out.println("공 색은 " + myball.color + "입니다");
		myball.play();
		
		Box<BaseBall> box1 = new Box<BaseBall>();
		box1.push(ball1);
		// Box의 타입변수가 객체이고 그 객체를 BaseBAll 선언하였으므로 box1.push(T myBall)에서 들어올 수 있는 T, 즉 BaseBall의 객체 ball1이 들어 올 수 있다.
	}
}
