package ver6;

public class CafePhoneInfor extends PhoneInfor {

	// 동호회 이름, 닉네임
	private String cafeName;
	private String nickName;

	// 생성자
	public CafePhoneInfor(String name, String phoneNum, String addr, String email, String cafeName, String nickName) {
		// 상위클래스의 생성자 호출
		super(name, phoneNum, addr, email);
		// 새로운 멤버 변수 초기화
		this.cafeName = cafeName;
		this.nickName = nickName;
	}

	public String getCafe() {
		return cafeName;
	}

	public void setCafe(String cafe) {
		this.cafeName = cafe;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("동호회 : " + cafeName);
		System.out.println("닉네임 : " + nickName);
	}

	@Override
	public void showBasicInfor() {
		super.showInfor();
	}

}
