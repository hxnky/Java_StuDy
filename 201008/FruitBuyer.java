package fruit.ver02;


/*
	파일 이름 : FruitBuyer.java
	설명 : 구매자의 객체를 정의
	작성 일시 : 2020-10-08
	수정 내용 : fruit.FruitBuyer.java 를 기반으로 생성자를 추가 
 */


public class FruitBuyer {
	// 변수와 메서드 정의
	
	// 2020-10-08 수정 : 변수의 초기화 코드 생략
	// 구매자의 소유 금액, 소유한 사과의 개수
	int myMoney; // 구매자의 보유 금액
	int numOfApple; // 보유한 사과의 개수

	// 2020-10-08 수정 : 생성자 추가	
	
	public FruitBuyer() {
		this(5000, 0);
	}

	public FruitBuyer(int myMoney, int numOfApple) {
		this.myMoney = myMoney; // this.인스턴스변수 = 지역변수 // 혼자 쓸 수 있으면 지역변수
		this.numOfApple = numOfApple; // this --> 자신을 가르키는 참조변수
	}

	
	
	// 기능 : 사과 구매, 현재 상태 값을 출력(금액, 사과의 개수)
	// 사과를 구매
	// 		판매자 정보와 금액을 받아
	// 		판매자의 판매 메서드 호출 --> 구매하는 사과의 개수를 얻는다.
	// 		나의 사과의 개수를 증기
	// 		나의 보유 금액을 감소




	// 참조변수는 객체의 주소를 저장하고 있다. --> 셀러의 참조값을 받도록 참조 변수를 매개변수로 정의한다
	// FruitSelle seller --> FruitSeller 클래스로 만든 객체의주소를 저장하는 변수
	void buyApple(FruitSeller seller, int money) {

		// 구매할 사과의 개수를 구한다.
		int num = seller.saleApple(money);
		// 나의 사과 개수를 증가
		numOfApple += num;
		// 나의 보유 금액을 감소
		myMoney -= money;

	}
	

	// 현재 상태값을 출력(금액, 사과의 개수)
	void showBuyResult() {
		System.out.println("보유 금액 : " + myMoney);
		System.out.println("사과의 개수 : " + numOfApple);
	}
	

}
