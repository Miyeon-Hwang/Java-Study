package objectsExample;

import java.util.Arrays;
import java.util.Objects;

class Person {
	int age;
	String name;
	int[] arr;
	
	public Person(int age, String name, int[] arr) {
		super();
		this.age = age;
		this.name = name;
		this.arr = arr;
	}
	
	@Override
	public int hashCode() {
		System.out.println("name hashcode : " + name.hashCode());
		System.out.println("arr hashcode : " + arr.hashCode());
		//return this.age + this.name.hashCode() + this.arr.hashCode(); // 멤버가 많아지면 일일이 다 작성하기 번거로움
		
		// jdk 1.7부터 나온 것이므로 하위호환이 필요하면 위 코드로 작성해줘야 함
		
		//return Objects.hash(this.age, this.name, this.arr);  // arr로 매개변수를 넘기면 주소값이 서로 다르므로 다른 해시코드로 나옴
		return Objects.hash(this.age, this.name, Arrays.toString(this.arr)); // 배열의 값이 같으면 같은 해시코드로 나오도록 하려면 배열의 각 갑을 비교하도록 매개변수를 넘겨줘야 함
	}
	
	
}

public class HashEx {
	
	public static void main(String[] args) {
		Person p1 = new Person(30, "홍길동", new int[] {178, 59});
		Person p2 = new Person(30, "홍길동", new int[] {178, 59});
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

	
}
