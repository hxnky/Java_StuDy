package ver4;

public class PhoneCompanyInfor extends PhoneInfor {
	
	String company;
	
	public PhoneCompanyInfor(String name, String phoneNumber, String birthday, String address, String email, String company) {
		super(name, phoneNumber, birthday, address, email);
		this.company = company;
	}

	// 오버라이딩
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("회사 : " + company);
	}
}
