package arr;

public class User {
	
	// 사용자의 데이터를 저장 : 이름, 아이디(숫자)
	// 손흥민(1), 박지성(2)
	
	int id;			// 사용자의 아이디
	String name;	// 사용자의 이름
	
	// 생성자 --> 생성자는 클래스와 이름이 동일해야함 !!
	User(int id, String name){
		this.id = id;
		this.name = name;
		
	}
	
	void showData() {
		System.out.println(name+"("+id+")");
	}
	
}