package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		// Map : key-value 형식으로 저장하는 객체
		// HashMap<K, E>

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// 요소 추가 : put(T e)
		map.put(new Integer(1), "일번");
		map.put(new Integer(2), "이번");
		map.put(3, "삼번");

		// 참조 : get(key) // String을 받아라
		System.out.println("1번 학생의 이름 : " + map.get(new Integer(1)));
		System.out.println("2번 학생의 이름 : " + map.get(2)); // AUTO BOXING
		System.out.println("3번 학생의 이름 : " + map.get(3));

		System.out.println("------------------------------");

		// Set<Key Type>
		Set<Integer> set = map.keySet();
		Iterator<Integer> itr = set.iterator();

		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + "번 학생의 이름 : " + map.get(key));
		}

	}
}
