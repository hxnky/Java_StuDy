package first;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {

		//문제 2
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.println("숫자를 입력하세요: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("0 미만");
		} else if (num >= 0 && num < 100) {
			System.out.println("0이상 100 미만");
		} else if (num >= 100 && num < 200) {
			System.out.println("100이상 200 미만");
		} else if (num >= 200 && num < 300) {
			System.out.println("200이상 300 미만");
		} else {
			System.out.println("300 이상");
		}
		
		//문제3
		int num1 = 50, num2 = 100;
		int big, diff;
		
		if(num1>num2) {
			big = num1;
			diff = num1 - num2;
		}
		else {
			big = num2;
			diff = num2 - num1;
		}
		System.out.println("가장 큰 수: " +big + " 두 수의 차이: " +diff);
		
		//문제 4
		System.out.println("숫자를 입력하세요: ");
		int n = 0;
		n = sc.nextInt();
		if(n == 1) {
			System.out.println("Simple Java");
		}
	
		else if(n == 2) {
			System.out.println("Funny Java");
		}
		else if(n==3) {
			System.out.println("Fantastic Java");
		}
		else {
			System.out.println("The best programming language");
		}	
		System.out.println("Do you like coffee?");
		
		//문제 5
	
		System.out.println("숫자를 입력하세요: ");
		num = sc.nextInt();
		if(num < 0) {
			System.out.println("0미만");
		}
		switch (num/100) {
		case 0:
			System.out.println("0이상 100미만");
			break;
		case 1:
			System.out.println("100이상 200미만");
			break;
		case 2:
			System.out.println("200이상 300 미만");
			break;
		default:
			System.out.println("300이상");

		}
		
		
		
		
		
		
		
		
		
		
	}

}
