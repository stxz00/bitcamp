package com.bit.day12;

import java.util.HashSet;
import java.util.Iterator;

public class Ex09 {
	public static void main(String[] args) {
		java.util.Set set1 = new HashSet();
		//순서x 중복x
		set1.add(1111);
		set1.add(2222);
		set1.add(3333);
		set1.add(4444);
		set1.add(5555);
		//순서가 없으니 끄집어 낼 방법 = vector
		
		Iterator ite = set1.iterator(); //순서를 만듬
		while(ite.hasNext()) { //다음이 있는지 boolean 
			System.out.println(ite.next());
		}
		// 이후에 다시 next를 실행시키면 커서가 밖으로 나가 이미 끝났으므로 안됨.
		// 그래서 다시 set1의 내용을 보고 싶다면 새로운 Iterator로 만들어서 해야함
		// 주의 : set을 돌린게 아닌 Iterator를 만들어서 한거니 set은 변하지 않았다는 걸 꼭 감안. 당연하지만 ite = obj 등 했다 해도 변하지 않다는 거
		
		System.out.println(set1.add(5555)); //추가 안된다고 false 
		//랜덤하게 나오는 것 같지만 해시코드 기준으로 정렬되니 컴퓨터 등 다시 시작하지 않는 한 계속 실행해도 똑같은 순서로 나옴
		System.out.println("--------------------");
		Iterator ite2 = set1.iterator(); //순서를 만듬
		while(ite2.hasNext()) { //다음이 있는지 boolean 
			Object obj = ite2.next();
			System.out.println(obj);
		}
		System.out.println("--------------------");
		ite = set1.iterator(); //다시 set1을 불러왔으니 됨.
		while(ite.hasNext()) {
			System.out.println(ite2.next());
		}
		
		
	}
}
