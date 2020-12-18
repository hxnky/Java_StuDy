package algorithm;

import java.util.Scanner;

public class work8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//변수 선언
		int n=0;
		//숫자 입력
		System.out.print("몇까지 곱하시겠습니까? :");
		n = sc.nextInt();
		int sum = 0;
		//1부터 3씩 곱하여 sum에 더함
		for(int i=1;i<n; i++) {
			sum += (i*3);
		}
		System.out.println(n+"까지의 3의배수 합 = " + sum);

	}

}
