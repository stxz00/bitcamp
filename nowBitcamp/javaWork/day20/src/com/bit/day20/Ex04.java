package com.bit.day20;
//오브젝트스트림
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Ex04 {
	public static void main(String[] args) {
		File file = new File("test02.bin");
		
		OutputStream os = null;
//		DataOutputStream dos = null; 
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream(file);
//			dos = new DataOutputStream(os);
			/*
			dos.writeInt(1111);
			dos.writeDouble(3.14);
			dos.writeUTF("문자열"); //이렇게 데이타스트림의 한계
			*/
			
			oos = new ObjectOutputStream(os); //데이타스트림의 한계를 극복한 오브젝트스트림
			/*
			oos.writeInt(1234);
			oos.writeDouble(3.14);
			oos.writeUTF("한글");
			*/
			/*
			Vector vec = new Vector<>();
			vec.add(1111);
			vec.add(3.14);
			vec.add("문자열");
			oos.writeObject(vec); //중요!
			*/
			/*
			List list = new ArrayList();
			list.add(1234);
			list.add(3.14);
			list.add("리스트로 작성");
			
			oos.writeObject(list);
			*/
			
			Set set = new HashSet<>();
			set.add(1234);
			set.add(3.14);
			set.add(3.14);
			set.add("리스트로 작성");
			
			
			Vector vec = new Vector<>();
			vec.add(1111);
			vec.add(3.14);
			vec.add("문자열");
			vec.add(set);
			oos.writeObject(vec);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) {oos.close();}
				//if(dos != null) {dos.close();}
				if(os != null) {os.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
