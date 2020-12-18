package test;

public class ExtendsTest {

	public static void main(String[] args) {
		Child c1 = new Child();
		Child2 c2 = new Child2("KING");
		GrandChild gc = new GrandChild("손흥민"); // Child2를 상속받았기 때문에 문자열 추가
		
		System.out.println(c1.getmoney());
		System.out.println(c2.getmoney());
		System.out.println(c2.name);
		System.out.println(gc.getmoney());
		System.out.println(gc.name);
	}

}
