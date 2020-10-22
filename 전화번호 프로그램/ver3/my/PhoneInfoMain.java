package ver3.my;


import java.util.Scanner;

public class PhoneInfoMain {

	public static void main(String[] args) {
		Manager infor = new Manager();	
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
			infor.save();
		break;
		case 2:
			infor.select();
		break;
		case 3:
			infor.delete();
		break;
		default:
			

		}

	}

}
