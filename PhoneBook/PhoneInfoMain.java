package project;


import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
		PhoneInfo_ver3[] infor = new PhoneInfo_ver3[100];
		
		// 사용자에세 데이터를 받는다.
		Scanner s = new Scanner(System.in);
		
		System.out.println("메뉴를 고르세요");
		System.out.println("0. 종료\t1. 저장\t2. 검색\t3. 삭제");
		int menu = s.nextInt();	
		
		while(menu<=0||menu>3) {
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			System.out.println("0. 종료\t1. 저장\t2. 검색\t3. 삭제");
			menu = s.nextInt();		

			
		}
		
		switch(menu) {
		case 1:
			for(int i = 0; i<infor.length;i++) {
				// 인스턴스 생성을 위해서는 이름, 전화번호, 생일 데이터를 받는다
				System.out.println("이름을 입력해주세요.");
				String name = s.nextLine();
				
				System.out.println("전봐번호를 입력해주세요.");
				String phoneNumber = s.nextLine();
				
				System.out.println("생일을 입력해주세요.(Q 입력 시 종료)");
				String birthday = s.nextLine();		
				
				if(birthday.equals("Q")||birthday.equals("q")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				infor[i] = new PhoneInfo_ver3(name, phoneNumber, birthday);
				
			}
			
		case 2:
			for(int i = 0; i<infor.length;i++) {
		
			}
			
		case 3:
		
		// 인스턴스 생성
		
		/*
		// 입력값 없이 enter인경우 공백 문자열을 반환
		// 문자열의 길이가 0이면
		// length()==9 --> true
		if(birthday.trim().isEmpty()) {	// "	".trim() -> ""
			infor = new PhoneInfo_ver3(name, phoneNumber, null);
		}
		else {
			infor = new PhoneInfo_ver3(name, phoneNumber, birthday);
		}
		// 메서드 호출
		*/
		}

	}

}
