package project;

public class PhoneInfo_ver1 {
	
	String name;
	String phoneNumber;
	String birthday;
	
	void PhoneInfo(String name, String phoneNumber, String birthday) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	void PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	void showInfo(){
		if(birthday ==null) {
			System.out.println("*이름 : "+ name + "\n*전화번호 : "+ phoneNumber);
		}
		else {
		System.out.println("*이름 : "+ name + "\n*전화번호 : "+ phoneNumber + "\n*생년월일 : "+ birthday);
		}
	}
	
	
	
		

	

}
