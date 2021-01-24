package com.biy.day13;

class A<T extends Object>{}
class B<Object>{}

public class MyExercise2 {
	public static void main(String[] args) {
//		A<Object> a = new A<String>(); 이렇게 형변환이 안됨 Object만 오도록 했으니
		A<? extends Object> a = new A<String>();
		A<?> aa = new A<String>();
		A<?> aaa;
		aaa = new A<String>();
		
		A<?> aaaa = new A<String>();
		A<Object> ab = (A<Object>)aaaa; //제네릭에서 형변환 중 이게 가장 요점인 부분인 것 같다
		A<String> ac = (A<String>)aaaa;
		
		A<Object> aba = new A<Object>();
//		A<String> abb = (AString<>)aba; 이렇게 와일드 카드 안쓴 aba는 형변환 막혀서 불가!
		
		
		B<? extends Object> b = new B<String>();
		B<String> c = new B<String>(); //아예 처음부터 String 해버리면 속하니 문제도 없음. Ex04의 Box<BaseBall> box1 = new Box<BaseBall>();  와 같은 것.
		
		
		A<? extends Object> o = null;
		A<? extends String> oa = null;
		o = (A<? extends Object>)oa;
		oa = (A<? extends String>)o;  // 이렇게 이런 타입의 와일드카드끼리는 형변환 가능
		
		
		
		// 이렇게 형변환을 자유롭게 하고 싶다 할때는 와일드카드를 쓴다 생각하면 됨.
	}
	
	
}
