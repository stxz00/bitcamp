//data로 받기 int로, 입력되자마자 출력하기로

package com.bit.day15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;




public class Ex12My {
	public static void main(String[] args) {

		File file = new File("Ex12My.bin");
		InputStream is = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		ArrayList<Integer> data = new ArrayList<>();
		
		if(file.exists()) {
			try {
				is = new FileInputStream(file);
				bis = new BufferedInputStream(is);
				dis = new DataInputStream(bis);
				
				while(true) {
					int su = dis.readInt();
					if(su == -1) {break;}
					data.add(su);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (EOFException e) {
				//파일 끝 오류 없앰
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(dis != null) {dis.close();}
					if(bis != null) {bis.close();}
					if(is != null) {is.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("학생 성적 프로그램  DataIOStream ver.");
			System.out.println("------------------------------------");
			
			String main ="1.보기 2.입력 3.수정 4.삭제 0.종료\n>";
			String menu = "------------------------------------\n";
			menu +="학번\t국어\t영어\t수학\n";
			menu += "------------------------------------";
			int input = 0;
		
			while(true) {
				
					System.out.print(main);
					input = sc.nextInt();
					if(input == 0) {
					
					
					
						break;
					}
					if(input == 1) {
						System.out.println(menu);
						for(int i = 0; i < data.size(); i += 4) {
							System.out.print(data.get(i) + "\t" + data.get(i+1) + "\t" + data.get(i+2) + "\t" + data.get(i+3) + "\n");
						}
					
					
					}
					if(input == 2) {
						System.out.print("학번>");
						data.add(sc.nextInt());
						System.out.print("국어>");
						data.add(sc.nextInt());
						System.out.print("영어>");
						data.add(sc.nextInt());
						System.out.print("수학>");
						data.add(sc.nextInt());
					
					
					}
					if(input == 3) {
						System.out.print("수정할 학번>");
						input = sc.nextInt();
						for(int i = 0; i < data.size(); i+=4) {
							if(data.get(i) == input) {
								data.set(i, input);
								System.out.print("국어>");
								data.set(i+1,sc.nextInt());
								System.out.print("영어>");
								data.set(i+2,sc.nextInt());
								System.out.print("수학>");
								data.set(i+3,sc.nextInt());
							}
						}
						
					}
					if(input == 4) {
						System.out.print("삭제할 학번>");
						input = sc.nextInt();
						for(int i = 0; i < data.size(); i+=4) {
							if(data.get(i) == input) {
								data.remove(i);
								data.remove(i);
								data.remove(i);
								data.remove(i);
							}
						}
					}

			try {	
				file.createNewFile();
				os = new FileOutputStream(file);
				//bos = new BufferedOutputStream(os);
				//bos가 되지 않는 이유 -> 바이트로 이미 변환시켰기 때문?
				dos = new DataOutputStream(os);
				
				for(int i = 0; i < data.size(); i++) {
					int su = data.get(i);
					dos.writeInt(su);
				}
				
			}catch(FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(dos != null) {os.close();}
					if(bos != null) {os.close();}
					if(os != null) {os.close();}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다");
		sc.close();
	
	}
}
