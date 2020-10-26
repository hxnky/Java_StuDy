package ver6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import ver4.Util;

public class PhoneBookManager implements Util {

	// 전화번호 정보를 저장할 배열을 가지고,
	// 배열을 이용한 정보의 저장, 삭제, 출력을 하는 기능

	// 컬렉션 : 객체 저장(참조 변수들을 저장 = 참조값 저장)
	// ArrayList<T> -> T는 제네릭 타입 : 자료형을 안전하게 처리하고 다양한 자료형이 사용됨
	// collection<E> -> List<E>(순서O, 중복O) -> ArrayList<E>/Set<E>(순서X, 중복X)
	// Map<k, v> -> HashMap<k,v>

	// 리스트 선언 : ArrayList<T> 컬렉션을 이용
	List<PhoneInfor> pBook;

	// 생성자 : 싱글톤 처리 -> 외부에서 인스턴스 생성을 금지
	private PhoneBookManager(int num) {
		// List<PhoneInfor> 초기화
		pBook = new ArrayList<PhoneInfor>();
	}

	// 내부에서 인스턴스 생성
	private static PhoneBookManager manager = new PhoneBookManager(100);

	// 외부에서 참조변수를 받을 수 있는 메서드
	public static PhoneBookManager getInstance() {
		return manager;
	}

	// 정보 저장
	// 1. 배열에 저장하는 메서드 -> 다형성을 이용하여 하나의 메서드로 정의 addInfor(상위클래스타입의 매개변수)
	// 2. 사용자에게 받은 데이터를 인스턴스로 생성 메서드
	// 입력의 구분 -> 구분에 따라 인스턴스 생성도 구분 -> addInfor() 메서드를 이용하여 정보 저장

	// 리스트에 친구 전화번호 정보를 저장하는 메서드
	private void addInfor(PhoneInfor info) {
		// List에 정보 저장
		pBook.add(info);
	}

	// 전화번호 정보를 인스턴스 생성하고 배열에 저장
	public void insertInfo() {

		// 100개 입력 == 0<=index<=99, cnt = 100
		// pBook[100] -> 오류 발생 == index는 99까지만 있으니까

		// 리스트의 개수와 입력된 요소의 개수를 비교
		// List는 저장공간이 부족하면 저장공간을 확장
		int select = 0;
		
		while (true) {
			System.out.println("어떤 정보를 입력하시겠습니까?");
			// System.out.println(Menu.BASIC+". 기본"); // 인스턴스 생성 불가
			System.out.println(Menu.UNIV + ". 대학");
			System.out.println(Menu.COMPANY + ". 회사");
			System.out.println(Menu.CAFE + ". 동호회");

			
			try {
				select = SC.nextInt();

				SC.nextLine();

				if (!(select > 0 && select < 4)) {
					BadInputException e = new BadInputException(String.valueOf(select));
					throw e;
				}
			} catch (InputMismatchException | BadInputException e) {
				System.out.println("잘못된 메뉴 입력입니다. 다시 선택해주세요");
				SC.nextLine();
				continue;
			}
			
			break;
		}
		
		SC.nextLine();
		
		System.out.println("정보 입력을 시작합니다.");
		System.out.println("이름 : ");
		String name = SC.nextLine();
		System.out.println("전화번호 : ");
		String pNum = SC.nextLine();
		System.out.println("주소 : ");
		String addr = SC.nextLine();
		System.out.println("이메일 : ");
		String email = SC.nextLine();
		 
		
		switch (select) {
//		case Menu.BASIC:
//			// 인스턴스 생성 -> 배열에 저장
//			addInfor(new PhoneInfor(name, pNum, addr, email));
//			break;
		case Menu.UNIV:
			// 추가 정보를 입력 -> 인스턴스 생성 -> 배열에 저장
			// 전공, 학년
			System.out.println("전공 : ");
			String major = SC.nextLine();
			System.out.println("학년 : ");
			int grade = SC.nextInt();

			addInfor(new UnivPhoneInfor(name, pNum, addr, email, major, grade));
			break;
		case Menu.COMPANY:
			// 추가 정보를 입력 -> 인스턴스 생성 -> 배열에 저장
			// 회사 이름
			System.out.println("회사 : ");
			String company = SC.nextLine();

			addInfor(new CompanyPhoneInfor(name, pNum, addr, email, company));
			break;
		case Menu.CAFE:
			// 추가 정보를 입력 -> 인스턴스 생성 -> 배열에 저장
			// 동호회, 닉네임
			System.out.println("동호회 : ");
			String cafeName = SC.nextLine();
			System.out.println("닉네임 : ");
			String nickName = SC.nextLine();

			addInfor(new CafePhoneInfor(nickName, pNum, addr, email, cafeName, nickName));
			break;
		}
		System.out.println("입력하신 정보가 저장되었습니다. (저장 개수 : " + pBook.size() + "개)");
	}

	// 정보 검색
	// 리스트의 index를 찾는 메서드
	private int searchIndex(String name) {
		int index = -1; // 정보가 없을 때
		for (int i = 0; i < pBook.size(); i++) {
			// 이름으로 비교
			// pBook.get(i) 의 요소 참조
			if (pBook.get(i).getName().equals(name)) {
				index = i;
			}
		}
		return index;
	}

	// 해당 index의 참조변수로 정보 출력 : 사용자가 입력한 이름으로 검색
	public void searchInfor() {
		if (pBook.size() == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}

		System.out.println("검색하실 이름을 입력해주세요 : ");
		String name = SC.nextLine();

		int index = searchIndex(name);

		if (index < 0) {
			System.out.println("입력하신 " + name + "님의 정보가 존재하지 않습니다.");
			System.out.println("메뉴로 돌아갑니다.");
			return;
		} else {
			System.out.println("=========검색 결과==========");
			pBook.get(index).showInfor();
		}
	}

	// 사용자에게 이름을 입력받고 이름으로 검색한 후 정보 삭제
	public void delete() {

		if (pBook.size() == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}

		SC.nextLine();

		System.out.println("삭제하고자 하는 정보의 이름을 입력해주세요 : ");
		String name = SC.nextLine();

		int index = searchIndex(name);

		if (index < 0) {
			System.out.println("입력하신 " + name + "님의 정보가 존재하지 않습니다.");
			System.out.println("메뉴로 이동합니다.");
		} else {
			// List의 요소 삭제는 인덱스의 시프트로 이루어진다.
			pBook.remove(index);
			System.out.println("요청하신 이름의 정보를 삭제했습니다.");
		}
	}

	// 전체 정보를 출력하는 메서드
	public void showAllInfor() {

		if (pBook.size() == 0) {
			System.out.println("입력된 정보가 없습니다.");
			return;
		}

		System.out.println("============전체 정보 출력==============");
		for (int i = 0; i < pBook.size(); i++) {
			pBook.get(i).showInfor();
			System.out.println("----------------------------------");
		}

	}

}
