package com.bit.xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmpEdit extends HttpServlet {
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPut...");
		//�ȵ� String id=req.getParameter("id");
		//�����͸� �൵ null
		//������Ʈget�Ķ���ʹ� Ÿ���� �ٰ� ����Ʈ�϶��� ����.
		//�������� �ȵ�
		InputStream is=req.getInputStream();
		InputStreamReader isr=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("param id:"+br.readLine()); 
		// get�� post��� �ܿ��� br.readLine()�� ©�� ����� ���ۿ� ����
		// br.readLine()������ ���ϴ� ������ �� �ƹ����Գ� �޾ƿ� �� �־
		// ���������� ����
		//���������� �ſ� �����Ƽ� �Ⱦ��� �� ����
	}
}
