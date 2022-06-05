package wildCardExample;

import java.util.Arrays;

public class WildCardEx {
	
	// �Ű������� Course ���׸� Ÿ���� �޵�, Ÿ�� �Ķ���� ���� ���� �ްڴ�.
	public static void registerCourse(Course<?> course) {
		System.out.println("���Ѿ���");
		System.out.println(course.getName());
		//System.out.println(Arrays.toString(course.getStudents()));
	}
	
	// �Ű������� Course ���׸� Ÿ���� �޵�, Student Ŭ������ �� �ڼ�Ŭ������ �ްڴ�.
	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println("�л� ����");
		System.out.println(course.getName());
		//System.out.println(Arrays.toString(course.getStudents()));
	}
	
	// �Ű������� Course ���׸� Ÿ���� �޵�, Worker Ŭ������ �� ����Ŭ������ �ްڴ�.
	public static void registerWorkerCourse(Course<? super Worker> course) {
		System.out.println("������ ����");
		System.out.println(course.getName());
		//System.out.println(Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
		registerCourse(new Course<Person>("�Ϲ��� ����", 20));
		registerCourse(new Course<Student>("�л� ����", 30));
		registerCourse(new Course<Worker>("������ ����", 10));
		
		System.out.println("===============================");
		registerStudentCourse(new Course<Student>("�л� ����", 30));
		registerStudentCourse(new Course<HighStudent>("����л� ����", 30));
		//registerStudentCourse(new Course<Worker>("������ ����", 30)); // wild card ���� Ÿ�� ���ǿ� ���� ����. �����Ͽ���
		
		System.out.println("===============================");
		registerWorkerCourse(new Course<Worker>("������ ����", 10));
		registerWorkerCourse(new Course<Person>("������ ����", 10));
		//registerWorkerCourse(new Course<Student>("�л� ����", 10)); // wild card ���� Ÿ�� ���ǿ� ���� ����. �����Ͽ���
		
	
		
		
		
		
	}

}
