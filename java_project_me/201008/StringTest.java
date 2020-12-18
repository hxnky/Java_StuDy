package Exam;

public class StringTest {
	public static void main(String[] args) {
		
		String str1 = "My String";
		String str2 = "My String";	// str1과 str2는 같은 인스턴스를 참조
		String str3 = "Your String";
		String str4 = new String("My String");	// str1과 str4는 다른 인스턴스를 참조
												// 새로운 인스턴스를 만들어낸 것
		// 참조변수 값의 동등비교 : 같은 인스턴스를 참조하는지 확인
		if(str1 == str2) {
			System.out.println("같은 인스턴스를 참조");
		}
		else {
			System.out.println("다른 인스턴스를 참조");
		}
		
		if(str1 == str3) {
			System.out.println("같은 인스턴스를 참조");
		}
		else {
			System.out.println("다른 인스턴스를 참조");
		}
		
		if(str1 == str4) {
			System.out.println("같은 인스턴스를 참조");
		}
		else {
			System.out.println("다른 인스턴스를 참조");
		}
		
		
		System.out.println(str1.equals("str4"));
		
		StringBuffer strBuf = new StringBuffer();
		String str = "ABCDEFGHIJKLMN";
		strBuf.append(str);
		System.out.println(strBuf.reverse());
				
		String str5 = "990929-1010123";
		strBuf.delete(0, 14);
		strBuf.append(str5);
		System.out.println(strBuf.deleteCharAt(6));
	}

}
