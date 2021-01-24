package com.bit.day22;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex04 {
	
	public static void main(String[] args) {
		String spec = "https://shopping.naver.com/style/fashionbrand/stores/100060243/products/5265904503?NaPm=ci%3Dshoppingwindow%7Cct%3Ddummy%7Ctr%3Dswl%7Chk%3D66ce621a5bccd71b510821380b796d02c838ddd1%7Ctrx%3Di%3A5265904503#top"; 
		//spec은 주소, 앵커가 없어서 #top 직접 뒤에 씀
//		프로토콜://도메인(ip): 포트번호/패스?쿼리#앵커
//		프로토콜은 원래 붙여야하지만 안해도 자동으로 붙여줌
//		프로토콜 http, https 
//		http는 암호화 되지 않고 공개되어있음 하이퍼 텍스트 트랜스퍼 프로토콜
//		그래서 암호화된 https 씀 over secure socket layer
//		회원가입 로그인 등.. 비싸지만 법적으로 강제화 되어있음.
		
// 		포트 - 디폴트 포트 : 80(http), 443(https)
//		0번 ~ 1023번: 잘 알려진 포트 (well-known port), 사전에 약속되어있는 포트(정해진 포트) 
//		1024번 ~ 49151번: 등록된 포트 (registered port), 기약속된 것은 아니지만 회사마다 정해진 포트가 있음, 동일한 포트로 서비스 불가능, 충돌문제, 럭키 번호를 따려고 회사 경쟁있음 
//		49152번 ~ 65535번: 동적 포트 (dynamic port), 마음대로 써도 됨

//  	패스는 요청정보(요청 페이지를 전달), /<- 노트로 원하는 곳으로 감. 

// 		쿼리 - 정보전달, ?부터
		
//		앵커 - 다양한 목적으로 사용 #
		
		java.net.URL url = null;
		
		try {
			url = new URL(spec);
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("도메인 : " + url.getHost());
			System.out.println("포트1 : " + url.getPort()); //-1은 주소상에서 안보인다는 것
			System.out.println("포트2 : " + url.getDefaultPort()); //디폴트포트  https://swindow.naver.com:443 이 생략되어있음
			System.out.println("패스 : " + url.getPath());
			System.out.println("url쿼리 : " + url.getQuery());
			System.out.println("앵커 : " + url.getRef());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
