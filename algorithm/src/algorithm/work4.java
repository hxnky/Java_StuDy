package algorithm;

import java.util.Scanner;

public class work4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� ����
		int x = 0;
		int y = 0;
		int z = 0;
		//���� �Է�
		System.out.print("x�� �Է��ϼ��� :");
		x = sc.nextInt();
		System.out.print("y�� �Է��ϼ��� :");
		y = sc.nextInt();
		System.out.print("z�� �Է��ϼ��� :");
		z = sc.nextInt();
		//�� ���� ũ�� ���Ͽ� ������ �� ������ ũ�� ���
		if(x>y && x>z) {
			System.out.println("x�� ����Ů�ϴ�.");
			}
		else if (y>z && y>x) {
			System.out.println("y�� ����Ů�ϴ�.");
			}
		else if (z>x && z>y) {
			System.out.println("z�� ����Ů�ϴ�.");
			}	
		
		
		
	}
}
