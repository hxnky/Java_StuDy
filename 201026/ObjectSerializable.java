package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectSerializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// 인스턴스 저장을 위한 스트림 생성
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));

		// 인스턴스를 저장
		out.writeObject(new Circle(1, 1, 2.4));
		out.writeObject(new Circle(2, 2, 4.8));
		// String 클래스도 직렬화 가능
		out.writeObject(new String("String Class implements Serializable"));

		out.writeObject(new Circle2(3, 3, 6.9));
		
		
		System.out.println("인스턴스 저장 성공~");
		out.close();
		
		// 인스턴스 복원
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
		
		Object o1 = in.readObject();
		
		Circle c1 = null;
		
		if(o1 instanceof Circle) {
			c1 = (Circle) o1;
		}

		Circle c2 = (Circle) in.readObject();
		String str = (String) in.readObject();
		
		Object o2 = in.readObject();
		Circle c3 = null;
		if(o2 instanceof Circle2) {
			c3 = (Circle) o2;
		}
		
		
		
		
		// 복원된 인스턴스 
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
