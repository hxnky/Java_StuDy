package algorithm;

import java.util.Scanner;

public class work7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� ����
		int n;
		//���� �Է�
		System.out.print("����� ���Ͻðڽ��ϱ�? :");
		n = sc.nextInt();
		int sum=0;
		// i�� n�� �� ������ sum�� i�� ����
		for(int i = 1; i<=n; i++) {
			sum += i;
		}
		System.out.println("1���� "+n+"������ �� = "+ sum);

	}

}
