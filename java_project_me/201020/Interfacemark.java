package abstractTest;

public class Interfacemark {
	public static void main(String[] args) {

		PointOne pos1 = new PointOne(1,1);
		PointTwo pos2 = new PointTwo(2,2);
		PointOne pos3 = new PointOne(3,3);
		PointTwo pos4 = new PointTwo(4,4);
		
		String test = "test";
		
		ClassPrinter.print(pos1);
		ClassPrinter.print(pos2);
		ClassPrinter.print(pos3);
		ClassPrinter.print(pos4);
		ClassPrinter.print(test);
	}
}

interface UpperCasePrintable {
	// 마킹(확인)의 용도로 사용
}

class PointOne implements UpperCasePrintable {

	private int xPOS;
	private int yPOS;

	PointOne(int x, int y) {

		xPOS = x;
		yPOS = y;

	}

	@Override
	public String toString() {
		return "[x pos: " + xPOS + ", y pos : " + yPOS + "]";
	}
}

class PointTwo {
	private int xPOS, yPOS;

	PointTwo(int x, int y) {
		xPOS = x;
		yPOS = y;
	}

	@Override
	public String toString() {
		return "[x pos: " + xPOS + ", y pos: " + yPOS + "]";
	}

}

class ClassPrinter{
	public static void print(Object obj) {
		String str = obj.toString();
		
		// UpperCasePrintable 형변환 가능 여부 확ㅇ;ㄴ
		if(obj instanceof UpperCasePrintable) {
			str = str.toUpperCase();
		}		
		
		System.out.println(str);
		
	}
}













