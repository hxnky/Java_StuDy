package ver4;

import java.util.Scanner;

public class PhoneBookMain {

	public static void main(String[] args) {

		// PhoneBooKManager 인스턴스 생성 : 배열과 메서드 사용
		PhoneBookManager manager = new PhoneBookManager();
		System.out.println("현재 저장된 정보의 개수 : " + manager.cnt);
		System.out.println("저장 가능한 정보의 개수 : " + manager.phoneBook.length);

		while (true) {

			System.out.println("=======전화번호 관리 프로그램=======");
			System.out.println("메뉴를 입력하세요");
			System.out.println("1. 일반 친구 정보 저장");
			System.out.println("2. 대학 친구 정보 저장");
			System.out.println("3. 회사 친구 정보 저장");
			System.out.println("4. 동호회 친구 정보 저장");
			System.out.println("5. 정보 검색");
			System.out.println("6. 정보 삭제");
			System.out.println("7. 전체 정보 보기");
			System.out.println("8. 프로그램 종료");
			char insertMenu = Util.sc.nextLine().charAt(0);

			switch (insertMenu) {
			// 정보 저장 기능 메서드 호출
			case '1': case '2': case '3': case '4':
				manager.insertMember(insertMenu);
				break;
			// 정보 검색 기능 메서드 호출
			case '5':
				manager.searchMember();
				break;
			// 정보 삭제 기능 메서드 호출
			case '6':
				manager.deleteMember();
				break;
			// 전체 정보 보기 기능 메서드 호출
			case '7':
				manager.dispalyAll();
				break;
			// 프로그램 종료 메서드 호출
			case '8':
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			}

		}

	}

}
