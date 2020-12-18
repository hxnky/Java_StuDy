package protect;

public class HighFriend extends Friend {	// 고교 동창
	
	String work;	// 고교 동창의 직업

	HighFriend(String name, String phone, String addr, String work) {
		super(name, phone, addr);
		this.work = work;
	}
	
	@Override
	public void showData() {	// Friend f = new HighFriend() --> f.showData()
		super.showData();
		System.out.println("직업 : " + work);
	}
	
	@Override
	public void showBasicInfo() {
		System.out.println("이름 : " + getName());
		System.out.println("전화 : " + getPhoneNumber());
	}
	
}
