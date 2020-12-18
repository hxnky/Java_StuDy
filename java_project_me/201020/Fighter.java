package star;

public abstract class Fighter extends Unit implements Fightable {
	// Fightable이 인터페이스이기 때문에 abstract를 붙여주어야한다.
	// 상속과 구현을 동시에 한 경우

	@Override
	public void move() {
		System.out.println("이동합니다.");

		x += NUM;
		y += NUM;

	}
	
	@Override
	public void attack() {
		System.out.println("공격합니다.");

		hp -= NUM;
	}

}
