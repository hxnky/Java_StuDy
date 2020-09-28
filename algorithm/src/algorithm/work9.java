package algorithm;

public class work9 {
	
	public static void main(String[] args) {
		//변수 선언
		int sum=0;
		int i;
		int j = 0;
		//2로 나누었을 때 나머지가 0인 수만 음수로 만든다.
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
