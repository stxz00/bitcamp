package com.bit.day14;

import java.io.File;

public class Ex05 {
	public static void main(String[] args) {
		String path = "test03";
		File file = new File(path);
		String[] chileds = file.list();
		try {
		for(int i = 0; i< chileds.length; i++) {
			File child = new File(path+"\\"+chileds[i]);
			child.delete();
			
		}
		}catch(NullPointerException e){}
		
		if(file.delete()) {
			System.out.println("삭제완료");
		}else {
			System.out.println("삭제할 대상이 존재하지 않습니다");
		}
		// 동일한 파일은 존재할 수 없음
		// 디렉토리나 파일이나 파일이니까 동일한 이름을 쓰게 되면 삭제할 때 어떤 것을 지워야할지 모름.
		// 근데 지울때 보면 폴더를 지움 이는 확장자의 차이점을 통한 것
		// 하위 디렉터리 또는 파일 test05가 이미 있다고 하면 지워지지 않음
		// test05 안에서 rmdir et01을 지우고 삭제하면 지워짐
		
		//정리하면 폴더 안의 파일들을 먼저 지우고 나서 폴더를 지우면 끝
		
	}
}
