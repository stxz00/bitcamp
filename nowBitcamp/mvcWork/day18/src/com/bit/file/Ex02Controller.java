package com.bit.file;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/ex02.bit")
public class Ex02Controller extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String id=req.getParameter("id");
		//System.out.println("id:"+id);
		//multipart/form-data로 하면 값을 못받기 null이 나옴.
		
		
		// 파일명 중복처리
		com.oreilly.servlet.multipart.FileRenamePolicy frp;
		frp=new DefaultFileRenamePolicy();
		//중복돠었을경우에만 파일명 수정
		
		// 업로드 파일 사이즈 지정 //디폴트 사이즈가 매우 작게 되어있음
		// 1 byte
		// 1kb == 1024byte
		// 1mb == 1024kb == 1024*1024byte;
		
		int maxsize=10*1024*1024;
		
		//파일 업로드 디렉토리 지정
		String path=req.getRealPath("upload");
		System.out.println(path);
		com.oreilly.servlet.MultipartRequest mr;
		mr=new MultipartRequest(req, path,maxsize,"utf-8",frp);
		//아이피,저장경로,사이즈제한,엔코딩,파일명 중복처리
		//파일보내기:리퀘스트와 저장되는 경로(리퀘스트를 아이피주소로 하면 그곳으로 가게 됨)
		
		
		String id=mr.getParameter("id");
		System.out.println("id:"+id);
		String origin=mr.getOriginalFileName("file01");
		String filename=mr.getFilesystemName("file01");
		System.out.println("filename:"+origin+"-"+filename);
		
		req.setAttribute("origin", origin);
		req.setAttribute("rename", filename);
		
		RequestDispatcher rd;
		rd=req.getRequestDispatcher("down01.jsp");
		rd.forward(req, resp);
	}
}
