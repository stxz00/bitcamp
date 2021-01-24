package com.bit.day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class EX12 {
	public static void main(String[] args) {
		List list = new Vector();
		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
	}
}
