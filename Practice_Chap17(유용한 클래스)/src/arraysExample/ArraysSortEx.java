package arraysExample;

import java.util.Arrays;

//배열에서 sort를 사용하려면 Comparable 인터페이스 구현하고 compareTo를 오버라이딩 해줘야 함.

class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override // sort를 사용하려면 Comparable 인터페이스 구현하고 compareTo를 오버라이딩 해줘야 함.
	public int compareTo(Person o) {
		return this.name.compareTo(o.name); // String은 compareTo가 오버라이딩 되어있음. 내림차순으로하려면 o.name.compareTo(this.name)로 순서 변경해주면 됨 
	}
	
}

public class ArraysSortEx {

	public static void main(String[] args) {
		
		Person p1 = new Person("황김김", 29);
		Person p2 = new Person("김이이", 30);
		Person p3 = new Person("이이이", 31);
		Person[] ps = {p1, p2, p3};
		
		Arrays.sort(ps);
		for (Person p : ps) { // 오버라이딩 한대로 오름차순으로 정렬되어있음.
			System.out.println(p.name);
		}
		
		// sorting 한 후 binary search
		int idx = Arrays.binarySearch(ps, p3);
		System.out.println(p3.name == ps[idx].name);
		
	}
}
