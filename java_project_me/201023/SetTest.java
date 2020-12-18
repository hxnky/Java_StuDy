package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		
		// HashSet 인스턴스 생성 : 인스턴스를 저장하기 위한 저장 공간 생성
		// Set : 집합, 저장순서 유지 X, 중복 데이터 저장 X
		HashSet<String> set = new HashSet<String>();
		
		set.add("First");
		set.add("Second");
		set.add("Third");
		set.add("First");	// 중복 데이터이므로 저장되지 않는다.
		
		System.out.println("set 요소의 개수 : " + set.size()); // 3
		
		// Set<E>는 저장하는 순서를 가지지 않기 때문에
		// 일괄 처리를 위해서는 Iterator<E> 인스턴스를 이용해서 처리
		// Collection<E> iterator() 메서드 --> Iterator<E>를 반환
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
