package com.bit.day20;

public class Ex14 extends Thread{
	
	public static void main(String[] args) {
		Ex14 me = new Ex14();
		me.setName("첫번째");
		Ex14 you = new Ex14();
		you.setName("두번째");
		
		Ex14 you2 = new Ex14();
		you2.setName("세번째");
		
	
		
		//계속 일을 했다는 보장이 없음.
		//랜덤하지 않아도 랜덤하게 보임 
		//일단 일을 하기 위해선 프로세스가 일을 하는 상황에서 두 개의 스레드를 나눠가지고 수행하고 me와 you가 서로 runnable과 running 를 바꿔가며 수행함
		
		//스케줄러는 랜덤하지 않고 정해진 판단에 따라 수행하지만 프로세스에 의하여 랜덤하게 되어버린 것
		
		//스레드는 완벽히 제어할 순  없지만 일부 제어는 가능하니 어느정도 랜덤하게 보이는 [[[확률]]]을 제어할 수 있다.
		// 그것은 작업시간을 늘려주는 것.(우선순위 등)
//		me.setPriority(1); //순위의 높낮이에 따라 달라짐, 반드시 첫번째로 수행되진 않음 오로지 확률적으로 제어되고 수행을 더 많이함
//		you.setPriority(10);
		me.setPriority(Thread.MIN_PRIORITY); //우선순위는 상대적일뿐 더 많이 선택받는 게 아님.
		you.setPriority(Thread.MAX_PRIORITY);
		you2.setPriority(Thread.NORM_PRIORITY); //디폴트 순위
		
		me.start();
		you.start();
		you2.start();
		
		System.out.println(me.getName() + "의 순위는 " + me.getPriority());
		System.out.println(you.getName() + "의 순위는 " + you.getPriority());
		System.out.println(you2.getName() + "의 순위는 " + you.getPriority());
	}
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(currentThread().getName() + i);
		}
	}
}
