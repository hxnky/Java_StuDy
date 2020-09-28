package algorithm;

import java.util.Scanner;

public class work6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 선언
		int x = 0;
		int y = 0;
		//숫자 입력
		System.out.print("x를 입력하세요 :");
		x = sc.nextInt();
		System.out.print("y를 입력하세요 :");
		y = sc.nextInt();
		int temp;
		//temp 함수를 사용하여 값 교환
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x ="+x+" y = "+y);
		
		
	}

}
