package objectsExample;

import java.util.Comparator;
import java.util.Objects;


// 1. Objects.compare(), Comparator<T> �������̽�

public class CompareEx {
	
	static class Student {
		int sno;
		String name;
		
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
	}
	
	static class StudentNameComparator implements Comparator<Student> {
		
		@Override
		public int compare(Student o1, Student o2) {
			if (o1.name.compareTo(o2.name) < 0) // compareTo -> String ������������ ��
				return 1;
			else if(o1.name.compareTo(o2.name) > 0)
				return -1;
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(5, "ȫ�浿");
		Student s2 = new Student(2, "�迬��");
		Student s3 = new Student(3, "�����");
	
		// Comparetor<T> �������̽��� �͸�����ü�� �Ű������� �Ѱ���
		int result = Objects.compare(s1, s2, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.sno - o2.sno;
			}
		});
		
		if (result > 0)
			System.out.println("s1�� s2���� ũ��");
		else
			System.out.println("s2�� s1���� ũ��");
		
		
		
		// Comparetor<T> �������̽��� ������ ���� Ŭ������ ��ü�� �Ѱ���
		int result2 = Objects.compare(s2, s3, new StudentNameComparator());
		if (result2 > 0)
			System.out.println("s2�� s3���� name�� ������  " + s2.name + s3.name);
		else
			System.out.println("s3�� s2���� name�� ������  " + s2.name + s3.name);
	
	}

}
