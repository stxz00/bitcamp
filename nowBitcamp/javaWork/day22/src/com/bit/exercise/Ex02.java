package com.bit.exercise;

import java.net.MalformedURLException;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		String spec = "https://shopping.naver.com/style/fashionbrand/stores/100060243/products/5265904503?NaPm=ci%3Dshoppingwindow%7Cct%3Ddummy%7Ctr%3Dswl%7Chk%3D66ce621a5bccd71b510821380b796d02c838ddd1%7Ctrx%3Di%3A5265904503#top"; 
		
		try {
			URL url = new URL(spec);
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getRef());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
