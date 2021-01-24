package com.bit.ex05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer extends Thread{
	Socket sock;
//	String msg = "<h1>Hello</h1> world...";
	String msg = "<h1>Hello</h1> world..."; //헤더 구분
	
	@Override
	public void run() {
		OutputStream os = null;
		try {
			os = sock.getOutputStream();
			
//			os.write("HTTP/1.1 200 OK \r\n".getBytes()); //헤더 등 구분경계를 하기 위한게 없는 상황
														// 빈 개행 이 부분이 안보여주는 헤더 정보 부분
//			os.write("\r\n".getBytes()); //개행 기준으로 보여줄 내용적인 부분
//			os.write(msg.getBytes());
			
//			os.write("HTTP/1.1 404 Not Found \r\n".getBytes()); //웹페이지 오류 페이지!
//			// 빈 개행 이 부분이 안보여주는 헤더 정보 부분
//			os.write("\r\n".getBytes()); //개행 기준으로 보여줄 내용적인 부분
//			os.write(msg.getBytes());
			

			os.write("HTTP/1.1 200 OK\r\n".getBytes()); //헤더정보
			os.write("Content-Type:text/plain; \r\n".getBytes()); 
			//헤더의 내용 구분(text/plan 하면 그대로 msg 텍스트)
			os.write("\r\n".getBytes()); //개행 기준으로 보여줄 내용적인 부분
			os.write(msg.getBytes());
			os.flush();
			os.close();
			//우리가 프로토콜에 할일은 여기까지!
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		ServerSocket serv = null;
		try {
			//브라우저에 http://121.129.154.65:5000/ 하면 자바에 접속됨 프린트아웃 나옴
			//http이기 때문에 이 접속이 정상이라고 해줘야함
			//요즘 브라우저는 요청을 두 번 받아야 하기 때문에 다름
			serv = new ServerSocket(5000); 
			System.out.println("접속대기...");
			while(true) {
				Socket sock = serv.accept();
				System.out.println("접속완료");
				WebServer client = new WebServer();
				client.sock = serv.accept();
				client.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
