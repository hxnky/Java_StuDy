package Exam;

public class Oper2 {
	public static void main(String[] args) {
		// 연산자 추가 문제
		// 문제 1
		System.out.println("문제 1 ============================");

		int x = 2;
		int y = 5;
		char c = 'A';

		System.out.println(y += 10 - x++); // 연산 순서 주의 // 13
		System.out.println(x += 2); // 5
		System.out.println(!('A' <= c && c <= 'Z')); // false
		System.out.println('C' - c); // 2
		System.out.println('5' - '0'); // 5
		System.out.println(c + 1); // int로 자동 형변환 // 66
		System.out.println(++c); // 단항 연산자의 경우 char형을 그대로 유지 // 증가 후 출력 == B
		System.out.println(c++); // 출력 후 증가 == B // c = 'C'
		System.out.println(c); // C

		// 문제2 --> 중요!
		System.out.println("문제 2 ============================");

		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		// 전제 사과를 10으로 나눈 몫이 바구니 개수
		// int numOdBucket = numOdApples/10;
		// 전제 사과를 10으로 나눈 나머지가 0보다 크면 바구니 개수 +1
		// if(numOfApples%10>0){
		// numOfBucket++;
		// }

		// 삼항연산자 사용
		int numOfBucket = numOfApples / 10 + ((numOfApples % 10 > 0) ? 1 : 0);
		// 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 : " + numOfBucket);

		// 문제3
		System.out.println("문제 3 ============================");

		int num = 10;

		// 삼항연산자 중첩하여 사용
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : 0));

		// 문제 4
		System.out.println("문제 4 ============================");

		num = 456;
		System.out.println(num / 100 * 100);

		// 문제 5
		System.out.println("문제 5 ============================");

		num = 333;
		System.out.println(num / 10 * 10 + 1);

		// 문제 6
		System.out.println("문제 6 ============================");

		num = 24;
		System.out.println(10 - (num % 10));
		System.out.println((num / 10 + 1) * 10 - num);

		// 문제 7
		System.out.println("문제 7 ============================");

		int fahrenheit = 100;
		float celcius = (int) ((5 / 9f * (fahrenheit - 32) * 100 + 0.5) / 100f);
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius : " + celcius);

		// 문제 8
		System.out.println("문제 8 ============================");

		byte a = 10;
		byte b = 20;
		int c1 = a + b; // byte 타입의 변수들은 계산 시 int 형으로 자동 형번환 //byte타입을 유지해야 할 경우 (byte)(a+b)
		char ch = 'A';
		ch = (char) (ch + 2); // 형변환 해주어야 함
		float f = 3 / 2f;
		long l = 3000 * 3000 * 3000l;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float) d == f2;

		System.out.println("c = " + c);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result = " + result);

		// 문제 9
		System.out.println("문제 9 ============================");

		char ch1 = 'z';
		boolean b1 = ('a' <= ch1 && ch1 <= 'z' || 'A' <= ch1 && ch1 <= 'Z' || '0' <= ch1 && ch1 <= '9');
		System.out.println(b1);

		// 문제 10
		System.out.println("문제 10 ============================");

		char ch2 = 'A';
		char lowerCase = (char)(('A' <= ch2 && ch2 <= 'Z') ? (ch2 + 32) : ch2);

		System.out.println("ch : "+ ch2);
		System.out.println("ch to lowerCase : " + lowerCase);

	}
}
