package generic;

public class FruitBoxMain3 {

	public static void main(String[] args) {
		
		FruitBox box1 = new FruitBox();
		box1.store(new Apple(100));
		Apple apple = (Apple)box1.pullOut();
		apple.showWeight();
		
		FruitBox box2 = new FruitBox();
		box1.store("Apple");
		Apple apple2 = (Apple)box2.pullOut();
		apple2.showWeight();

		
		
	}
}
