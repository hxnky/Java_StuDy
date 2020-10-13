package work;

public class methodTest {
	public static void main(String[] args) {
		
		methodTest test = new methodTest();
		// 1번 문제 메서드 호출
		System.out.println("사칙연산 메서드");
		cal(10, 3);
		// 2번 문제 메서드 호출
		System.out.println("절댓값 메서드");
		test.abs(-5, 9);
		// 3번 문제 메서드 호출
		System.out.println("원의 넓이 계산 메서드");
		System.out.println("원의 넓이 : "+cirArea(5));
		System.out.println("원의 둘레 계산 메서드");
		System.out.println("원의 둘레 : "+circu(5));
		// 4번 문제 메서드 호출
		System.out.println(isPrimeNumber(3));
		System.out.println(isPrimeNumber(4));
		System.out.println("1~100까지의 범위에서 소수 찾기");
		for(int i = 1; i<101; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	// 메서드  : 데이터를 받아서 처리하고 결과를 반환하는 기능
	
	// 문제 1
	// 두 개의 정수를 전달받아서, 
	// 두수의 사칙연산 결과를 출력하는 메서드와
	// 이 메서드를 호출하는 main메서드를 정의해보자.
	// 단, 나눗셈은 몫과 나머지를 각각 출력해야 한다.
	// return이 없다.
	
	static void cal(int num1, int num2) {		
		// 사칙연산 : +, -, *, /, %
		System.out.println("num1 + num2 = "+(num1 + num2));
		System.out.println("num1 - num2 = "+(num1 - num2));
		System.out.println("num1 * num2 = "+(num1 * num2));
		System.out.println("num1 / num2 = "+(num1 / num2));
		System.out.println("num1 % num2 = "+(num1 % num2));
	}
	
	// 문제2.
		// 두 개의 정수를 전달 받아서,
		// 두수의 절대값을 계산하여 출력하는 메서드와 
		// 이 메서드를 호출하는 main메서드를 정의해 보자. 
		// 단 메서드 호출 시 전달되는 값의 순서에 상관없이 절대값이 계산되어서 출력되어야 한다.
		// return이 없다.
	void abs(int num1, int num2) {
		System.out.println("num1의 절댓값  : " + (num1<0?-num1:num1));
		System.out.println("num2의 절댓값 : " + (num2>0?num2:num2*-1));
	}
	

	// 문제3
	// 원의 반지름 정보를 전달하면, 
	// 원의 넓이를 계산해서 반환하는 메서드와  -->  (π*r∧2)
	// 원의 둘레를 계산해서 반환하는 메서드를 각각 정의하고, --> (2*π*r), 
	// 이를 호출하는 main메서드를 정의하자. 

	static double cirArea(double radius) {		
		return Math.PI*radius*radius;	
	}
	
	static double circu(int radius) {
		return 2*Math.PI*radius;
	}
  	//문제4.
	//전달되는 값(매개변수 필요)이 소수(prime number)인지 아닌지를 판단하여,
	//소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, --> return boolean
	//이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.
	
	static boolean isPrimeNumber(int num) {
		
		boolean result = true;
		int cnt = 0;
		// 소수인지 판별
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				cnt++;
			}	
		}

		
		return cnt>2?false:true;	// 소수는 1과 자기자신으로만 나뉘므로 연산을 2번만 한다.
	}
	
	
	
	
	
	
	
}

