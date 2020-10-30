package member;

import java.util.List;

public class PersonInfoMain extends PersonInfo implements Util {

	public static void main(String[] args) {
		
		PersonInfo person = new PersonInfo();
//		List<PersonInfo> PersonInfo;
//		ArrayList<String> PersonInfo = new ArrayList<String>();
//		System.out.println("이름을 입력하세요: ");
//		String name = SC.nextLine();
//		
//		PersonInfo.add(name);
		
		person.insert();
		person.deleteAccount();
	}

}
