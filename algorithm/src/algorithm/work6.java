package algorithm;

import java.util.Scanner;

public class work6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� ����
		int x = 0;
		int y = 0;
		//���� �Է�
		System.out.print("x�� �Է��ϼ��� :");
		x = sc.nextInt();
		System.out.print("y�� �Է��ϼ��� :");
		y = sc.nextInt();
		int temp;
		//temp �Լ��� ����Ͽ� �� ��ȯ
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x ="+x+" y = "+y);
		
		
	}

}
