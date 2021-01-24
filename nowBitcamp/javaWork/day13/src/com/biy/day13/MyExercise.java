package com.biy.day13;

class Game{
	int su = 100;
}

class Dunfa extends Game{
	int su = 1000;
}

class Maple extends Game{
	int su = 500;
}

class Steam{
	
	static int play(TwoD<? extends Game> o) {
		// 여기서 그냥 <Game>만 쓰면 현재 TwoD에서 Game제한을 했는데 Game만 아예 못박은 상황이니 Game 하위클래스들은 올수가 없음.
		// 그래서 와일드카드로 하위클래스도 포함하여 올수가 있게 함
		// 또 이것도 가능함 static int play(TwoD<? extends Oject> o) {
		// TwoD에서 Game을 선언했으니까 이미 Game과 그 하위 클래스들을 불러올 수 있는 상황이니까 더 제한할 필요가 없으므로 Object로 선언해도 같다!	
		//그냥 TWoD의 제네릭대로 선언하고 싶을 때 그냥 쓰면 막히니까 ? extends Game이나 Object 쓴다고 생각하면 될듯
		int su = 50000;
		return su;
	}
	
	//위와 아래 메서드는 같다
	
	static <T extends Game> int play2(TwoD<T> o) {
		int su = 0;
		return su;
	}
	//선언부에 게임과 하위클래스를 선언했으니 같은 기능이나 마찬가지 뒤의 <T>는 별개로 들어가지만 <Object>랑 같으니 TwoD에서 이미 Game과 하위 클래스들을 제한을 둔 상황에서 객체니까 Game과 하위클래스 그냥 똑같은 말이 됨.
	//단 이전에 <T>Box<T>로 리턴 타입이 객체일 경우 그것은 상황에 따라 다르니 잘 생각해서 사용하기
	
	static <T extends Game> int play3(TwoD<? extends Game> o) {
		//파라미터에서 <T extends Game>을 선언하면 TwoD<Game>에서 Game이 못들어가는 문법적 오류가 생기므로 X
		int su = 0;
		return su;
	}
	
	static int play4(TwoD<?> o) {
		//<T>나 다를 바 없음
		int su = 0;
		return su;
	}
	
}

class TwoD<Game>{}

//class TowD<T extends Game>{} 도 됨 여기서는 같은 기능이지만 이 클래스 내부에서 명시할 때 T라고 짧게 못씀
//class TwoD2<? extends Game>{}
//처음부터 와일드카드가 안되는건 생각해보면 그냥 Game이나 T extends쓰면 되는데 굳이 그럴 필요가 없으니까 오류가 뜬 것(그래서 이를 메서드에서만 사용하는 것임)




public class MyExercise {
	public static void main(String[] args) {
		

		TwoD<Maple> m = new TwoD<Maple>();
		
		TwoD<Game> g = new TwoD<Game>();
		
		System.out.println(Steam.play(m));
		
		System.out.println(Steam.play(g)+1);
		
		System.out.println(Steam.play2(m));
		
		System.out.println(Steam.play2(g));
		
		System.out.println(Steam.play3(m));
		
		System.out.println(Steam.play3(g));
		
		
	}
}
