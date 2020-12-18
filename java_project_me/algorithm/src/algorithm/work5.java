package algorithm;

import java.util.Scanner;

public class work5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열 입력받음
		int array[] = new int[5];
		for(int i = 0; i < array.length;i++) {
		System.out.print("숫자 5개를 입력하세요 : ");
		array[i] = sc.nextInt();
		}

		int max = array[0];
		//배열을 비교하여 더 큰 수를 max에 저장
		for(int i = 0; i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		
		System.out.println("최대값은 "+max + "입니다.");

		
		
		
		
	}
}
