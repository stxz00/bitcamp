package com.bit.day05;

class Ex12{
	// Math.random() 호출시간을 기준으로 복잡한 연산을 통해 만들어진 랜덤한 값을 가져옴
	// 0.3535 등 double형임
	// 호출할때마다 랜덤한 숫자가 나오므로 그때마다 값을 저장하지 않으면 받아낼 수 없으므로 선언해놓기
	// 0.0<=ran<1.0 까지 나옴
	public static void main(String[] args){
		double ran = Math.random();
		System.out.println(ran);
		System.out.println(ran);
	}
}