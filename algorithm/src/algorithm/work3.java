package algorithm;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 변수 선언
		int x = 0, y = 0;
		//숫자 입력 
		System.out.print("x를 입력하세요 :");
		x = sc.nextInt();
		System.out.print("y를 입력하세요 :");
		y = sc.nextInt();
		//크기 판정
		if(x>y) {
			System.out.println("x가 더 큽니다.");
		}
		else if (x<y) {
			System.out.println("y가 더 큽니다.");
		}
	}

}
