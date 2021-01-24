package com.bit.day22;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

//소켓프로그래밍
public class Ex06 {
	
	public static void main(String[] args) {
		//일반적으로 TCP, 특수한 목적은 UDP(연결없이 통신, 신뢰성없는 데이터 전송, 전송순서 바뀌고, 수신여부 확읺안함, 패킷관리, 전송속도 빠름)
		
		// 소켓 : 프로세스간의 통신에 사용되는 양쪽 끝단 (전화기 같은 기능)
		// 클라이언트 서버에 접속 요청오면 그에 따른 하나의 소켓이 필요함. 클라이언트는 하나만 연결하면 되지만 서버는 여러 개를 연결하니까
		// 클라이언트의 인풋은 서버는 아웃풋이고 아웃풋은 인풋
		
		java.net.Socket sock = null;
		// 소켓에 서버의 아이피를 넣어야 연결 //지금은 본인 컴퓨터 주소
		// 기본적으로 문이 막혀있음 문을 열기 위해 포트번호가 필요
		
		InputStream is = null;
		InputStreamReader isr = null;
		
		try {
			sock = new Socket("127.0.0.1",5000); //서버와 포트번호, 이상태로 실행하면 서버 문이 막혀있으니 x
			is = sock.getInputStream(); //서버로부터 환영인사 받음
			isr = new InputStreamReader(is);
			
			while(true) {
				int su = isr.read();
				if(su == -1) {break;}
				System.out.print((char)su);
			}
			
//			System.out.println("접속됨");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(isr != null) {isr.close();}
				if(is != null) {is.close();}
				if(sock != null) {sock.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
