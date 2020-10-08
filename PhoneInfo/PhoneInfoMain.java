package project;

public class PhoneInfoMain {

	public static void main(String[] args) {
		
		PhoneInfo_ver1 phone =  new PhoneInfo_ver1();
		PhoneInfo_ver1 phone2 = new PhoneInfo_ver1()
;		
		phone.PhoneInfo("고한경", "01000000000", "981026");
		phone2.PhoneInfo("한경", "01011111111");

		phone.showInfo();
		phone2.showInfo();
		
		
		
	}

}
