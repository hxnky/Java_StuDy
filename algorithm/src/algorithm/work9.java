package algorithm;

public class work9 {
	
	public static void main(String[] args) {
		//���� ����
		int sum=0;
		int i;
		int j = 0;
		//2�� �������� �� �������� 0�� ���� ������ �����.
		for(i =1 ;i<=100;i++) {
			if(i%2==0) {
				j = i*(-1);
			}
			else {
				j = i;
			}
			sum +=j;
		}

		System.out.println(sum);
	}
}
