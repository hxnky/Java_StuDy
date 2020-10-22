package ver4;

public class PhoneclubInfor extends PhoneInfor {

	String club;
	
	public PhoneclubInfor(String name, String phoneNumber, String birthday, String address, String email, String club) {
		super(name, phoneNumber, birthday,  address, email);
		this.club = club;
	}

	// 오버라이딩
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("동호회 : " + club);
	}
	
}
