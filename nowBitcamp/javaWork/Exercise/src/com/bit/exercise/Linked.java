package com.bit.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked {
	private static Scanner sc = new Scanner(System.in);
	private static LinkedList<Integer> data =  new LinkedList<>();

	static void stuInsert() {
		System.out.print("학번 > ");
		int num = sc.nextInt();
		for(int i = 0; i < data.size(); i+=4) {
			if(data.get(i) == num) {
				System.out.println("이미 학번이 존재합니다");
				break;
			}
		}
		data.add(num);
		System.out.print("국어 > ");
		data.add(sc.nextInt());
		System.out.print("영어 > ");
		data.add(sc.nextInt());
		System.out.print("수학 > ");
		data.add(sc.nextInt());
	}
	
	
	public static void main(String[] args) {
		File file = new File("Linked.txt");

		FileInputStream fis = null;
		if(file.exists()) {
			try {
				fis = new FileInputStream(file);
				
				for(int i = 0; i < file.length(); i ++) {
					data.add((int)fis.read());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if(fis != null) {fis.close();}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		System.out.println("학생 성적 프로그램 LinkedList ver.");
		System.out.println("---------------------------------------");
		
		String main = "1.보기 2.입력 3.수정 4.삭제 0.종료\n>";
		String menu = "---------------------------------------\n";
		menu += "학번\t국어\t영어\t수학\t\n";
		menu += "---------------------------------------";
		
		int input = 0;
		
		while(true) {
			System.out.print(main);
			input = sc.nextInt();
			if(input == 0) {
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(file);
					byte[] by = new byte[data.size()]; 
					for(int i = 0; i < data.size(); i++) {
						by[i] = data.get(i).byteValue();
						fos.write(by[i]);
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						if(fos != null) {fos.close();}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				break;
				}
			
			if(input == 1) {
				System.out.println(menu);
				for(int i = 0; i < data.size(); i+=4) {
					System.out.println(data.get(i) + "\t" + data.get(i+1) + "\t" + data.get(i+2) + "\t" + data.get(i+3));
					if(data.size()-4 == i) {
						break;
					}
				}
			}
			if(input == 2) {
				stuInsert();
			}
			if(input == 3) {
				System.out.print("수정할 학번 > ");
				input = sc.nextInt();
				for(int i = 0; i < data.size(); i+=4) {
					if(data.get(i) == input) {
						System.out.print("국어 > ");
						data.set(i+1,sc.nextInt());
						System.out.print("영어 > ");
						data.set(i+2,sc.nextInt());
						System.out.print("수학 > ");
						data.set(i+3,sc.nextInt());
						break;
					}else if(data.size()-4 == i) {
						System.out.println("학번이 존재하지 않습니다");
						break;
					}
				}
			}
			if(input == 4) {
				System.out.print("삭제할 학번 > ");
				input = sc.nextInt();
				for(int i = 0; i < data.size(); i+=4) {
					if(data.get(i) == input) {
						data.remove(i);
						System.out.print("국어 > ");
						data.remove(i);
						System.out.print("영어 > ");
						data.remove(i);
						System.out.print("수학 > ");
						data.remove(i);
						break;
					}else if(data.size()-4 == i) {
						System.out.println("학번이 존재하지 않습니다");
						break;
					}	
				}
			}
		}
		System.out.println("이용해주셔서 감사합니다");
	}	
}
