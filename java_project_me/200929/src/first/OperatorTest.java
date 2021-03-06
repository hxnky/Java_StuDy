package first;

import java.lang.Math;
import java.util.Scanner;

public class OperatorTest {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 8;

		System.out.println("10/8 = " + num1 / num2); // 정수형이라서 소수점 표현 X
		System.out.println("10/8 = " + num1 % -8);
		System.out.println("10/8 = " + num1 % num2);
		System.out.println("10f/8f = " + 10f / 8f);
		System.out.println("10f/8 = " + 10f / 8); // float형으로 출력됨
		System.out.println("10/8 = " + num1 / (float) num2);
		System.out.println();
		System.out.println();

		char c1 = 'A';
		char c2 = 'B';

		System.out.println("'A' < 'B' => " + (c1 < c2)); // 65 < 66
		System.out.println("'0' == 0 => " + ('0' == 0)); // 48 == 0
		System.out.println("10.0d == 10.0f => " + (10.0d == 10.0f)); // 소수가 없으므로 10.0d == 10.0d
		System.out.println("0.1d == 0.1f => " + (0.1d == 0.1f)); // 소수가 있으므로 0.1d == 0.1f

		double d = (double) 0.1f;
		System.out.println("d => " + d); // byte수가 늘어난 만큼 다른 수가 채움
		System.out.println("(float)d == 0.1f => " + ((float) d == 0.1f)); // byte가 줄어서 숫자들이 잘림

		System.out.println();
		System.out.println();

		num1 = 10;
		num2 = 20;

		boolean result1 = num1 == 10 && num2 == 20;
		boolean result2 = num1 <= 12 || num2 >= 30;

		System.out.println("num1 == 10 && num2 == 20 => " + result1);
		;
		System.out.println("num1 <= 12 || num2 >= 30 => " + result2);

		if (!(num1 == num2)) {
			System.out.println("num1과 num2는 같지 않다.");
		} else {
			System.out.println("num1과 num2는 같다.");
		}

		System.out.println();
		System.out.println();

		float pi = 3.141592f;
		float sPi = (int) (pi * 100) / 100f;

		System.out.println(sPi);

		int price = 11234;
		int price2 = price / 1000 * 1000; // 100단위까지 절사

		System.out.println(price2);

		float sPi2 = Math.round(pi * 100);// Math.round 함수로 반올림
		System.out.println(sPi2);

		System.out.println();
		System.out.println();

		int i = 5, j = 0;

		System.out.println(i++); // 출력 : 5, i = 6
		System.out.println(++j); // 출력 : 6, j : 6
		System.out.println("i = " + i + ", j = " + j);

		System.out.println();
		System.out.println();

		// 문자열 처리 : String 클래스 이용 -> 객체 생성 -> 클래스가 가지는 변수와 메서드를 메모리에 로드
		// 참조 변수 : 객체의 메모리 주소값을 저장
		String str = null; // null -> 참조변수가 객체의 주소값을 저장하고 있지 않음

		str = "abc";// "" --> 공백 문자열을 이용한 객체를 생성하고 주소값을 반환
		System.out.println(str.toString());
		System.out.println(str.equals("abc"));// 문자열과 str이 갖고있는 값과 비교하여 T/F로 출력

		if (str != null && !str.equals("")) {
			System.out.println(str.charAt(1));// abc = 3-1 => 0, 1, 2번지까지 가능
		}


		num1 = 50;
		num2 = 20;

		int big = 0; // 큰 수
		int diff = 0;// 두 수의 차이

		// 삼항 연산자
		big = (num1 > num2) ? num1 : num2;// (조건)?참일 때: 거짓일 때 --? big = num1
		diff = num1 > num2 ? num1 - num2 : num2 - num1;

		System.out.printf("\n큰 수: %d", big);
		System.out.printf("\n큰 수와 작은수의 차이: %d", diff);

		// if문
		if (num1 > num2) {
			big = num1;
			diff = num1 - num2;
		} else {
			big = num2;
			diff = num2 - num1;
		}
	
		System.out.printf("\n\n큰 수: %d", big);
		System.out.printf("\n큰 수와 작은수의 차이: %d\n", diff);
		System.out.println();
				
		int n = 0;
		System.out.println("메뉴를 입력하세요\n1.입력 2.보기 3.수정  4.삭제");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();	

		
		switch (n) {
		case 1:
			System.out.println("입력 합니다.");
			System.out.println("Simple JAVA");
			break;
		case 2:
			System.out.println("데이터를 열람합니다.");
			System.out.println("Funny JAVA");
			break;
		case 3:
			System.out.println("정보를 수정합니다.");
			System.out.println("Fantastic JAVA");
			break;
		case 4:
			System.out.println("데이터를 삭제합니다.");
			break;
			/*
		default:
			System.out.println("Best JAVA");
			*/
		}
		
		
		
		
		

	}
}
