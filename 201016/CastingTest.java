package test;

public class CastingTest {

	public static void main(String[] args) {
		
		// 조상클래스 타입의 참조변수
		Car1 car = null;
		FireEngine fe = null;
		
		car = new FireEngine();
		fe = new FireEngine();
		
		// fe = new Car1(); --> 에러
		
		FireEngine fe2 = null;
		
		fe.water();
		
		// car = (Car1)fe; // Car1 = (Car1)FireEngine --> 자손에서 조상으로 형변환 이므로 형변환 생략 가능
		car = fe;
		
		//car.water(); --> 타입이 Car1이기 때문에 멤버가 아닌 water() 사용 불가
		
		fe2 = (FireEngine)car; // 조상타입(car)에서 자손타입(fe2)으로의 형변화는 명시적으로 연산자를 사용해야한다.
		
		fe2.water();
		
		car = new Ambulance();
		
		FireEngine f3 = null;
		
		if(car instanceof FireEngine) {
			f3 = (FireEngine)car;
			f3.water();
		}
		else {
			System.out.println("불을 끌 수 없어");
		}
	}

}


class Car1{		// public class는 하나만 있어야함	
	private String color;
	private int door;
	
	void drive() {
		System.out.println("운전한다.");
	}
	
	void stop() {
		System.out.println("멈춘다.");
	}
}

class FireEngine extends Car1{
	void water() {
		System.out.println("물을 뿌린다.");
	}
}

class Ambulance extends Car1{
	
}



