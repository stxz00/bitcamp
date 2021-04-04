package com.bit.sts07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import jdk.internal.jline.internal.Log;

@Controller
public class HomeController {
	String path="C:\\Users\\stxz\\Desktop\\bitcamp\\nowBitcamp\\stsWorkspace\\upload\\";
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("upload from page...");
		return "home";
	}
	
	@RequestMapping(value="/upload",method = RequestMethod.POST)
	public String updload(MultipartFile file, Model model,String msg){
		// originalName, reName
		logger.debug(msg);
		logger.debug(file.getName()); //파라미터 네임. 기본 파일 네임은 오리지널파일네임(확장자까지 포함해서 가져옴)
		logger.debug(file.getContentType());
		String fname=System.currentTimeMillis()+"@"+file.getOriginalFilename();
		File result=new File("C:\\Users\\stxz\\Desktop\\bitcamp\\nowBitcamp\\stsWorkspace\\upload\\"+fname);
		result.exists();
		//스프링이 io제공
		try {
			file.transferTo(result);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("origin", file.getOriginalFilename());
		model.addAttribute("reName",fname);
		return "down";
	}
	
	@RequestMapping("/down")
	public void down(String rename,HttpServletResponse res) {
		logger.debug(rename);
		File file=new File(path+rename);
		String filename=rename.substring(rename.indexOf("@")+1);			
		res.setContentType("application.octet-stream");
		res.setHeader("Content-Disposition", "attachment; filename=\""+filename+"\"");
		try(OutputStream os=res.getOutputStream();
			InputStream is=new FileInputStream(file);
		){
			int su=-1;
			while((su=is.read())!=-1) {
				os.write(su);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/down/{rename:.+}") //저렇게  :.+으로  .을 포함해달라고 하면 확장자까지 받을 수 있다. 기존은 확장자없음
	public void down2(@PathVariable("rename") String rename,HttpServletResponse res) {
		logger.debug(rename);
		File file=new File(path+rename);
		res.setContentType("application.octet-stream");
		res.setHeader("Content-Disposition", "attachment; filename=\""+rename.substring(rename.indexOf('@')+1)+"\"");
		try(InputStream is=new FileInputStream(file);
			OutputStream os= res.getOutputStream();
		){
			int su=-1;
			while((su=is.read())!=-1){
				os.write(su);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
