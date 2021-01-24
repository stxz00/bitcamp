package com.bit.day15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex12 {

   public static void main(String[] args) {
      File save=new File("stu.bin");
      if(!save.exists()) {
         try {
            save.createNewFile();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
      System.out.println("학생성적관리프로그램 (ver 0.6.0)");
      String menu="1.보기 2.입력 0.종료>";
      String table="-------------------------------------";
      table+="\n학번\t이름\t국어\t영어\t수학";
      table+="\n-------------------------------------";
      
      InputStream console=System.in;
      int su=0;
      byte[] buf=new byte[3];
      while(true) {
         System.out.print(menu);
         try {
            su=console.read(buf);
            if(buf[0]=='0') {break;}
            if(buf[0]=='1') {
               System.out.println(table);
               InputStream is=null;
               DataInputStream dis=null;
               try {
                  is=new FileInputStream(save);
                  dis=new DataInputStream(is);
                  while(true) {
                     int num=dis.readInt();
                     if(num==-1) {break;}
                     System.out.print(num);
                     System.out.print('\t');
                     System.out.print(dis.readUTF());
                     System.out.print('\t');
                     System.out.print(dis.readInt());
                     System.out.print('\t');
                     System.out.print(dis.readInt());
                     System.out.print('\t');
                     System.out.println(dis.readInt());
                  }
               }catch(IOException e) {
               }finally {
                  if(dis!=null) {dis.close();}
                  if(is!=null) {is.close();}
               }
               
            }else if(buf[0]=='2') {
               System.out.print("학번>");
               int num=myInput();
               System.out.print("이름>");
               String name=myInputString();
               System.out.print("국어>");
               int kor=myInput();
               System.out.print("영어>");
               int eng=myInput();
               System.out.print("수학>");
               int math=myInput();
               InputStream is=null;
               OutputStream os=null;
               DataOutputStream dos=null;
               try {
                  is=new FileInputStream(save);
                  byte[] old=new byte[(int) save.length()];
                  is.read(old);
                  os=new FileOutputStream(save);
                  dos=new DataOutputStream(os);
                  
                  dos.write(old);
                  dos.writeInt(num);
                  dos.writeUTF(name);
                  dos.writeInt(kor);
                  dos.writeInt(eng);
                  dos.writeInt(math);
                  dos.flush();
               }catch(IOException e) {
               }finally {
                  if(dos!=null) {dos.close();}
                  if(os!=null) {os.close();}
               }
            }
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }
   public static String myInputString() throws IOException {
      String msg=null;
      InputStream inn = System.in;
      byte[] by=new byte[12];
      int su=inn.read(by);
      msg=new String(by,0,su-2);
      return msg;
   }
   
    public static int myInput() throws IOException {
       String msg=new String(myInputString());
       return Integer.parseInt(msg);
    }
}






