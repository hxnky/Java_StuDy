package member;

import java.util.ArrayList;
import java.util.List;

public class PersonInfo implements Util {
	private String name;
	private String password;
	private String PhoneNum;
	public int accountCurrent = -1; 
	private int money = 0;

	ArrayList<Member> list = new ArrayList<Member>();

	public void insert() {
		Member mb = new Member();
		System.out.println("이름을 입력하세요: ");
		mb.setName(SC.next());
		System.out.println("전화번호를 입력하세요: ");
		mb.setPhoneNum(SC.next());
		System.out.println("비밀번호를 입력하세요: ");
		mb.setPassword(SC.next());
		
		list.add(mb);
		
	}
	
	// 계좌관리 객체 생성하기
	public void findpassword() {
//		if (PersonInfo.size() == 0) {
//			System.out.println("입력한 정보가 없습니다.");
//			return;
//		}

		System.out.println("이름을 입력하세요: ");
		name = SC.nextLine();
		System.out.println("전화번호를 입력하세요: ");
		password = SC.nextLine();

		if (list.indexOf(name) == list.indexOf(PhoneNum)) {
			int index = list.indexOf(name);
			System.out.println(name + "님의 비밀번호는 " + list.get(index));
		} else {
			System.out.println("일치하는 정보가 없습니다. 다시 입력해주세요");
		}

	}

	public void deleteAccount() {

//		if (PersonInfo.size() == 0) {
//			System.out.println("입력한 정보가 없습니다.");
//			return;
//		}

		System.out.println("이름을 입력하세요: ");
		name = SC.nextLine();
		System.out.println("비밀번호를 입력하세요: ");
		password = SC.nextLine();
		int index = list.indexOf(password);
		if (list.indexOf(name) == list.indexOf(password)) {
			System.out.println("=======" + name + "님이 갖고 계신 계좌목록=======");
			// accountList 함수 오버라이딩
			System.out.println("총 계좌 잔고 : " + money);
			// totalAccount() 함수 오버라이딩
			// 계좌잔고 0일경우
			if (money == 0) {
				System.out.println("정말 탈퇴하시겠습니까? (Y/N)");
				String answer = SC.nextLine();
				if (answer == "Y" || answer == "y") {
					System.out.println("탈퇴되었습니다.");
					list.remove(index);
					// PersonInfo 다시 파일로 저장
				}
				else {
					System.out.println("삭제에 실패하였습니다.");
				}
			} else {
				System.out.println("계좌에 잔고가 존재합니다. 잔고를 비우고 다시 시도해주세요");
				return;
			}
		}

	}
	
	public void logout() {
	      accountCurrent = -1;
	      System.out.println("로그아웃 되었습니다");
	}
}