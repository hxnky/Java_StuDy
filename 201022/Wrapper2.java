package basic;

public class Wrapper2 {

	public static void main(String[] args) {
		
		// Wrapper = primitive -> 원형 타입 대입
		Integer iValue = 10;	// AUTO BOXING
		// Integer iValue = new Integer(10); => 위와 같은 뜻
		// Integer iValue = Integer.valueOf(10); => 위와 같은 뜻
		
		Double dValue = 3.14;
		// Double dValue = new Double(3.14);
		// Double dValue = Double.valueOf(3.14);	
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		int num1 = iValue; // Integer -> int로 AUTO UNBOXING
		double num2 = dValue;
		
		System.out.println(num1);	// iValue.toSrting()
		System.out.println(num2);	// dValue.toString()
		
		
		
		
	}

}
