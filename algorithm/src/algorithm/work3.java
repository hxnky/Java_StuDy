package algorithm;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� ����
		int x = 0, y = 0;
		//���� �Է� 
		System.out.print("x�� �Է��ϼ��� :");
		x = sc.nextInt();
		System.out.print("y�� �Է��ϼ��� :");
		y = sc.nextInt();
		//ũ�� ����
		if(x>y) {
			System.out.println("x�� �� Ů�ϴ�.");
		}
		else if (x<y) {
			System.out.println("y�� �� Ů�ϴ�.");
		}
	}

}
