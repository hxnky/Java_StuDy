package generic;

public class FruitBox<T> {	// T --> Apple

	T fruit;	// Apple Fruit
	
	FruitBox(T obj){			// public FruitBox(Apple fruit)
		this.fruit = obj;	
	}
	
	public void store(T fruit) {
		this.fruit = fruit;		// public void store(Apple fruit)
	}
	
	public T pullOut() {	// public Apple pullOut
		return fruit;
	}
	
	
	
	
}
