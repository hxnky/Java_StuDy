package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Person implements Comparable<Person> {

	String name;
	int age;

	Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "(" + age + ")";
	}

	@Override
	public int compareTo(Person o) {
//		if(age>o.age) {
//			return 1; // 양수 반환 :전달 받은 객체의 값이 작을 때
//		}
//		else if(age<o.age) {
//			return -1; // 음수 반환 : 전달 받은 객체의 값이 클 때
//		}
//		return 0;	// 0 반환 : 전달 받은 객체와 값이 같을 때

		// return age-o.age;
		return o.age - age;
	}

	public static void main(String[] args) {

		TreeSet<Person> tSet = new TreeSet<Person>();

		tSet.add(new Person("son", 28));
		tSet.add(new Person("Park", 40));
		tSet.add(new Person("Lee", 20));

		Iterator<Person> iterator = tSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
