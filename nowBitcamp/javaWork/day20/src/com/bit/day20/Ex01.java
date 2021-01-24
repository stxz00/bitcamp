package com.bit.day20;
//바이트스트림에 라이터 장착하기
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Ex01 {
	
	public static void main(String[] args) {
//		File file = new File("test01.txt");
		
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		PrintWriter ps = null;
		try {
			os = new FileOutputStream("test01.txt",true); //기존 파일에 내용 추가 //File없이 바로 쓰면 디렉터리를 만들어주지 않아 오류
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			ps = new PrintWriter(bw);
			/*
			bw.write("문자열스트림으로 변환");
			bw.newLine();
			bw.write("새로운 라인 작성");
			*/
			
			ps.println("문자열스트림으로 변환");
			ps.println("새로운 라인 작성");
			ps.println("한줄작성후 개행");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {ps.close();}
				if(bw != null) {bw.close();}
				if(osw != null) {osw.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
