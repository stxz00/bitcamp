package com.bit.day19;

interface Inter01{
	//오직 추상메서드만 갖는 
	public abstract void finc01();	
	void func02();
}

public class Ex07 implements Inter01{

	public static void main(String[] args) {
		Inter01 inter = new Ex07();
	}

	@Override
	public void finc01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}
}
