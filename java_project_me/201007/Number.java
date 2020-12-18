package card;

public class Number {

	
	int num;
	
	Number(int number){
		num = number;
		System.out.println("생성자가 실행되었습니다.");
	}
	
	// 오버로딩 : 생성자의 이름은 같지만 매개변수가 다르다.
	Number(){
		num = 10;
		System.out.println("생성자가 실행되었습니다.");
	}

	int getNumber() {
		return num;
	}
	
	
	
}
