package com.bit.sts08.websocket;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

public class Echointerceptor extends HttpSessionHandshakeInterceptor {
	
	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Map<String, Object> attributes) throws Exception {
		System.out.println("toString:"+wsHandler.toString());
		Set<Entry<String,Object>> set=attributes.entrySet();
		for(Entry<String,Object> entry:set)
			System.out.println("entry:"+entry);
		attributes.put("msg2", "abcd");
		return super.beforeHandshake(request, response, wsHandler, attributes);
	}
	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
			Exception ex) {
		System.out.println("afterHandshake...");
		super.afterHandshake(request, response, wsHandler, ex);
	}
	
}
