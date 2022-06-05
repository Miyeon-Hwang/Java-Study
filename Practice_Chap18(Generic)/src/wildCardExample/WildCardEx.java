package wildCardExample;

import java.util.Arrays;

public class WildCardEx {
	
	// �Ű������� Course ���׸� Ÿ���� �޵�, Ÿ�� �Ķ���� ���� ���� �ްڴ�.
	public static void registerCourse(Course<?> course) {
		System.out.println("���Ѿ���");
		System.out.println(course.getName());
		System.out.println(Arrays.toString(course.getStudents()));
	}
	
	// �Ű������� Course ���׸� Ÿ���� �޵�, Student Ŭ������ �� �ڼ�Ŭ������ �ްڴ�.
	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println("�л� ����");
		System.out.println(course.getName());
		System.out.println(Arrays.toString(course.getStudents()));
	}
	
	// �Ű������� Course ���׸� Ÿ���� �޵�, Worker Ŭ������ �� ����Ŭ������ �ްڴ�.
	public static void registerWorkerCourse(Course<? super Worker> course) {
		System.out.println("������ ����");
		System.out.println(course.getName());
		System.out.println(Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
		Course<Person> perC = new Course<Person>("�Ϲ��� ����", 3);
		perC.add(new Person("�Ϲ���1"));
		perC.add(new Person("�Ϲ���2"));
		perC.add(new Person("�Ϲ���3"));
		registerCourse(perC);
		//registerStudentCourse(perC); // wild card ���� Ÿ�� ���ǿ� ���� ����. �����Ͽ���
		registerWorkerCourse(perC);
		
		System.out.println("===============================");
		
		Course<Student> stuC = new Course<Student>("�л� ����", 3);
		stuC.add(new Student("�л�1"));
		stuC.add(new Student("�л�2"));
		stuC.add(new HighStudent("�л�3"));
		registerCourse(stuC);
		registerStudentCourse(stuC); 
		//registerWorkerCourse(stuC); // wild card ���� Ÿ�� ���ǿ� ���� ����. �����Ͽ���
	
		System.out.println("===============================");
		
		Course<HighStudent> hstuC = new Course<HighStudent>("�л� ����", 3);
		hstuC.add(new HighStudent("���1"));
		hstuC.add(new HighStudent("���2"));
		hstuC.add(new HighStudent("���3"));
		registerCourse(hstuC);
		registerStudentCourse(hstuC); 
		//registerWorkerCourse(hstuC);
		
		System.out.println("===============================");
		
		Course<Worker> worC = new Course<Worker>("������ ����", 3);
		worC.add(new Worker("��븮"));
		worC.add(new Worker("�̴븮"));
		worC.add(new Worker("������"));
		registerCourse(worC);
		//registerStudentCourse(worC); // wild card ���� Ÿ�� ���ǿ� ���� ����. �����Ͽ���
		registerWorkerCourse(worC);
		
		
		
		
		
	}

}
