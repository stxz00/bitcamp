package com.bit.day20;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Observer;

//자바드로잉은 벡터를 사용
// 벡터와(아무리 확대해도 깨지지 않고 또렷(3d), 시작점과 끝점 그리고 직선으로의 연결을 가지고 만듬(캐드,일러스트), 단점 : 곡선이라는 개념이 없어서 안됨. 오로지 직선이고 계속 조그맣게 직선을 라인에 따라 만드는 것 확대를 계속 하다보면 아주 작은 직선들로 되어있음, 원을 그리면 엄청난 데이터 사용, 연산도 들어감 그래서 그리면 그릴수록 느려지는 이유임, 하지만 시작점,끝점,좌표,연산으로 있으니 자바는 이것을 사용) 비트맵 방식(확대시 희미 : 픽셀, 시작점의 좌표, 끝점의 좌표로 각 픽셀 해상도를 가지고 그 픽셀을 어떤 색으로 정하는 것(포토샵), 원하는 거에 그냥 편하게 사용 가능) 
public class Ex09 extends Frame{
	
	class myCanvas extends Canvas{

		@Override 
		public void paint(Graphics g) {
			g.setColor(Color.RED); //앞으로 쓸 색
			g.drawString("Hello", 100, 100); //그림으로 글씨 쓰기
			g.drawLine(0, 0, 100, 100); //시작점,끝점 
			g.drawRect(100, 200, 100, 50); //사각형 
			g.drawOval(100, 300, 50, 50);
			g.drawArc(100, 400, 100, 100, 0, 180); //호 위처럼 원을 똑같이 그리고 시작지점에서 360도 중 얼마만큼만 보일지 표시
			
			g.setColor(Color.BLUE);
			g.drawString("Hello", 300, 100); 
			g.drawLine(200, 0, 100, 100); 
			g.fillRect(200, 200, 100, 50); //채운 도형들
			g.fillOval(200, 300, 50, 50);
			g.fillArc(200, 400, 100, 100, 0, 180); 
			
			g.setColor(Color.GREEN);
			g.draw3DRect(300, 200, 100, 50,true); //boolean부분은 농도의 위치
//			g.draw3DOval(300, 300, 50, 50,); 지원 안함
//			g.fill3DArc(300, 400, 100, 100, 0, 180,true); 지원안함
			
			Image img = Toolkit.getDefaultToolkit().getImage("34.png");
			Observer observer;
			
			g.drawImage(img, 200, 100,this);
		}
		
	}
	
	Ex09(){
		Canvas can = new myCanvas();
		add(can);
		
		setBounds(100,100,500,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex09 me = new Ex09();
	}
}
