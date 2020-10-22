package generic;

public class FruitBoxMain2 {
	// 제네릭 타입
	public static void main(String[] args) {
		
		FruitBox<Apple> box1 = new FruitBox<Apple>(new Apple(100));
		box1.store(new Apple(10));
		Apple apple = box1.pullOut();
		apple.showWeight();
		
		FruitBox<Orange> box2 = new FruitBox<Orange>(new Orange(100));
		box2.store(new Orange(100));
		Orange orange = box2.pullOut();
		orange.showSugarContent();
		
		
		
	}
}
