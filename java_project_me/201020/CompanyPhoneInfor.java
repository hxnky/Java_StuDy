package ver4.p;

public class CompanyPhoneInfor extends PhoneInfor {

	// 회사 이름
	private String company;
	
	// 생성자
	public CompanyPhoneInfor(String name, String phoneNum, String addr, String email, String company) {
		
		// 상위 클래스의 생성자 호출
		super(name, phoneNum, addr, email);
		
		// 회사 이름 초기화
		this.company = company;
		
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("회사 : " + company);
	}

	

}
