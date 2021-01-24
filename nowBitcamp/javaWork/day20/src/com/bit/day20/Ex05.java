package com.bit.day20;
//오브젝트스트림
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Ex05 {
	public static void main(String[] args) {
		File file = new File("test02.bin");
		
		InputStream is = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream(file);
			ois = new ObjectInputStream(is);
			/*
			int su = ois.readInt();
			double su2 = ois.readDouble();
			String msg = ois.readUTF();
			
			System.out.println("int : " + su);
			System.out.println("double : " + su2);
			System.out.println("UTF : " + msg);
			
			Object obj = ois.readObject();
			
			Vector vec = (Vector)obj; 
			
			Enumeration em = vec.elements();
			while(em.hasMoreElements()) {
				System.out.println(em.nextElement());
			}
			*/
			
//			Object obj = ois.readObject();
//			ArrayList list = (ArrayList)obj;
			/*
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			*/
			/*
			Set set = (HashSet)obj;
			Iterator ite = set.iterator();
			while(ite.hasNext()) {
				System.out.println(ite.next());
			}
			*/
			Object obj = ois.readObject();
			Vector vec = (Vector)obj;
			System.out.println(vec.get(0));
			System.out.println(vec.get(1));
			System.out.println(vec.get(2));
			Set list = (Set)vec.get(3);
			Iterator ite = list.iterator();
			while(ite.hasNext()) {
				System.out.println(ite.next());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(ois != null) {ois.close();}
				if(is != null) {is.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
