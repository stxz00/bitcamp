package com.bit.day20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

// 객체 직렬화 - Serializable
// 객체의 실제 값을 써야하는데 어떻게 써야하는 지 정해져 있지 않으므로 오류가 뜸

class Node implements Serializable{ //인터페이스 직렬화 //clone처럼 프로텍티드 한거라고 생각하면 됨 cloneable 객체의 내용을 바이트로 바꾸는 과정이 직렬화
	//받는 사람이 자료를 마음대로 바꿔서 쓸 위험.(게임으로 치면 게임 내용을 받아서 수정(핵)해서 자기의 이득을 취하게 하는 것)
	//시리얼번호를 부여하고, 만약 내용을 바꿔버렸다면 시리얼번호를 바꿔버림
	//먼저 파일을 만들고 읽은 다음, os에서 클래스 내용을 변경후 실행하지 않고 리더를 실행하면 시리얼 번호가 다르므로 오류가 나오도록 함! 
	//대상 : 필드만
	//		제외된 값은 각 타입의 디폴트값
//	private static final Long serialVersionUID = 1L; //<- 시리얼번호. 노란색 표시는 직접 개발자가 부여하는지 물어보는 것
	
	transient int val1; //트래전트 transient : 값을 보내기 싫은 것을 직렬화에서 제외함(값을 안보냄).(호출 시 오류는 아니고 데이터타입의 디폴트 값들이 나옴. 0, null...)
	
	private int val2;
	int val3;
	
	
	public void func1(int a) {
		val1 = a;
	}
	public int get2() {
		return val2+10000; // 기존처럼 os저장 안한 상태에서 메서드의 10000를 추가했는데 직렬화 오류가 반영 안됨 -> 이는 메서드 제외 필드만 직렬화가 대상인 것이다
		// 힙영역에서 각 개체의 필드와 메서드 존재 할 때 필드는 각 객체마다 같은 필드의 값을 다르게 만듬, 메서드도 똑같이 같은 메서드지만 메모리적으로 메서드는 호출하면 스택에서 힙영역으로 메서드를 힙영역으로 가서 받아서 스택으로 가야하는데 이건 메모적으로 복잡한 순서와 메모리손실이 나므로 아예 메서드를 스택영역에 올려버려서 사용하면 됨. 클래스의 진행 흐름을 가지고 있는 클래스가 적혀 있을 공간에 메소드가 정의되어 있으면 static영역에 main이 있고 클래스영역에 실제 적힌 메서드가 있고, 힙영역에도 메서드가 있어버리므로 매우 손실임. 그러면 아예 메서드를 클래스영역 어딘가에 올려버리면 이리저리 갈 필요 없이 한 곳에 값을 저장해놓으면 됨.(실제로 이러한 이유로 클래스영역이 많은 부분을 차지함), 즉 실질적으로 우리가 아는 영역 구분을 깨버림. 하지만 언젠가는 힙영역에도 찍을 수 있고 그러므로 유동적으로 생각하자. 객체는 사실 메서드가 없고(클래스영역에 존재) 필드만 있게 된다 생각(힙영역). 그렇게 되니 메서드가 변형되어도 클래스영역에 있으니 시리얼번호가 변경되지 않는 것!
	}
}


public class Ex06 {
	public static void main(String[] args) {
		File file = new File("test03.bin");
		OutputStream os = null;
		ObjectOutputStream oos = null;
		
		try {
			os = new FileOutputStream(file);
			oos = new ObjectOutputStream(os);
			
			Node node = new Node();
			node.val1 = 1111;
			node.func1(2222);
			
			oos.writeObject(node); //java.io.NotSerializableException 객체 직렬화
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
