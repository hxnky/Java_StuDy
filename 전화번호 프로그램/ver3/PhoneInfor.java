package ver3;

public class PhoneInfor {

	String name;
	String phoneNumber;
	String birthday;

	public PhoneInfor() {

	}

	PhoneInfor(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfor(String name, String phoneNumber) {
		this(name, phoneNumber, null);
	}

	void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);

		if (birthday.trim().isEmpty()) {
			System.out.println("생일 : 입력 데이터 없음");
		} else {
			System.out.println("생일 : " + birthday);
		}

	}
}
