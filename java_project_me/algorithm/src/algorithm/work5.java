package algorithm;

import java.util.Scanner;

public class work5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�迭 �Է¹���
		int array[] = new int[5];
		for(int i = 0; i < array.length;i++) {
		System.out.print("���� 5���� �Է��ϼ��� : ");
		array[i] = sc.nextInt();
		}

		int max = array[0];
		//�迭�� ���Ͽ� �� ū ���� max�� ����
		for(int i = 0; i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		
		System.out.println("�ִ밪�� "+max + "�Դϴ�.");

		
		
		
		
	}
}
