package algorithm;

import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		//변수 선언
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z = 0;
		//숫자 입력받음
		System.out.print("첫번째 숫자를 입력하세요 :");
		x = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 :");
		y = sc.nextInt();
		//크기 판정
		if(x>y) {
			z = x - y;
		}
		else {
			z = y - x;
		}
		//결과 출력
		System.out.println("두 수의 차 = "+z);

	}

}
