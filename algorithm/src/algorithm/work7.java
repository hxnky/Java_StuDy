package algorithm;

import java.util.Scanner;

public class work7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 변수 선언
		int n;
		//숫자 입력
		System.out.print("몇까지 더하시겠습니까? :");
		n = sc.nextInt();
		int sum=0;
		// i가 n이 될 때까지 sum에 i를 더함
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		System.out.println("1에서 "+n+"까지의 합 = "+ sum);

	}

}
