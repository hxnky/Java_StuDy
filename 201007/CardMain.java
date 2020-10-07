package card;

public class CardMain {

	public static void main(String[] args) {

		System.out.println(Math.PI);

		System.out.println(Math.random());

		System.out.println("카드의 폭 사이즈 : " + Card.width);
		Card.play();

		Card c1 = new Card();
		Card c2 = new Card();
		// Card c3 = new Card();
		// Card c4 = new Card();

		c1.play();

		System.out.println("카드의 폭 사이즈 : " + c1.width);
		System.out.println("카드의 폭 사이즈 : " + c2.width);

		Card.width = 120;
		System.out.println("카드의 폭 사이즈 변경");

		System.out.println("카드의 폭 사이즈 : " + c1.width);
		System.out.println("카드의 폭 사이즈 : " + c2.width);

	}

}
