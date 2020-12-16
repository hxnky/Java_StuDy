package form;

import java.util.Arrays;

// Form에서 전송되는 데이터를 저장하는 beans 정의
public class FormData {

	// 속성 : 변수는 private
	private String name;		// 사용자의 이름
	private String job; 		// 사용자의 직업
	String[] interest;	// 사용자의 관심 사항, 여러개라서 배열로 받는다.
	
	// beans 
	public FormData() {
		
	}


	public FormData(String name, String job, String[] interest) {
		super();
		this.name = name;
		this.job = job;
		this.interest = interest;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String[] getInterest() {
		return interest;
	}


	public void setInterest(String[] interest) {
		this.interest = interest;
	}


	@Override
	public String toString() {
		return "FormData [name=" + name + ", job=" + job + ", interest=" + Arrays.toString(interest) + "]";
	}
	
	
}
