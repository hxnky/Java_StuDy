package algorithm;

import java.util.Scanner;

public class work8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� ����
		int n=0;
		//���� �Է�
		System.out.print("����� ���Ͻðڽ��ϱ�? :");
		n = sc.nextInt();
		int sum = 0;
		//1���� 3�� ���Ͽ� sum�� ����
		for(int i=1;i<n; i++) {
			sum += (i*3);
		}
		System.out.println(n+"������ 3�ǹ�� �� = " + sum);

	}

}
