package com.bit.day22;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

//통신 = I/O의 연장선
// IPv4 0.0.0.0 ~ 255.255.255.255 32비트 IPv6는 16진수
// IP 대용으로 쓰고있는 게 도메인.
// 원칙적으로 IP를 통해 들어가야하므로 도메인 치더라도 못들어가나 도메인을 치고 들어가면 바로 접속하지 않고 DNS서버에서 해당 DNS서버가 IP를 받아와서 접속하는 것 DNS서버는 통신사임(LG 등)
public class Ex03 {
	
	public static void main(String[] args) {
		String url = "127.0.0.1"; //"localHost";// (자기 자신 아이피) //"BIT02-08";//(강사님 컴퓨터 이름) //"DESKTOP-PLTDSJG";(내 컴퓨터이름) //"192.168.0.111";(내 아이피) //"///naver.com"; //"naver.com"; 
		//본인 아이피 주소를 쓰면 getCanonicalHostName()에서 BIT02-08이 나옴.(시스템에 있는 컴퓨터 이름) (cmd 창 ipconfig 치면 나옴)
		// 그걸 스트링에 써서 하면 상위 공유기들이 나옴 기업체 공유기는 고정아이피.
		// 강사님 컴퓨터와 연결되어 있으므로 완전 적은 노드(공유기)로 찾을 수 있음. 물론 연결안되어 있으면 못찾음.
		
		//로컬 호스트는 특수 용도주소가 나옴 : 말 그대로 특수목적. 127.0.0.1 이렇게 나오는 게 루프백. 자기 자신임(특수 목적 아이피). 172.16.0.0/12, 192.168.0.0/16(192.168.까지 고정, 0.0 부분을 자유롭게 쓸 수 있음(255의 제곱만큼 사용 가능 한 것), 10.0.0.0/8(070 전화기) 이렇게 나오는건 사설 네트워크(밖으로 나오지 않아야할 주소) 
		//특수 용도주소는 무작위로 나오는 게 아닌 구성 단위 체계로 만들어짐 A~E클래스 
		
		//A 클래스 1.0.0.1 ~ 126.255.255.254	
		//B 클래스 128.0.0.1 ~ 191.255.255.254
		//C 클래스 192.0.0.1 ~ 223.255.255.254
		//D 클래스 224.0.0.0 ~ 239.255.255.254	//특수목적
		//E 클래스 240.0.0.0 ~ 254.255.255.254	//특수목적
		
		
		//인터넷 진흥원에 위탁받아서 하는 도메인 일반 법인, 월드와이드웹.
		//우리나라가 치는 naver.com과 중국에서 치는 naver.com을 치면 다른 사이트가 나올 수 있음.
		//두 개가 다른 서버가 나와야 하므로 한국서버는 한국서버에 중국서버는 중국서버에
		//그냥 naver.com을 하면 해당 국가에 서비스하는 서버들이 나오고
		//www.를 넣으면 어디서나 똑같이 서비스하는 서버로 접속하는 것.
		//우리 입장에서는 www를 쓰나 안쓰나 똑같지만 해외와 우리나라에서 쓰는 속도 차이가 생김.
		byte[] by;
		java.net.InetAddress addr = null;
		java.net.InetAddress[] addrs = null;
		try {
			addr = InetAddress.getByName(url); // 생성자 없음
			by = addr.getAddress();
			
//			System.out.println(addr.getHostName()); // 서버 하나만 운영하는 게 아니라 두 개 이상의 서버를(통신회사들) 놓았기 때문에 유동적으로 IP가 바뀜 
			// 도메인 서버는 단순하게 전달하는 게 아니라 요청을 기준으로 (서버를 뜻하는게 아닌) 가장 빠르고 원할한 IP주소를 가져다 줌
			// 내부 컴퓨터들의 서버를 주는 공유기가 라우터 역할하고 그 라우터들이 각각 연결되는 점들이 노드.
			// DNS서버에서 IP를 받아오면 라우터(공유기)는 본인의 컴퓨터, 휴대폰 등에 IP를 할당하므로 외부 중간지점 라우터에 본인의 IP를 보내고, 그 외부 라우터들도 자기네 IP만을 할당하므로 모르니 외부에 또 보내고 반복, 즉 각 라우터들은 서로 교신을 함. 주고받는 단위는 자기 주변으로 바로 다운로드 하는 정도까지만 교신하여 정보를 얻음. 주고받은 라우터들 사이에서 나와 다운로드 사이의 가장 빠른 속도를 가진 것으로 찾아감. 계속하다보면 최종점으로 도달함. 최종점에 있는 라우터는 자기가 할당했으니 알고 들어가는 것.
			// 구글 퍼블릭 DNS 8.8.8 
			// 자기 서버를 해외 서버로 바꿔서 빠르게 접속하도록 하기도 함
			
//			System.out.println(addr.getCanonicalHostName());
//			System.out.println(addr.getHostAddress());
//			System.out.println(Arrays.toString(by)); // 128넘어가면 음수로 나옴
			addrs = InetAddress.getAllByName(url); //모든 서버 IP 가짐
			for(int i = 0; i < addrs.length; i++) {
				System.out.println(addrs[i].getHostName());
				System.out.println(addrs[i].getCanonicalHostName());
				System.out.println(addrs[i].getHostAddress());
				System.out.println("------------------------------");
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	
	//분류기준
	// 공인 아이피/사설 아이피
	// 내가 공인아이피면 내가 할당해준 아이피는 사설 아이피
	// 특수 목적 아이피인 사설 아이피는 원하는 대로 바꿔도 되지만
	// 공인 아이피는 X, 집 컴퓨터는 하나의 서버컴퓨터
	
	// 고정/유동
	// 고정 아이피는 통신사에서 직접 받았고 기업체 사용
	// 유동 아이피는 변동 아이피. 집 컴퓨터가 유동 아이피(보름에 두 달 정도 마다 바뀜)
	
}
