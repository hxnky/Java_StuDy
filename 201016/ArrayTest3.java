package Exam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest3 {

	// 문제 1.
	// 전달받은 1차원 배열에서 최소값을 추출해서 반환하는 메서드
	public static int miniValue(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}

	// 전달받은 1차원 배열에서 최대값을 추출해서 반환하는 메서드
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	// 문제2.
	public static void addOneDArr(int[][] arr, int add) {
		// 2차원 배열이 가지는 1차원 배열의 개수 만큼 반복		
		// 		각각의 1차원 배열을 반복 arr[0]
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = arr[i][j] + add;
			}
		}
	}

	// 문제 3
	public static void change(int[][] arr) {
		
		// 2차원 배열은 1차원 배열들을 요소로 갖는 배열이다.
		// 1차원 배열들의 위치를 변경 -> 2차원 배열이 가지는 1차원 배열의 주소값이 변경
		
		// 주소값의 변경을 위한 임시 배열을 선언, 생성
		int[] temp = new int[arr[arr.length-1].length];
		
		temp = arr[arr.length-1];	// 2차원 배열의 마지막 요소인 1차원 배열 temp에 저장
		for (int i = arr.length-1; i >0; i--) {
			arr[i]=arr[i-1];				
			}
		arr[0] = temp;
		}



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 문제 1
		int[] arr = new int[5];
		
		System.out.println("정수 다섯개를 입력하세요");
		for (int i = 0; i < arr.length; i++) {			
			System.out.println((i+1)+"번째 숫자 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("최대값은 : " + maxValue(arr));
		System.out.println("최소값은 : " + miniValue(arr));

		// 문제 2
		int[][] arr1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		addOneDArr(arr1, 5);
		System.out.println("============2차원 배열===========");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");				
			}
			System.out.println();
		}
		
		System.out.println("========문제 3==========");


		// 문제 3
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		change(arr2);
		// 2차원 배열 array를 출력합니다.
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println("");
		}

	}
}
