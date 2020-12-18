package Triangle;

public class Triangle {
	/*
	// 변수

	double length;
	double height;
	
	//메서드
	// 삼각형의 밑변과 높이 정보 변경	
	void TriAngleChange(double leng, double heig) {
		length = leng;
		height = heig;
	}
	
	// 삼각형의 넓이 계산
	double TriAngleArea(double length, double height) {		
	
		return (length*height)/2;
	
	}
	*/
	
	// 강사님 코드
	// 변수 : 밑변, 높이
	float width;	// 삼각형의 밑변
	float height;	// 삼각형의 높이
	
	// 메서드 : 변수의 값을 변경하는 메서드, 삼각형의 넓이를 구하고 결과흫 반환하는 메서드
	// 변수의 값을 변경하는 메서드
	void setData(float w, float h) {
		width = w;
		height = h;
	}
	
	// 삼각형의 넓이를 구하는 메서드 : 밑변 * 높이 / 2 --> 결과는 실수 타입
	float area() {
		
		return width*height/2;

	
	}
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		
		// 밑변과 높이 값을 설정
		t.setData(10, 3);
		
		// 넓이를 구하고 변수에 담는다.
		float result = t.area();
		System.out.println("삼각형의 넓이  "+result);
		
		// 밑변과 높이 값을 설정
		t.setData(3, 3);
		
		// 넓이를 구하고 변수에 담는다.
		result = t.area();
		System.out.println("삼각형의 넓이  "+result);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
	










