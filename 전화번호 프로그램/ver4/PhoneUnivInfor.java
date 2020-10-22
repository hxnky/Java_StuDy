package ver4;

public class PhoneUnivInfor extends PhoneInfor {
	
	private String major;
	private String year;
	
	public PhoneUnivInfor(String name, String phoneNumber, String birthday, String address, String email, String major, String year) {
		super(name, phoneNumber, birthday, address, email);
		this.major = major;
		this.year = year;
		
	}
	
	// 오버라이딩
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);
		System.out.println("이메일 : " + email);
	}
	
}
