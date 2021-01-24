package com.bit.day17;
//메뉴만들기
//메뉴의 주체는 프레임창
//메뉴는 프레임의 연장선
// Menu, Button, Canvas, Checkbox, Choice, Container, Label, List, Scrollbar, TextComponent 등 대부분의 UI는 컴포넌트를 상속받음
import java.awt.CheckboxMenuItem;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex01 implements ActionListener{
	
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		
		
		MenuItem it01 = new MenuItem(); //메뉴에 리스트 추가
		it01.setLabel("새파일");
		
		MenuItem it02 = new MenuItem("저장");
		MenuItem it03 = new MenuItem("종료");
		
		
		MenuItem it04 = new CheckboxMenuItem("잘보기",true); 
		//체크박스 리스트 추가
		
		MenuItem it05 = new CheckboxMenuItem("확대"); 
		MenuItem it06 = new CheckboxMenuItem("축소"); 
		
		Menu mn04 = new Menu("확대/축소"); //메뉴에 더 안 메뉴 넣기
		mn04.add(it05);
		mn04.add(it06);
		// 메뉴는 메뉴 아이템을 상속받고, 다형성 때문에 이런 게 가능함
		
		
		Menu mn01 = new Menu(); //메뉴바에 메뉴들 생성
		mn01.setLabel("파일(F)");
		mn01.add(it01);
		mn01.add(it02);
		mn01.addSeparator(); //구분선 추가
		mn01.add(it03);
		
		Menu mn02 = new Menu("도움말(H)");
		
		Menu mn03 = new Menu("보기(V)");
		mn03.add(it04);
		mn03.add(mn04); //확대 축소 메뉴를 보기에 추가
		
		MenuBar mb = new MenuBar();
		mb.add(mn01); //메뉴바에 메뉴 생성 보임
		mb.add(mn03);
		mb.add(mn02);
		frame.setMenuBar(mb); //1. 메뉴바생성, 거의 안보임
		
		frame.setLocation(100,100);
		frame.setSize(500,300);
		frame.setVisible(true);
		
		FileDialog dia = new FileDialog(frame,"",FileDialog.SAVE); 
		//파일 다이알로그(종속할 프레임, 타이틀,0 : 열기, 1 : 저장 등)
		//운영체제에 따라 되는 기능이 다름
		
		dia.setLocation(150,150);
		dia.setSize(200,200);
		dia.setVisible(true);
		
		//아래는 파일을 선택하여 열기, 저장을 누르면 파일의 이름이 나오는 게 확인
		System.out.println(dia.getDirectory()); //디렉터리 위치와
		System.out.println(dia.getFile());  //파일의 위치 합치면 정확한 위치가 됨
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
