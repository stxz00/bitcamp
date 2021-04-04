package com.bit.sts08.websocket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class EchoHandler extends TextWebSocketHandler {
	List<WebSocketSession> list=new ArrayList<>();
	   
	   @Override
	   public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		   System.out.println(session.getId());
			System.out.println(session.getAttributes());
			list.add(session);
	   }
	   
	   @Override
	   public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
	      Object obj = message.getPayload();
	      System.out.println(obj);
	      session.getAttributes();
	      for(WebSocketSession sockSession:list)
	      sockSession.sendMessage(message);
	}

	//var sock=new SockJS('/sts08/echo'); <-주소를 마킹하고 있는게
	//ws://localhost:8080/sts08/echo 
	//핸들러로 웹소켓 서버를 열어주는 것. 웹소켓의 핸들러.
	//소켓의 js패턴을 이용해 서버를 열겠다는 것의 sockjs
	
	//sock.send('3166ㄱㅇㄷㄱ'); 이런거 개발자 도구에서 치면 콘솔창에서 출력됨
	//다른 창으로 이동하면 사라짐(방으 나가는 것과 같음)
	//우리가 만든 서버 채팅과 같은거임
	//포트를 꼐속 열어놓고 있어야하는것과 같음 
	
	//원래는 자바스크립트를 통해 주고 받는 것, 데이터의 이동도 자바스크립트가 왔다갔다
	//json으로 
	
	//서블릿이 웹서버 역할. 
	
	//결론 : 핸들러로 열면 클래스에 TextWebSocketHandler 상속받고 sockjs 객체 찍고 센드하면 가능하다는 것
	// 특정 소켓 포트를 계속 열어놓는 것 
	
	//클라이언트한테 받은 내용을 echo 나한테 보내면 echo서버가 되는 거고
	//전 클라이언트한테 보내면 채팅이 되는 것
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		list.remove(session);
		System.out.println("close...");
	}
}
