package protect;

import java.util.Scanner;

public class FriendInfoHandler {
	
	// 친구 정보를 저장하는 배열
	private Friend[] myFriends;
	private int numOfFriends;

	// 생성자로 초기화
	public FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
		
	}
	
	// 배열의 친구 정보를 저장하는 기능 : 다형성을 이용한 매개변수 정의
	private void addFriendInfo(Friend f) {
		myFriends[numOfFriends++] = f;
	}

	// 고교 친구 : 1, 대학 친구 : 2
	public void addFriend(int choice) {
		
		// 사용자로부터 기본 정보를 입력받자 : 이름, 전화번호, 주소
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구 정보의 입력을 시작합니다.");
		
		System.out.println("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.println("전화번호를 입력해주세요 : ");
		String phoneNum = sc.nextLine();
		
		System.out.println("주소를 입력해주세요 : ");
		String addr = sc.nextLine();
		
		// 인스턴스를 생성하여 저장
		// 인스턴스 생성 : 고교 친구와 대학 친구가 다르다	
		if(choice == 1){
			// 고교 친구 데이터 받고 -> 인스턴스 생성 -> 배열에 저장
			System.out.println("직업을 입력해주세요 : ");
			String work = sc.nextLine();
			
			// 배열에 저장
			addFriendInfo(new HighFriend(name, phoneNum, addr, work));
			}
		
		else {
			System.out.println("전공을 입력해주세요 : ");
			String major = sc.nextLine();
			
			// 대학 친구의 인스턴스를 배열에 저장
			addFriendInfo(new UnivFriend(name, phoneNum, addr, major));
		}
		System.out.println("입력 완료! \n");
	}
	
	// 전체 정보를 출력하는 메서드 : showData()
	public void showAllData() {
		System.out.println("======전체 데이터 출력======");
		for(int i = 0; i<numOfFriends; i++) {
			myFriends[i].showData();
			System.out.println("---------------------");
		}
	}
	
	// 전체 기본 정보를 출력하는 메서드 : showBasicInfo()
	public void showAllSimpleData() {
		System.out.println("======간단 데이터 출력======");
		for(int i = 0; i<numOfFriends; i++) {
			myFriends[i].showBasicInfo();
			System.out.println("---------------------");
		}
	}
		
		
}
