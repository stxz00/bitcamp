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

	//var sock=new SockJS('/sts08/echo'); <-�ּҸ� ��ŷ�ϰ� �ִ°�
	//ws://localhost:8080/sts08/echo 
	//�ڵ鷯�� ������ ������ �����ִ� ��. �������� �ڵ鷯.
	//������ js������ �̿��� ������ ���ڴٴ� ���� sockjs
	
	//sock.send('3166��������'); �̷��� ������ �������� ġ�� �ܼ�â���� ��µ�
	//�ٸ� â���� �̵��ϸ� �����(���� ������ �Ͱ� ����)
	//�츮�� ���� ���� ä�ð� ��������
	//��Ʈ�� ���� ������� �־���ϴ°Ͱ� ���� 
	
	//������ �ڹٽ�ũ��Ʈ�� ���� �ְ� �޴� ��, �������� �̵��� �ڹٽ�ũ��Ʈ�� �Դٰ���
	//json���� 
	
	//������ ������ ����. 
	
	//��� : �ڵ鷯�� ���� Ŭ������ TextWebSocketHandler ��ӹް� sockjs ��ü ��� �����ϸ� �����ϴٴ� ��
	// Ư�� ���� ��Ʈ�� ��� ������� �� 
	
	//Ŭ���̾�Ʈ���� ���� ������ echo ������ ������ echo������ �Ǵ� �Ű�
	//�� Ŭ���̾�Ʈ���� ������ ä���� �Ǵ� ��
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		list.remove(session);
		System.out.println("close...");
	}
}
