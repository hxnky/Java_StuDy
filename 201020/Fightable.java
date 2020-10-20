package star;

public interface Fightable {

	// public abstract void move();
	void move(); // public abstract 생략 가능
	// public abstract void attack();

	void attack(); // 알아서 추상메서드가 된다.

	// public static final int NUM = 10; // fianl은 변수 이름 대문자만 가능
	int NUM = 10; // public static 생략 가능

}
