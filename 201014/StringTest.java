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
		
		// 문제 1 : 문자열 역순으로 출력하기
		str = "ABCDEFGHIJKLMN";
		int numOfStr = str.length();
		int index = numOfStr -1;		// 배열이나 문자열의 위치 index는 0~(N-1)
		
		String result = "";
		StringBuffer sb = new StringBuffer();		
		
		// String 클래스긔 chatAt() 메서드를 이용해서 역순으로 출력
		for(int i = index; i>=0; i--) {
			// result += str.charAt(i);		// result = result + String
			sb.append(str.charAt(i));
		}
		
		System.out.println(str);
		System.out.println(new String(sb));
		
		sb = new StringBuffer(str);			// "ABCDEFGHIJKLMN"
		System.out.println(new String(sb));
		sb = sb.reverse();
		System.out.println(new String(sb));
		
		// 문제 2: 문자열 부분 삭제하기
		str = "990929-1010123";
		sb = new StringBuffer();
		
		// String chatAt() 이용
		for(int i = 0 ; i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='0'&&c<='9') {
				sb.append(c);
			}
		}
		
		System.out.println(sb);
		
		//String replace()
		result = str.replace("-", "");
		System.out.println(result);
		System.out.println(sb.deleteCharAt(6));
		
		
		
	}

}
