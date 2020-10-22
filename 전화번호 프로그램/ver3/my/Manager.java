package ver3.my;

import java.util.Scanner;

import ver3.PhoneInfor;

public class Manager {

	PhoneInfo_ver3[] infor = new PhoneInfo_ver3[100];
	Scanner s = new Scanner(System.in);
	
	void save() {
		for (int i = 0; i < infor.length; i++) {
			// 인스턴스 생성을 위해서는 이름, 전화번호, 생일 데이터를 받는다
			System.out.print("이름을 입력해주세요. : ");
			String name = s.nextLine();

			System.out.print("전봐번호를 입력해주세요. : ");
			String phoneNumber = s.nextLine();

			System.out.print("생일을 입력해주세요. : ");
			String birthday = s.nextLine();
			
			infor[i] = new PhoneInfo_ver3(name, phoneNumber, birthday);
			infor[i].showInfo();
			
			System.out.println("계속 저장하시겠습니까?(Y/N)");
			String answer = s.nextLine();

			if (answer.equals("N") || answer.equals("n")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	void select() {
		for (int i = 0; i < infor.length; i++) {

			System.out.print("검색할 정보의 이름을 입력하세요 : ");
			String n = s.next();

			if (infor[i].equals(n)) {
				infor[i].showInfo();
			} else {
				System.out.println("정보를 찾지 못했습니다.");
				break;
			}

		}
	}
	
	
	void delete() {
		for (int i = 0; i < infor.length; i++) {

			System.out.print("삭제할 정보의 이름을 입력하세요 : ");
			String n = s.next();

			if (n==(infor[i].name)) {
				infor[i].showInfo();
				System.out.println("정보를 삭제하시겠습니까?(Y/N)");
				String answer = s.nextLine();
				if (answer.equals("Y") || answer.equals("y")) {
					System.out.println("정보를 삭제하였습니다.");
					infor[i] = infor[i+1];
					break;
				}
				else if (answer.equals("N") || answer.equals("n")) {
					System.out.println("삭제할 정보의 이름을 입력하세요 : ");
					n = s.next();
				}
				
			} else {
				System.out.println("정보를 찾지 못했습니다.");
				break;
			}

		}
	}
	
}




