package wildCardExample;

import java.util.Arrays;

public class WildCardEx {
	
	// 매개변수로 Course 제네릭 타입을 받되, 타입 파라미터 제한 없이 받겠다.
	public static void registerCourse(Course<?> course) {
		System.out.println("제한없음");
		System.out.println(course.getName());
		System.out.println(Arrays.toString(course.getStudents()));
	}
	
	// 매개변수로 Course 제네릭 타입을 받되, Student 클래스나 그 자손클래스만 받겠다.
	public static void registerStudentCourse(Course<? extends Student> course) {
		System.out.println("학생 제한");
		System.out.println(course.getName());
		System.out.println(Arrays.toString(course.getStudents()));
	}
	
	// 매개변수로 Course 제네릭 타입을 받되, Worker 클래스나 그 상위클래스만 받겠다.
	public static void registerWorkerCourse(Course<? super Worker> course) {
		System.out.println("직장인 제한");
		System.out.println(course.getName());
		System.out.println(Arrays.toString(course.getStudents()));
	}
	
	public static void main(String[] args) {
		
		Course<Person> perC = new Course<Person>("일반인 과정", 3);
		perC.add(new Person("일반인1"));
		perC.add(new Person("일반인2"));
		perC.add(new Person("일반인3"));
		registerCourse(perC);
		//registerStudentCourse(perC); // wild card 제한 타입 조건에 맞지 않음. 컴파일에러
		registerWorkerCourse(perC);
		
		System.out.println("===============================");
		
		Course<Student> stuC = new Course<Student>("학생 과정", 3);
		stuC.add(new Student("학생1"));
		stuC.add(new Student("학생2"));
		stuC.add(new HighStudent("학생3"));
		registerCourse(stuC);
		registerStudentCourse(stuC); 
		//registerWorkerCourse(stuC); // wild card 제한 타입 조건에 맞지 않음. 컴파일에러
	
		System.out.println("===============================");
		
		Course<HighStudent> hstuC = new Course<HighStudent>("학생 과정", 3);
		hstuC.add(new HighStudent("고딩1"));
		hstuC.add(new HighStudent("고딩2"));
		hstuC.add(new HighStudent("고딩3"));
		registerCourse(hstuC);
		registerStudentCourse(hstuC); 
		//registerWorkerCourse(hstuC);
		
		System.out.println("===============================");
		
		Course<Worker> worC = new Course<Worker>("직장인 과정", 3);
		worC.add(new Worker("김대리"));
		worC.add(new Worker("이대리"));
		worC.add(new Worker("박차장"));
		registerCourse(worC);
		//registerStudentCourse(worC); // wild card 제한 타입 조건에 맞지 않음. 컴파일에러
		registerWorkerCourse(worC);
		
		
		
		
		
	}

}
