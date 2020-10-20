package abstractTest;

public class PlayerMain {

	public static void main(String[] args) {
		
		// Player player = new player(); -> 추상클래스라서 인스턴스 생성 불가능
		// VideoPlayer player = new VideoPlayer(); -> 추상클래스를 상속받았기 때문에 인스턴스 생성 불가능
		AudioPlayer player = new AudioPlayer(); // 구현부를 만들었기 때문에 인스턴스 생성 가능
		
		
		

	}

}
