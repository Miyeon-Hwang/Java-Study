package example02;

// 내부 클래스의 외부클래스 접근 제한 관련 실습
public class A {
	
	int a = 10;
	static int sa = 100;
	
	String str = "outer class";
	
	public void method() {
		System.out.println("외부클래스 method 호출");
	}
	
	public static void smethod() {
		System.out.println("외부클래스 static method 호출");
	}
	
	// 1. 인스턴스 멤버 클래스에서는 외부클래스의 모든 멤버에 자유롭게 접근 가능하다!
	// 인스턴스 멤버는 "외부클래스명.this.외부클래스변수명"
	// 정적 멤버는 "외부클래스명.정적멤버변수명"
	// 로컬 멤버 클래스도 인스턴스 멤버 클래스와 동일
	class B {
		String str = "inner class";
		public B() {
			System.out.println("인스턴스 멤버클래스 B 생성자");
		}
		
		public void method1() {
			System.out.println("인스턴스 멤버클래스 B method1 시작");
			System.out.println(a);
			System.out.println(A.this.a); // 명시적으로는 이렇게 접근
			System.out.println(sa);  // System.out.println(A.sa);
			method();
			A.this.method();
			smethod();
			A.smethod();
			
			// 내부클래스, 외부클래스에 같은 이름의 필드가 있으면?
			System.out.println("inner class의 str : " + str); // inner class의 str (this.str)
			System.out.println("outer class의 str : " + A.this.str); // outer class의 str
			System.out.println("인스턴스 멤버클래스 B method1 끝");
		}
	}
	
	// 2. 정적 멤버클래스는 외부클래스의 정적멤버에만 접근할 수 있음.
	static class C {
		
		public C() {
			System.out.println("static 멤버클래스 C 생성자");
		}
		
		public void method1() {
			System.out.println("static 멤버클래스 C method1 시작");
			//System.out.println(a); // 정적 멤버클래스에서는 외부클래스의 정적멤버 외에는 접근할 수 없다
			//method();
			
			System.out.println(sa);
			smethod();
			System.out.println("static 멤버클래스 C method1 끝");
		}
	}
	
	//static B innerB = new B(); // 인스턴스 멤버 클래스는 static으로 생성하려하면 에러남.
	B innerB = new B();
	static C innerC = new C();
}
