package card;

public class Card {

	String kind; // 카드의 종류
	int number; // 카드의 숫자

	Card(String kind, int number){
		this.kind = kind; // this.인스턴스 변수 = 지역변수
		this.number = number;
	}
	
	Card(){
		// 다른 생성자를 호출한다.
		// 오버로딩 되어있기 때문에 매개변수를 통해 어떤 생성자인지 구분
		this("spade",1);
	}
	
	// 클래스 변수 선언
	static int width = 100; // 카드의 너비
	static int height = 250; // 카드의 높이

	static void play() {
		System.out.println("카드 놀이를 합니다.");
	}

}
