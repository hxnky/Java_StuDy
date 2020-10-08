package project;

import java.util.Scanner;


public class PhoneInfo_ver2 {
	
	Scanner sc = new Scanner(System.in);
	String name;
	String phoneNumber;
	String birthday;
	
	void PhoneInfo(String name, String phoneNumber, String birthday) {
		System.out.printf("이름을 입력하세요 : ");
		name = sc.next();
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
