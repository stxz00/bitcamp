package com.bit.day12;
//TreeSet
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11 implements Comparable{
	int val;
	Ex11(int val){
		this.val = val;
	}
	public static void main(String[] args) {
		Set set = new TreeSet();
		// TreeSet은 HashSet과는 다르게 Value값 기준으로 따지므로
		// Value가 없는 객체는 비교가 안됨
		Ex11 me = new Ex11(1111);
		Ex11 you = me;
		set.add(me); // 처음 넣을 땐 됨
		set.add(new Ex11(2222)); 
		//Comparable 캐스팅오류 (컴페어로 형변환해서 비교하고 있는 것)
		//이후 어떻게 비교할 지 기준이 정해져 있지 않았으므로
		//Comparable 상속 후 오버라이드 후 리턴 값 기준을 만들어주면 됨
		set.add(me);
		set.add(new Ex11(2222));
		set.add(you);
		set.add(new Ex11(2222));
		set.add(new Ex11(3333));
		set.add(new Ex11(4444));
		
//		Iterator ite = set.iterator();
//		while(ite.hasNext()) {
//			System.out.println(((Ex11)ite.next()).val);
//		}
	}

	@Override
	public int compareTo(Object o) {
		System.out.println(this.val); //확인용
		
		return ((Ex11)o).val - this.val;
		//0이면 같음, 1이나 -1 등이면 다르니까 리턴값을 다 1로 정의하면 다 다르다고 인식하므로 넣어짐 
		//리턴값이 음수냐 양수냐에 따라 정렬 위치가 정해짐
	}
}
