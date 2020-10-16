package test;

public class OverridingMain {

	public static void main(String[] args) {
		
		BaseEnSpeaker bs = new BaseEnSpeaker();
		
		bs.showCurrentState();	// 같은 이름의 메서드지만 상속받아 새로 재구성한 메서드가 호출된다.
		
		Speaker s = new Speaker();		
		
		s.showCurrentState();
		}

}
