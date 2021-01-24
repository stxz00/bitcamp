package com.bit.day15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	public static void main(String[] args) {
		InputStream myIn = System.in;

		OutputStream myOut= System.out;
		//내쪽에서 콘솔쪽으로 가는 것 -> 아웃풋스트림
		//우리가 썼던 SYstem.out이 이것임
		try {
			int su = myIn.read(); 
			//콘솔은 운영체제가 가지고 있는 터미널(키보드같이)
			System.out.println(su); //입력한 내용을 하나씩 출력
			su = myIn.read();
			System.out.println(su);
			su = myIn.read();
			System.out.println(su);
			// a 누르고 엔터 치면 a와 \r\n 나옴
			//IO에서는 문자로써만 엔터를 인식
			//여기서 출력됨(엔터의 특성)
			//자바 IO는 입력받기 전까지 대기하는 특성이 있음
			su = myIn.read();
			System.out.println(su);
			//그다음 내용 입력하면 출력
			System.out.println("끝");
		
			
//			myOut.write(65);
//			myOut.write(66);
//			myOut.write(67);
//			myOut.flush();
//			myOut.close();
			//close를 하지 않으면 출력이 되지 않는다
			//내부적으로 버퍼를 가지고 있음 그 버퍼를 밀어내는 방법이 close 이런 이유로 close()를 하지 않으면 위 내용들이 날아갈수도 있음 반드시 close 하기
			//연결된 상황에서도(채팅같이) 소켓에서 IO가 가지고 있는 것을 밀어낸다는 뜻으로 flush()를 쓰면 출력이 된다 close 쓰지 않으면 이것으로 버퍼를 밀어내면 됨 close() 내부에 flush()가 내장되어 있음!
			//중간에 flush로 밀어내도 되나 성능이 월등히 떨어지게 되니 적당히 쓰도록 하기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
