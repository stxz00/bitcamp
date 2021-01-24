package com.bit.day18;

class Outter04{
	static int su1 = 1111;
	int su2 = 2222;
	
	static void func02(int su5) { //(final int su5)
		//static 안에서의 static은 존재할 수 없다
//		int su5 =5555; // fianl이 생략됨
		//Outter04에서 su5를 호출할때 func04()가 호출되어 5000이 되어버리면 아예 설계 자체가 바뀌므로 상수가 되어버리는 것. 즉 설계과정에서 값이 바뀌거나 영향이 없는 것들이 가능
		//그래서 그냥 아예 final로 써놓길 권장
		class Inner04{
			final static int su3 = 3333;
			int su4 =4444; 
			Outter04 z = new Outter04();
			
			public Inner04() {
				System.out.println("create Inner");
				
			}
			
			void func04() {
		//		su5 = 5000;
				int su5 = 1000; //이런건 자기꺼니까 별개이므로 가능
				System.out.println("Inner func04()");
				System.out.println("su4 = " + su4);
				System.out.println("su1 = " + su1);
				
				System.out.println("su1 = " + su1);
				System.out.println("su5 = " + su5);
				
			}
		}
		System.out.println(su5);
		Inner04 inn = new Inner04();
		System.out.println(inn.su4);
		inn.func04();
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		Outter04 outt = new Outter04();
		outt.func02(6666);
	}
}
