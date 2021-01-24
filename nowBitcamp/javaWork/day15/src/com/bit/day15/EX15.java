package com.bit.day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EX15 {
	public static void main(String[] args) {
		File file = new File("test03.txt");
		java.io.Writer wt = null;
		String msg = "xyz\t한글\n1234!@#$";
		char[] arr = msg.toCharArray();
		java.io.BufferedWriter bw = null;
		java.io.PrintWriter pw = null;
		try {
			file.createNewFile();
			wt = new FileWriter(file);
			bw = new BufferedWriter(wt);
			pw = new PrintWriter(bw);
			
			pw.print("스트링을 그냥 작성할 수 있습니다");
			pw.println("스트링을 그냥 작성할 수 있습니다");
			//println에는 newLine이 들어가있음
			
/*			
//			bw.write(arr);
			bw.write("스트링을 그냥 작성할 수 있습니다");
//			bw.write("\r\n");
			bw.newLine(); // 운영체제에 맞춰 엔터 기능
			bw.write("abcdefg");
			bw.newLine(); 
			bw.write("!@#$%");
			//버퍼는 1바이트씩 쓰는게 아닌 일단 저장했다가 한꺼번에 쓰므로 가능 
			
*/			
			/*
			wt.write(65);
			wt.write(97);
			wt.write('A');
			wt.write('a');
			wt.write('B');
			wt.write('b');
			wt.write('C');
			wt.write('c');
			wt.write('\n');
			wt.write('한');
			wt.write('글');
			*/
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {bw.close();}
				if(wt != null) {wt.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
