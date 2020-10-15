package test;

public class CarMain {
	public static void main(String[] args) {
		// 클래스멤버도 상속의 대상이다. 클래스멤버는 한번만 생성
		System.out.println(Car.name);
		System.out.println(HybridCar.name);
		System.out.println(HybridWaterCar.name);
		
		Car car1 =new Car(100);
		HybridCar car2 = new HybridCar(100, 100);
		HybridWaterCar car3 = new HybridWaterCar(100, 100, 100);
		
		car3.showCurrentGauge();
	}
}

	class Car {		
		static String name = "CAR";
		int gasolinegauge;
		
		
		Car(int gasolinegauge){
			this.gasolinegauge = gasolinegauge;
		}

	}

	class HybridCar extends Car {
		int electronicGauge;
		
		//HybridCar(){
		//	super();
		//}
		
		HybridCar(int gasolinegauge, int electronicGauge) {	// default 생성자가 없어 오류나므로 추가해준다.
			// 조상클래스의 멤버를 초기화하는 생성자 호출
			super(gasolinegauge);	// 상위클래스 초기화가 무조건 위에 와야함.
			// 새롭게 정의한 클래스의 멤버를 초기화
			this.electronicGauge = electronicGauge;
			
		}
	}

	class HybridWaterCar extends HybridCar {
		int waterGauge;

		// public HybridWaterCar() {
		//	 super();
		// }
		
		HybridWaterCar(int gasolinegauge, int electronicgauge, int watergauge) {
			super(gasolinegauge, electronicgauge);
		}
		
		public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolinegauge);
		System.out.println("잔여 가솔린 : " + electronicGauge);
		System.out.println("잔여 가솔린 : " + waterGauge);
		}
	}


