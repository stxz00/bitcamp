package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;

public class UdpReceiver {
	
	public static void main(String[] args) {
		DatagramSocket sock = null;
		DatagramPacket pack = null;
		
		byte[] buf = new byte[10];
		
		try {
			sock = new DatagramSocket(5000); //담아낼 피켓을 만듬
			pack = new DatagramPacket(buf, 1);
			System.out.println("받을 준비중...");
			sock.receive(pack); // 받을 때 피켓으로 buf의 15공간까지 받음
			InetAddress addr = pack.getAddress(); //자료를 보낸 클라이언트의 주소를 받을 수 있다. 피켓은 쪼개서 오니 Set을 통해 중복된 주소들을 걸러내서 주고받을 수 있다
			System.out.println(addr.getHostName());
			
			System.out.println(Arrays.toString(buf));
//			String msg = new String(buf);
//			System.out.println(">> " + msg);
			System.out.println(buf[0]);
			
			pack = new DatagramPacket(buf, 1);
			System.out.println("또 받을 준비중");
			sock.receive(pack);
			System.out.println(Arrays.toString(buf));
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sock.close();
		}
		//특징 : UDP는 받을 패킷의 양을 알아야한다(모르면 배열 사이즈를 엄청 늘려야함)
		//서버는 리시버이자 센더, 클라이언트가 피켓을 보내면 서버는 피켓을 받은 다음 서버입장에서는 클라이언트를 모르니 어디서 날라온지 보고 데이타를 저장
		
		// 오라클 깔음 - > 내가 쓰는 이 데이타베이스는 직접 외부에서 직접 명령을 통해서 접근하려는 게 아니라 게시판에 글을 쓰면 데이타베이스에 값이 들어가도록 하기 위한 목적으로 데이타 베이스를 깔음 근데 데이타베이스 깔면 막아놓았던 문이 외부에 접속 가능하게 되므로 프로그램 측에서 이를 막아버림. 그래서 사전에 로컬호스트로 서버를 열면 로컬호스트만 접속을 하게 하고 외부의 접근 차단. 아이피로 접속하면 외부에 접속이 가능한 서버로.
	}
}
