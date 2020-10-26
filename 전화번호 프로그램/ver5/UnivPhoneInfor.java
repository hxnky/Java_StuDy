package ver5;

public class UnivPhoneInfor extends PhoneInfor {

	// 대학 친구 : 전공, 학년
	private String major; // 전공
	private int grade; // 학년

	// 생성자 : 상위 클래스의 생성차 호출, 추가된 변수의 초기화
	public UnivPhoneInfor(String name, String phoneNum, String addr, String email, String major, int grade) {
		// 상위클래스의 생성자 호출 : 상위클래스의 멤버 변수 초기화
		super(name, phoneNum, addr, email);

		// 새로 추가된 멤버변수 초기화
		this.major = major;
		this.grade = grade;
	}

	// 새로 추가된 멤버 변수의 getter/setter
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public void showInfor() {
		super.showInfor();
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
	}

	@Override
	public void showBasicInfor() {
		super.showInfor();
	}

}
