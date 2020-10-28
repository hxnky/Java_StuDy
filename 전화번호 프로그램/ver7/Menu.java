package ver7;

public interface Menu {

	// public static final 생략
	// 입력시 사용 메뉴
	int UNIV = 1;
	int COMPANY = 2;
	int CAFE = 3;
	
	int INSERT = 1;
	int SEARCH = 2;
	int DEL = 3;
	int SHOW_ALL = 4;
	// 2020.10.28 : 인스턴스를 저장하는 메뉴 추가
	int SAVE = 5;
	int EXIT = 6;

}
