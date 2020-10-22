package ver3.my;

public class PhoneInfo_ver3 {

	String name;
	String phoneNumber;
	String birthday;

	public PhoneInfo_ver3() {

	}

	PhoneInfo_ver3(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	PhoneInfo_ver3(String name, String phoneNumber) {
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
