package mainClass;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		/*
		 * // 문제 1 int num = 120; if ( num>0 || (num%2) == 0) {
		 * System.out.println("양수이면서 짝수"); }
		 * 
		 * //문제 2 Scanner sc = new Scanner(System.in); int num = 0;
		 * 
		 * System.out.println("숫자를 입력하세요: "); num = sc.nextInt();
		 * 
		 * if (num < 0) { System.out.println("0 미만"); } else if (num >= 0 && num < 100)
		 * { System.out.println("0이상 100 미만"); } else if (num >= 100 && num < 200) {
		 * System.out.println("100이상 200 미만"); } else if (num >= 200 && num < 300) {
		 * System.out.println("200이상 300 미만"); } else { System.out.println("300 이상"); }
		 * 
		 * //문제3 int num1 = 50, num2 = 100; int big, diff;
		 * 
		 * if(num1>num2) { big = num1; diff = num1 - num2; } else { big = num2; diff =
		 * num2 - num1; } System.out.println("가장 큰 수: " +big + " 두 수의 차이: " +diff);
		 * 
		 * //문제 4 System.out.println("숫자를 입력하세요: "); int n = 0; n = sc.nextInt(); if(n
		 * == 1) { System.out.println("Simple Java"); }
		 * 
		 * else if(n == 2) { System.out.println("Funny Java"); } else if(n==3) {
		 * System.out.println("Fantastic Java"); } else {
		 * System.out.println("The best programming language"); }
		 * System.out.println("Do you like coffee?");
		 * 
		 * //문제 5
		 * 
		 * System.out.println("숫자를 입력하세요: "); num = sc.nextInt(); if(num < 0) {
		 * System.out.println("0미만"); } switch (num/100) { case 0:
		 * System.out.println("0이상 100미만"); break; case 1:
		 * System.out.println("100이상 200미만"); break; case 2:
		 * System.out.println("200이상 300 미만"); break; default:
		 * System.out.println("300이상");
		 * 
		 * }
		 * 
		 * 
		 * // 문제 6 int i = 0; int sum = 0; while(i<100) { sum += i; i++; }
		 * System.out.println(sum);
		 * 
		 * // 문제 7 int i = 0;
		 * 
		 * do { i++; System.out.println(i);
		 * 
		 * 
		 * }while(i<100);
		 * 
		 * 
		 * while(i>=1) { System.out.println(i); i--; }
		 * 
		 * 
		 * 		// 문제 8

		int i = 0;
		int sum = 0;
		while (i <= 1000) {
			if( i % 2 == 0 && i % 7 == 0) {
			System.out.println(i);
			sum += i;

			}
			i++;
		}

		System.out.println(sum);
			
		//문제 9 
		int result = 1;
		
		for(int i = 1; i <=10; i++) {
			result *= i;
		}
		
		System.out.println(result);
				
		//문제 10
		int sum = 0;
		for(int i = 1; i<=9;i++) {
			sum = 5*i;
			System.out.println(sum);
		}

		
		// 문제 11
		int num = 0;
		int count = 0;
		for(num = 1; num<100; num++)
		{
			if(num%5!=0||num%7!=0)
				continue;
			count++;
			System.out.println(num);
			}
		System.out.println("count : "+ count);
		
				//문제 12
		int i = 0;
		int sum = 0;
		while(true)
		{
			if(i%2!=0) {
				sum += i;
			}
			else if ( i % 3==0) {
				sum += i;
			}
			
			if(sum>1000) {
				System.out.println(sum);
				break;
			}
			i++;
		}
		
		// 문제 13
		
		
		for(int i = 2; i<=8; i*=2) {
			for(int j = 1; j < 10; j++) {
			System.out.println(i*j);
			if(i==j) 
				break;			
			}
		}
		
		
		 */

// 문제 15
		int n = 2;
		switch(n) {
		case 1:
			System.out.println("현재 인원은 1명 입니다.");
			break;
		case 2:
			System.out.println("현재 인원은 2명 입니다.");
			break;
		case 3:
			System.out.println("현재 인원은 3명 입니다.");
			break;
		if(n>3) {
			System.out.println("현재 많은 사람들이 있습니다.");
		
		}	
		}
	}
}
		


	


