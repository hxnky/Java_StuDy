package protect;

public class UnivFriend extends Friend {	// 대학 동기

	private String major;		// 전공학과
	
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;		
	}
	
	// 오버라이딩
	@Override
	public void showData() {
		super.showData();
		System.out.println("전공 : " + major);
	}

	// 오버라이딩
	@Override
	public void showBasicInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("전화 : " + getPhoneNumber());
		System.out.println("전공 : " + major);
	}
	
	
}
