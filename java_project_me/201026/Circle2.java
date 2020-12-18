package io;

import java.io.Serializable;

public class Circle2 implements Serializable {

	// implements serializable : 직렬화의 대상이다, 인스턴스 저장이 가능
	// 직렬화를 하기 위해서는 반드시 implements Serializable 해주어야함
	
	// transient : 직렬화 대상에서 제외
	Point p;
	double rad;
	
	public Circle2(int xPos, int yPos, double rad) {
		this.rad = rad;
		p = new Point(xPos, yPos);
	}
	
	public void showCircleInfo() {
		System.out.printf("[ %d, %d] \n", p.x, p.y);
		System.out.println("rad : " + rad);
	}
	
	
	
}
