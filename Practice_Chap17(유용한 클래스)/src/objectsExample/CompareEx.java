package objectsExample;

import java.util.Comparator;
import java.util.Objects;


// 1. Objects.compare(), Comparator<T> 인터페이스

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
			if (o1.name.compareTo(o2.name) < 0) // compareTo -> String 오름차순으로 비교
				return 1;
			else if(o1.name.compareTo(o2.name) > 0)
				return -1;
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student(5, "홍길동");
		Student s2 = new Student(2, "김연아");
		Student s3 = new Student(3, "손흥민");
	
		// Comparetor<T> 인터페이스를 익명구현객체로 매개변수로 넘겨줌
		int result = Objects.compare(s1, s2, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.sno - o2.sno;
			}
		});
		
		if (result > 0)
			System.out.println("s1이 s2보다 크다");
		else
			System.out.println("s2가 s1보다 크다");
		
		
		
		// Comparetor<T> 인터페이스를 구현한 별도 클래스의 객체를 넘겨줌
		int result2 = Objects.compare(s2, s3, new StudentNameComparator());
		if (result2 > 0)
			System.out.println("s2이 s3보다 name이 빠르다  " + s2.name + s3.name);
		else
			System.out.println("s3이 s2보다 name이 빠르다  " + s2.name + s3.name);
	
	}

}
