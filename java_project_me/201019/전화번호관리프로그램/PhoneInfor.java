package ver4;

public class PhoneInfor {

	String name;
	String phoneNumber;
	String birthday;
	String address;
	String email;

	public PhoneInfor() {

	}

	PhoneInfor(String name, String phoneNumber, String birthday, String address, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
		this.address = address;
		this.email = email;
	}

	PhoneInfor(String name, String phoneNumber, String address, String email) {
		this(name, phoneNumber, null, address, email);
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("주소 : " + address);
		System.out.println("이메일 : " + email);

		if (birthday==null) {
			System.out.println("생일 : 입력 데이터 없음");
		} else {
			System.out.println("생일 : " + birthday);
		}

	}
}
