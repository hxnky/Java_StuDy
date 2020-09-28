package algorithm;

import java.util.Scanner;

public class work4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 선언
		int x = 0;
		int y = 0;
		int z = 0;
		//숫자 입력
		System.out.print("x를 입력하세요 :");
		x = sc.nextInt();
		System.out.print("y를 입력하세요 :");
		y = sc.nextInt();
		System.out.print("z를 입력하세요 :");
		z = sc.nextInt();
		//세 수의 크기 비교하여 나머지 두 수보다 크면 출력
		if(x>y && x>z) {
			System.out.println("x가 가장큽니다.");
			}
		else if (y>z && y>x) {
			System.out.println("y가 가장큽니다.");
			}
		else if (z>x && z>y) {
			System.out.println("z가 가장큽니다.");
			}	
		
		
		
	}
}
