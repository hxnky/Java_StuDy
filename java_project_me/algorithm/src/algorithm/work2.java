package algorithm;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 선언
		int x = 0;
		//숫자 입력받기
		System.out.print("x를 입력하세요 :");
		x = sc.nextInt();

		//2로 나누어 나머지가 0이면 짝수로 출력
		if(x%2 == 0) {
			System.out.println(x+"는 짝수입니다.");
		}
		else{
			System.out.println(x+"는 홀수입니다.");
		}

	}

}
