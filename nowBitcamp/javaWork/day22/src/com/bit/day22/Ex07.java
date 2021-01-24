package com.bit.day22;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex07 {
	
	public static void main(String[] args) {
		ServerSocket serv = null; //서버에서는 소켓이 존재하지 않고 있다가 서버 문이 열리고 클라이언트가 접속하려 할 때 소켓이 생김
		Socket sock = null; 
		String msg = "접속을 환영합니다";
		OutputStream os= null;
		try {
			serv = new ServerSocket(5000); //포트 5000으로 문 열음 //데이터가 들어오기 전까지 대기
//			System.out.println("접속대기중...");
			sock = serv.accept(); // 서버소켓이 소켓을 받음.
			System.out.println(sock.getInetAddress()); //들어온 클라이언트 서버의 주소를 받음
			//브라우저 자체가 클라이언트 프로그램임!! 이걸 실행하고 포트 5000을 브라우저에 치면 나옴!
			
//			System.out.println("받아들임");
			//Ex07을 실행하면 서버를 열어놓고 접속대기 중인 상태
			// 이때 Ex06을 실행하면 클라이언트가 접속됨
			
			os = sock.getOutputStream(); //소켓으로부터 아웃풋스트림 줌
			os.write(msg.getBytes()); //소켓에 접속환영 출력해줌
			os.flush();
			
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {
				if(os != null){os.close();}
				if(sock != null){sock.close();}
				if(serv != null) {serv.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // 에러메세지는 한쪽이 끊겼다는 것.
			}
		}
		
	}
}
