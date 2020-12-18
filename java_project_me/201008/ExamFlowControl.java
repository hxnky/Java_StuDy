package work;

import java.util.Scanner;

public class ExamFlowControl {
	public static void main(String[] args) {

		// 문제 1
		System.out.println("문제 1");

		int num = 120;
		if (num > 0 && num % 2 == 0) {
			System.out.println("양수이면서 짝수");
		}

		// 문제 2
		System.out.println("\n문제 2");

		if (num < 0) {
			System.out.println("0 미만");
		} else if (num >= 0 && num < 100) {
			System.out.println("0이상 100 미만");
		} else if (num >= 100 && num < 200) {
			System.out.println("100 이상 200 미만");
		} else if (num >= 200 && num < 300) {
			System.out.println("200이상 300미만");
		} else if (num >= 300) {
			System.out.println("300 이상");
		}

		// 문제 3
		// 삼항연산자 사용이 더 가독성이 좋다.
		System.out.println("\n문제 3");

		int num1 = 50, num2 = 100;
		int big, diff;

		// big = (num1>num2)? num1:num2;
		if (num1 > num2) {
			big = num1;
		} else {
			big = num2;
		}

		System.out.println(big);

		// diff = (num1>num2)? num1-num2: num2-num1;
		if (num1 > num2) {
			diff = num1 - num2;
		} else {
			diff = num2 - num1;
		}
		System.out.println(diff);

		// 문제 4
		System.out.println("\n문제 4");

		int n = 3;

		if (n == 1) {
			System.out.println("Simple Java");
		} else if (n == 2) {
			System.out.println("Funny Java");
		} else if (n == 3) {
			System.out.println("Fantastic Java");
		} else {
			System.out.println("The best programming language");
		}
		System.out.println("Do you like coffee?");

		// 문제 5
		System.out.println("\n문제 5");

		if (num < 0) {
			System.out.println("0 미만");
		} else {
			switch (num / 100) {
			case 0:
				System.out.println("0 이상 100 미만");
				break;
			case 1:
				System.out.println("100 이상 200 미만");
				break;
			case 2:
				System.out.println("200 이상 300 미만");
				break;
			default:
				System.out.println("300 이상");

			}
		}

		// 문제 6
		System.out.println("\n문제 6");

		int i = 0;
		int sum = 0;

		while (i < 100) {
			sum += i;
			i++;
		}
		System.out.println("1부터 99까지의 합 : " + sum);

		// 문제 7
		System.out.println("\n문제 7");

		int cnt = 0;

		while (cnt <= 100) {
			System.out.println(cnt++);
		}
		// do whlie은 별로 안쓰인다.
		do {
			cnt--;
			System.out.println(cnt);
		} while (cnt > 1);

		// 문제 8
		System.out.println("\n문제 8");

		i = 1;
		sum = 0;
		int count = 0;

		while (i <= 1000) {
			if (i % 2 == 0 && i % 7 == 0) {
				// System.out.println(i);
				count++;
				sum += i;
			}
			i++;
		}

		System.out.println("1000 이하의 자연수 중 14의 배수들의 개수 : " + count);
		System.out.println("1000 이하의 자연수 중 14의 배수들의 합 : " + sum);

		// 문제 9
		System.out.println("\n문제 9");

		int result = 1; // 곱하기 연산이니까 1로 초기화 해준다.

		for (i = 1; i <= 10; i++) {
			result = result * i; // result *= i;

		}

		System.out.println("1 ~ 10 까지 곱한 값 : " + result);
/*
		// 문제 10
		System.out.println("\n문제 10");

		Scanner sc = new Scanner(System.in);

		System.out.printf("2 ~ 9 사이의 숫자를 입력해주세요 : ");
		int select = sc.nextInt();

		while (select < 2 || select > 9) {
			System.out.printf("숫자를 다시 입력해주세요 : ");
			select = sc.nextInt();

		}

		for (i = 1; i < 10; i++) {
			System.out.println(select + "X" + i + "= " + select * i);
		}
*/
		// 문제 11
		System.out.println("\n문제 11 : 1 ~ 100 사이의 35 배수 구하기");

		num = 0;
		count = 0;
		for (num = 0; num < 100; num++) {
			if (num % 5 != 0 || num % 7 != 0)
				continue;
			count++;
			System.out.println(num);
		}

		System.out.println("count : " + count);

		// 문제 12
		System.out.println("\n문제 12");

		num = 1;
		sum = 0;

		while (true) {

			if (num % 2 != 0 || (num % 3 == 0 && num % 2 == 0)) {
				sum += num;

				if (sum > 1000) {
					System.out.println(num+"을 더하면");
					System.out.println("최초로 합이 1000이 넘어가는 합은 : " + sum);
					break;
				}
			}
			num++;
		}

		// 문제 13
		System.out.println("\n문제 13 - 구구단 출력");
		
		// 단 
		for(i = 2; i < 10; i*=2) {
			System.out.println(i+"단");
			for(int j = 1; j < i+1; j++) {				
				System.out.println(i+"X"+j+"="+i*j);
			
			}
		}
		
		// 문제 14
		System.out.println("\n문제 14");
		
		System.out.println("  A  B");
		System.out.println("+ B  A");
		System.out.println("-------");
		System.out.println("  9  9");
		System.out.println("위의 조건이 성립하는 조합은 아래와 같습니다.");
		
		for(n = 0; n < 10; n++) {	// a+b=9 --> a=9-b
			int a, b;
			a = n;
			b = 9-n;
			System.out.println("A = " + a + ", B = " + b +"입니다.");
		}
		
		// 문제 15
		System.out.println("\n문제 15");
		
		n = 2;
		if(n==1) {
			System.out.println("현재 인원은 1명 입니다.");
		}
		else if(n==2) {
			System.out.println("현재 인원은 2명 입니다.");
		}
		else if(n==3) {
			System.out.println("현재 인원은 3명 입니다.");
		}
		else if(n>3) {
			System.out.println("현재 많은 사람들이 있습니다.");
		}
	}
}
