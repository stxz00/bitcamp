package com.bit.day10;		//우선순위 2.

import com.bit.etc10.Test01; //우선순위 1.
// import com.bit.etc10.*;		//우선순위 3. 와일드
// import란 내 패키지에 찾기 전에 해당 패키지로 찾아라
// 위 *표시를 하면 먼저 찾는게 아닌 나중에 찾는 것임
// 왠만해서는 와일드 보단(메모리 에서도) 1번을 쓰는 게 좋긴함

//동일 패키지 사용 방법은 패키지를 명세 해서 쓰면 됨

import static java.lang.Math.PI;
// static으로 아예 못박아 놓은 것. import를 하면 PI만 불러도 됨. 잘 안씀

import java.util.Scanner;

public class Ex01 {
	public final static Double pi = 3.14; 
	String name = "나";
	public static void main(String[] args) {
		Scanner sc;
		System.out.println(PI);
//		com.bit.etc10.Ex01 me = new com.bit.etc10.Ex01();
//		System.out.println(me.name);
//		com.bit.day10.Test01 test = new com.bit.day10.Test01();
//		System.out.println(test.name);

		com.bit.etc10.Ex01 me = new com.bit.etc10.Ex01();
		System.out.println(me.name); //너
		//같은 이름을 가진 클래스는 명세해서 쓰면 명세한 클래스로 만들어짐
		Ex01 me1 = new Ex01();
		System.out.println(me1.name); //나
		//현재 Ex01클래스에서 Ex01을 불렀으므로 외부 패키지의 Ex01보다
		//우선순위를 가짐
		com.bit.day10.Test01 test = new com.bit.day10.Test01();
		System.out.println(test.name); //내 패키지
		Test01 test2 = new Test01();
		System.out.println(test2.name); //너 패키지
		Test01 test21 = new Test01();
		System.out.println(test21.name); //너 패키지
		
		
		
	}
}
