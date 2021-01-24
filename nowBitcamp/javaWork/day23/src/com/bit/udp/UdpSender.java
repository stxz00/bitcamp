package com.bit.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;

public class UdpSender {
	
	public static void main(String[] args) {
		String msg = "udp방식으로보냄";
		InetAddress addr = null;
		byte[] by = {(byte)175,(byte)192,123,116}; //내 주소를 바이트배열로 함
		
		
		java.net.DatagramSocket sock = null;
		java.net.DatagramPacket pack = null;
		
		try {
			addr = InetAddress.getByAddress(by);
			sock = new DatagramSocket();
			byte[] arr = msg.getBytes();
//			pack = new DatagramPacket(arr, arr.length,addr,5000);
			pack = new DatagramPacket("abcd".getBytes(), 4,addr,5000);
			
			//데이타와 쪼개서 보낼 길이,주소,포트
			sock.send(pack);//패킷 기준으로 010101 보냄
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sock.close();
		}
		
		
	}
}
