package ver4;

import java.util.Scanner;

public class PhoneBookManager {

	// 배열 : 전화번호 정보(이름, 전화번호, 생일)를 저장하는 목적
	final PhoneInfor[] phoneBook; // 정보 저장을 위한 배열 선언
	int cnt; // 저장된 정보의 개수 : 반복의 횟수, 배열에 새로운 데이터 입력 시 index

	// 초기화
	PhoneBookManager() {
		this(100);
	}

	public PhoneBookManager(int size) {
		phoneBook = new PhoneInfor[size];
		cnt = 0;
	}

	private void addFriendInfo(PhoneInfor p) {
		phoneBook[cnt++] = p;
	}

	// 기능 : 저장, 검색, 삭제

	// 저장 기능
	// 사용자로부터 데이터를 받아서 인스턴스 생성하고
	// 배열에 생성된 인스턴스의 참조값을 저장 : 저장 index == cnt, 저장 후에는 cnt++
	public void insertMember(char insertMenu) {
		System.out.println("친구의 정보 입력을 시작합니다.");

		// 이름 입력받기
		System.out.print("이름을 입력하세요 : ");
		String name = Util.sc.nextLine();
		// 전화번호 입력받기
		System.out.print("전화번호를 입력하세요 : ");
		String pNum = Util.sc.nextLine();
		// 생일 입력받기
		System.out.print("생일을 입력하세요 : ");
		String birthday = Util.sc.nextLine();

		// 주소 입력받기
		System.out.print("주소를 입력하세요 : ");
		String address = Util.sc.nextLine();

		// 이메일 입력받기
		System.out.print("이메일을 입력하세요 : ");
		String email = Util.sc.nextLine();
		
		// 일반 친구 정보 저장
		if(insertMenu == '1') {
			if (birthday != null && birthday.length() > 0) {
				addFriendInfo(new PhoneInfor(name, pNum, birthday, address, email));
			} else {
				addFriendInfo(new PhoneInfor(name, pNum, null, address, email));
			}
		}
		
		// 대학 친구 정보 저장
		if (insertMenu == '2') {
			System.out.println("전공을 입력하세요 : ");
			String major = Util.sc.nextLine();
			System.out.println("학년을 입력하세요 : ");
			String year = Util.sc.nextLine();

			if (birthday != null && birthday.length() > 0) {
				addFriendInfo(new PhoneUnivInfor(name, pNum, birthday, address, email, major, year));
			} else {
				addFriendInfo(new PhoneUnivInfor(name, pNum, null, address, email, major, year));
			}
			
		// 회사 친구 정보 저장
		} else if (insertMenu == '3') {
			System.out.println("회사를 입력하세요 : ");
			String company = Util.sc.nextLine();

			if (birthday != null && birthday.length() > 0) {
				addFriendInfo(new PhoneCompanyInfor(name, pNum, birthday, address, email, company));
			} else {
				addFriendInfo(new PhoneCompanyInfor(name, pNum, null, address, email, company));
			}
			
		// 동호회 친구 저장
		} else if(insertMenu == '4'){
			System.out.println("동호회를 입력하세요 : ");
			String club = Util.sc.nextLine();

			if (birthday != null && birthday.length() > 0) {
				addFriendInfo(new PhoneclubInfor(name, pNum, birthday, address, email, club));
			} else {
				addFriendInfo(new PhoneclubInfor(name, pNum, null, address, email, club));
			}
		}

	}

	// 정보 검색
	// 검색하고자하는 이름을 받고
	// 배열의 요소(참조 값 -> 인스턴스 참조) PhoneInfo_ver3.name 변수의 값과 검색 이름을 비교(동등 비교)
	// 해당 index를 찾을 수 있다.
	// 검색된 index로 정보 출력
	void searchMember() {

		if (cnt == 0) {
			System.out.println("저장된 데이터가 없습니다. 다시 메뉴로 이동합니다.");
			return;
		}

		// 찾고자하는 이름을 압력받는다.
		System.out.println("정보 검색을 시작합니다.");
		System.out.println("찾고자하는 이름을 입력해주세요 : ");
		String name = Util.sc.nextLine();

		// 이름으로 요소 index 검색
		int index = searchIndex(name);

		// int index = -1;

		// 검색 : index를 찾는다.
		for (int i = 0; i <= cnt; i++) {
			if (phoneBook[i].name.equals(name)) {
				index = i;
				break;
			}

		}
		if (index < 0) {
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		} else {
			// 정보 출력
			phoneBook[index].showInfo();
		}

	}

	// 이름 문자열을 받아서 배열의 정보와 비교하고
	// index를 찾아서 반환하는 메서드
	int searchIndex(String name) {
		int result = -1;

		// 검색
		for (int i = 0; i <= cnt; i++) {
			if (phoneBook[i].name.equals(name)) {
				result = i;
				break;
			}

		}

		return result;
	}

	// 정보 삭제
	// 삭제하고자 하는 이름을 사용자로부터 받는다.
	// 배열에서 찾은 index의 참조값을 삭제 : 인스턴스는 참조하는 참조변수가 없으면 삭제된다.
	// 참조값에 null을 입력하거나, 다른 주소값을 입력 -> 이전에 있던 참조값은 없어진다.
	// 삭제 대상의 index부터 왼쪽으로 값을 시프트 처리
	// cnt-1

	void deleteMember() {
		System.out.println("정보 삭제를 진행합니다.");
		System.out.println("삭제 하고자 하는 정보의 이름을 입력하세요. : ");
		String name = Util.sc.nextLine();

		int index = searchIndex(name);
	
		if (index < 0) {
			System.out.println("삭제하고자 하는 정보가 존재하지 않습니다.");
		} else {
			// 삭제 처리 : 삭제 해야하는 index부터 왼쪽으로 시프트 처리
			for (int i = index; i < cnt - 1; i++) {
				phoneBook[i] = phoneBook[i + 1];
			}

			cnt--;
			System.out.println("정보를 삭제하였습니다.");

		}
	}

	// 전체 정보 출력
	void dispalyAll() {
		if (cnt == 0) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}

		System.out.println("전체 정보를 출력합니다.(" + cnt + ")");
		System.out.println("----------------------");

		for (int i = 0; i < cnt; i++) {
			phoneBook[i].showInfo();
			System.out.println("----------------------");
		}

	}

}
