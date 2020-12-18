package test;

public class BaseEnSpeaker extends Speaker {
	
	private int baseRate;
	
	public void setBaseRate(int base) {
		baseRate = base;
	}
	
	// 오버라이딩
	// --> 상속관계에서 상속받은 매서드를 >선언부는 동일하게 하고, 처리부를 재구성하는 것<
	@Override	// 어노테이션 : 자바의 키워드는 아니다. 주석도 아니다. 추가적인 의미 
	// 밑의 메서드가 오버라이딩 이라는 것을 알려준다.
	void showCurrentState() {	// 제어자는 default였으므로 private 빼고 다 가능!
		super.showCurrentState();
		System.out.println("베이스 크기 : " + baseRate);
	}



}
