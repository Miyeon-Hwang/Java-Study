package example04;

public class StudentEx {
	
	public static void main(String[] args) {
		
		StudentAnonymous anony = new StudentAnonymous();
		anony.stu1.wake();
		
		System.out.println();
		anony.method();
		
		System.out.println();
		anony.method2(new Student("박지성") {
			
			public void goTraining() {
				System.out.println(this.name + "은 훈련하려 갑니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("메서드의 매개변수로 익명객체를 선언하여 넘김");
				super.wake();
				goTraining();
			}
		});
	}

}
