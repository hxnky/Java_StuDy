package algorithm;

import java.util.Scanner;

public class work1 {

	public static void main(String[] args) {
		//���� ����
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		int z = 0;
		//���� �Է¹���
		System.out.print("ù��° ���ڸ� �Է��ϼ��� :");
		x = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� :");
		y = sc.nextInt();
		//ũ�� ����
		if(x>y) {
			z = x - y;
		}
		else {
			z = y - x;
		}
		//��� ���
		System.out.println("�� ���� �� = "+z);

	}

}
