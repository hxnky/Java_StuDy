package algorithm;

import java.util.Scanner;

public class work2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� ����
		int x = 0;
		//���� �Է¹ޱ�
		System.out.print("x�� �Է��ϼ��� :");
		x = sc.nextInt();

		//2�� ������ �������� 0�̸� ¦���� ���
		if(x%2 == 0) {
			System.out.println(x+"�� ¦���Դϴ�.");
		}
		else{
			System.out.println(x+"�� Ȧ���Դϴ�.");
		}

	}

}
