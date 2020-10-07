package Marble;

public class Boy {
	
	// 어린아이가 소유하고 있는 구슬의 개수 정보
	// 놀이를 통한 구슬을 주고받음 표현
	// 두 아이가 구슬치기를 하는 과정에서 구슬의 잃고 얻음 의미
	
	int numOfMarble;
	String name;
	
	// 어린이의 이름과 구슬의 개수를 설정하는 메서드
	void setBoy(String boyName, int num) {
		name = boyName;
		numOfMarble = num;
	}
	
	// 게임의 결과가 실패 --> 구슬의 개수를 감소
	void lose(int num) {
		numOfMarble -= num;
	}
	
	// 게임의 결과가 성공 --> 구슬의 개수를 증가
	void win(int num) {
		numOfMarble += num;
	}
	
	// 게임 후 승리 메서드 : 대상(boy), 구슬의 개수
	void playWin(Boy boy, int num) {
		// 나는 승리 --> 나의 구슬 개수 증가
		win(num);
		//상대방은 패배 --> 상대방 구슬 개수 감소
		boy.lose(num);
	}
	
	// 구슬의 개수를 출력하는 메서드
	void showData() {
		System.out.println(name +"의 구슬의 개수 : "+numOfMarble);
	}
	
	//main 메서드
	public static void main(String[] args) {
		Boy boy1 = new Boy();
		Boy boy2 = new Boy();
		
		boy1.setBoy("어린이1", 15);
		boy2.setBoy("어린이2", 9);
		
		boy1.playWin(boy2, 2);
		boy2.playWin(boy1, 7);
		
		boy1.showData();
		boy2.showData();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
