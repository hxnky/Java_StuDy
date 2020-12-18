package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");

		// Iterator <E> 인스턴스 생성 : iterator() 메서드 호출
		System.out.println("요소 출력");

		Iterator<String> itr = list.iterator();

		// hasNext(), next(), remove() 메서드 사용 가능
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);

			if (str.compareTo("Third") == 0) {
				itr.remove(); // 원본의 데이터를 삭제
			}

		}

		System.out.println("요소 삭제 후 리스트 출력");

		itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
