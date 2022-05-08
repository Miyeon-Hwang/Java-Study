package example04;

public class StudentAnonymous {
	
	// 1. 클래스의 필드의 초기값으로 익명객체 사용
	Student stu1 = new Student("홍길동") {
		
		public void goSchool() {
			System.out.println(this.name + "이 등교합니다");
		}
		
		@Override
		public void wake() {
			System.out.println("필드의 초기값 형태로 만들어진 익명자손 객체");
			System.out.println(this.name + "은 9시에 일어납니다");
			this.goSchool();
		};
	};
	
	// 2. 메서드의 로컬변수로 익명객체 사용
	public void method() {
		Student lstu = new Student("김연아") {
			
			public void goSkate() {
				System.out.println(this.name + "는 스케이트연습하러 갑니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("메서드의 로컬변수로 만들어진 익명자손 객체");
				super.wake();
				goSkate();
			}
		};
		
		lstu.wake();
	}
	
	// 3. 메서드의 매개변수 값으로 익명객체 사용
	public void method2(Student student) {
		student.wake();
	}

}
