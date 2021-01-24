package com.bit.day14;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
		java.io.File file = new File("target01.txt");
		System.out.println("파일존재 : " + file.exists());
		//src가 아닌 프로젝트쪽에 둬야 true나옴
		java.io.File file11 = new File("src\\target01.txt");
		System.out.println("파일존재 : " + file11.exists());
		//기본적으로 찾는 위치는 javaWork\day14
		
		//절대경로
		java.io.File file111 = new File("C:\\Users\\stxz\\Desktop\\bitcamp\\javaWork\\day14\\target01.txt");
		System.out.println("파일존재 : " + file111.exists());
		
		//상대경로 : 내가 있는 위치 기준으로 위치 구하는것
		String path = "target01.txt"; 
		String path1 = ".\\target01.txt"; 
		// path1이 생략되어 path가 된 것
		// cmd할 때  cd . 현재 cd .. 이전으로
		// cd / 하면 하위폴더 안으로
		java.io.File file1111 = new File(path);
		System.out.println("파일존재 : " + file1111.exists());
		
		String path2 = "test01"; 
		java.io.File file11111 = new File(path2);
		System.out.println("파일존재 : " + file11111.exists());
		//폴더도 파일임 그러니 true가 된 것, 꼭 인지하기(=디렉토리)
		
		String path3 = "."; 
		java.io.File file111111 = new File(path3);
		System.out.println("파일존재 : " + file111111.exists());
		//현재 폴더
		System.out.println("이름 : " + file111111.getName());
		
		System.out.println("이름 : " + file111.getName());
		System.out.println("이름 : " + file.getName());
		
		System.out.println("디렉토리 : " + file.isDirectory());
		System.out.println("파일 : " + file.isFile());
		
		String path4 = "src"; 
		java.io.File file111112 = new File(path4);
		
		System.out.println("디렉토리 : " + file111112.isDirectory());
		System.out.println("파일 : " + file111112.isFile());
		
		System.out.println("경로 : " + file11.getPath());
		System.out.println("경로 : " + file111.getPath());
		// 상대경로로 넣었으면 상대경로로, 절대일때는 절대로 나옴
		System.out.println("절대경로 : " + file11.getAbsolutePath());
		//상대경로는 지정 기준이 있어야하기 때문에 메서드 없음
		
		System.out.println("------------1--------------");
		java.io.File file111113 = new File("target02.txt");
		System.out.println("이름 : " + file111113.getName());
		System.out.println("경로 : " + file111113.getPath());
		//실제로는 파일이 없음! 디렉토리,파일 존재 여부는 false인데 이름과 경로를 찾을 수 있음.
		System.out.println("절대경로 : " + file111113.getAbsolutePath());
		System.out.println("-------------2-------------");
		String path5 = "C:\\Users\\stxz\\Desktop\\bitcamp\\javaWork\\day01\\..\\day14\\target02.txt"; 
		//..으로 뒤로 가서 다시 day14로 들어와도 됨(절대경로와 상대경로 둘 다 쓴 케이스
		java.io.File file111114 = new File(path5);
		System.out.println("경로 : " + file111114.getPath());
		System.out.println("절대경로? : " + file111114.getAbsolutePath());
		// 절대경로로 나오지 않고 있음
		
			try {
				System.out.println("절대경로2 : " + file111114.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		//절대 경로로 만들어짐
	
		
		System.out.println("------------3--------------");
		System.out.println("부모경로 : " + file111.getParent());
		System.out.println("size : " + file.length() + " bytes");
		//폰트 크기
		System.out.println("최종수정 : " + new Date(file.lastModified()));
		//file.lastModified() 가 long형으로 나오니 이를 Date로 하면 나옴
		
		
		//자바는 자바가상머신에서 돌아가는데 실제 운영체제와 파일이 만들어지고 있음 -> 운영체제와 파일 사이에 자바가상머신
		System.out.println("--------------4------------");
		System.out.println("rwx r읽기권한 : " + file.canRead());
		System.out.println("rwx w쓰기권한 : " + file.canWrite());
		System.out.println("rwx x실행권한 : " + file.canExecute());
		//target01.txt를 우클릭 properties -> read-only를 하면 쓰기권한 falese 나옴
		
		System.out.println("------------5--------------");
		if(file111111.isDirectory()) {
			String[] arr = file111111.list();
			System.out.println(Arrays.toString(arr));
		}
		//폴더 안의 파일들을 명세
		
		//dir.exe
		System.out.println("--------------------------");
		/*
		File file2 = new File(".");
		System.out.println(file2.getAbsolutePath() + " 디렉터리");
		
		Date d = new Date(file2.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String s = sdf.format(d);
		System.out.println(s + "\t<DIR>");
		String[] arr1 = file2.list();
		for(int i = 0; i < arr1.length; i++) {
			System.out.println(s + "\t<DIR>\t" + arr1[i].length() + "\t" + arr1[i]);
		}
		
		System.out.println(new File(".").listFiles().length  + "개 파일");
		*/
		
		
		
	} 
}
