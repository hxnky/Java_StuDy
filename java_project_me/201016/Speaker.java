package test;

public class Speaker {

	private int volumeRate;		// 볼륨 크기
	
	// 현재 볼륨의 크기 출력
	void showCurrentState(){	// 다름 패키지에서도 사용하려면 앞에 public 붙이기!
		System.out.println("볼륨의 크기 : " + volumeRate);				
	}
	
	public void setVolume(int vol) {
		volumeRate = vol;
	}
	
	
	
	
	
	
	
	
}
