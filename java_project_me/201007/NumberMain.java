package card;

public class NumberMain {

	public static void main(String[] args) {
		
		Number number = new Number(100); // 1) 인스턴스 생성 후 2) Number 호출
		
		Number number2 = new Number();
		
		System.out.println(number.getNumber()); 
		System.out.println(number2.getNumber()); 
		
		
		
	}

}
