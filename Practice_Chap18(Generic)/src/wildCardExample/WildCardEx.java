package wildCardExample;

import java.util.Arrays;

public class WildCardEx {
	
	// 매개변수로 Course 제네릭 타입을 받되, 타입 파라미터 제한 없이 받겠다.
	public static void registerCourse(Course<?> course) {
		System.out.println("제한없음");
		System.out.println(course.getName());
		//System.out.println(Arrays.toString(course.getStudents()));
	}
	
	// 매개변수로 Course 제네릭 타입을 받되, Student 클래스나 그 자손클래스만 받겠다.
	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println("학생 제한");
		System.out.println(course.getName());
		//System.out.println(Arrays.toString(course.getStudents()));
	}
	
	// 매개변수로 Course 제네릭 타입을 받되, Worker 클래스나 그 상위클래스만 받겠다.
	public static void registerWorkerCourse(Course<? super Worker> course) {
		System.out.println("직장인 제한");
		System.out.println(course.getName());
		//System.out.println(Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
		registerCourse(new Course<Person>("일반인 과정", 20));
		registerCourse(new Course<Student>("학생 과정", 30));
		registerCourse(new Course<Worker>("직장인 과정", 10));
		
		System.out.println("===============================");
		registerStudentCourse(new Course<Student>("학생 과정", 30));
		registerStudentCourse(new Course<HighStudent>("고등학생 과정", 30));
		//registerStudentCourse(new Course<Worker>("직장인 과정", 30)); // wild card 제한 타입 조건에 맞지 않음. 컴파일에러
		
		System.out.println("===============================");
		registerWorkerCourse(new Course<Worker>("직장인 과정", 10));
		registerWorkerCourse(new Course<Person>("직장인 과정", 10));
		//registerWorkerCourse(new Course<Student>("학생 과정", 10)); // wild card 제한 타입 조건에 맞지 않음. 컴파일에러
		
	
		
		
		
		
	}

}
