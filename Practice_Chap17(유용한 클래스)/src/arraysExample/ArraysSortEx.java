package arraysExample;

import java.util.Arrays;

//�迭���� sort�� ����Ϸ��� Comparable �������̽� �����ϰ� compareTo�� �������̵� ����� ��.

class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override // sort�� ����Ϸ��� Comparable �������̽� �����ϰ� compareTo�� �������̵� ����� ��.
	public int compareTo(Person o) {
		return this.name.compareTo(o.name); // String�� compareTo�� �������̵� �Ǿ�����. �������������Ϸ��� o.name.compareTo(this.name)�� ���� �������ָ� �� 
	}
	
}

public class ArraysSortEx {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ȳ���", 29);
		Person p2 = new Person("������", 30);
		Person p3 = new Person("������", 31);
		Person[] ps = {p1, p2, p3};
		
		Arrays.sort(ps);
		for (Person p : ps) { // �������̵� �Ѵ�� ������������ ���ĵǾ�����.
			System.out.println(p.name);
		}
		
		// sorting �� �� binary search
		int idx = Arrays.binarySearch(ps, p3);
		System.out.println(p3.name == ps[idx].name);
		
	}
}
