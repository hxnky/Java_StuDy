package protect;

public class Friend {
	String name;
	String phoneNum;
	String addr;
	
	// 생성자를 통해서 인스턴스 변수들을 초기화
	Friend(String name, String phone, String addr) {
		this.name = name;
		this.phoneNum = phone;
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNum;
	}
	
	public String getAddr() {
		return addr;
	}
	
	
	// 오버라이딩 처리 : 상속받은 클래스의 추가 속성을 출력
	public void showData() {
		System.out.println("이름 : " + name);
		System.out.println("전화 ㅣ " + phoneNum);
		System.out.println("주소 : " + addr);
	}
	
	// 오버라이딩 : 비어있는 처리부 기능을 추가
	public void showBasicInfo() {}
}
