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
		//return this.age + this.name.hashCode() + this.arr.hashCode(); // ����� �������� ������ �� �ۼ��ϱ� ���ŷο�
		
		// jdk 1.7���� ���� ���̹Ƿ� ����ȣȯ�� �ʿ��ϸ� �� �ڵ�� �ۼ������ ��
		
		//return Objects.hash(this.age, this.name, this.arr);  // arr�� �Ű������� �ѱ�� �ּҰ��� ���� �ٸ��Ƿ� �ٸ� �ؽ��ڵ�� ����
		return Objects.hash(this.age, this.name, Arrays.toString(this.arr)); // �迭�� ���� ������ ���� �ؽ��ڵ�� �������� �Ϸ��� �迭�� �� ���� ���ϵ��� �Ű������� �Ѱ���� ��
	}
	
	
}

public class HashEx {
	
	public static void main(String[] args) {
		Person p1 = new Person(30, "ȫ�浿", new int[] {178, 59});
		Person p2 = new Person(30, "ȫ�浿", new int[] {178, 59});
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

	
}
