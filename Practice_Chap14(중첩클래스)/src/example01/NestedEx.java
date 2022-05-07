package example01;

public class NestedEx {
	
	// 1. 인스턴스 멤버 클래스
	class A {
		int iv = 100;
		// 원래 인스턴스 중첩클래스에서는 static을 선언할 수 없었는데 Java SE 16부터 가능해진듯!
		// In this release, inner classes may declare members that are either explicitly or implicitly static.
		// This includes record class members, which are implicitly static.
		static int cv = 200; 
		
		public A() {
			System.out.println("A 생성자 호출");
		}
		
		public void method1() {
			System.out.println("A 클래스 method1 호출");
		}
	
		// static method 역시 사용가능!
		public static void method2() {
			System.out.println("A 클래스 static method2 호출");
		}
	}
	
	// 2. 정적 멤버 클래스
	static class B {
		int iv = 300;
		static int cv = 400; 
		
		public B() {
			System.out.println("B 생성자 호출");
		}
		
		public void method1() {
			System.out.println("B 클래스 method1 호출");
		}

		public static void method2() {
			System.out.println("B 클래스 static method2 호출");
		}
	}
	
	public void method() {
		// 3. 로컬 멤버 클래스 : 해당 메서드 내에서만 사용 가능
		// 역시 Java SE 16부터 static 멤버 선언할 수 있도록 바뀐듯!!
		class C {
			int iv = 500;
			static int cv = 600;
			
			public C() {
				System.out.println("C 생성자 호출");
			}
			
			public void method1() {
				System.out.println("C 클래스 method1 호출");
			}

			public static void method2() {
				System.out.println("C 클래스 static method2 호출");
			}
		}
		
		// 로컬 멤버 클래스 static 멤버에 접근 가능!
		System.out.println(C.cv);
		C.method2();
		
		C c = new C();
		System.out.println(c.iv);
		c.method1();
	}
	
	public void innerTest() {
		System.out.println();
		System.out.println("외부클래스 내에서 중첩클래스 접근 확인=======================================");
		System.out.println("innerTest() 호출.");
		// 외부클래스 내에서는 로컬중첩클래스 외의 중첩클래스에는 모두 접근가능
		A a = new A();
		System.out.println(a.iv);
		System.out.println(A.cv);
		
		System.out.println(B.cv);
		System.out.println(new B().iv);
		
		method();
		//C c = new C(); // 로컬 멤버 클래스를 포한한 함수 외에서는 로컬 멤버 클래스에 접근할 수 없음!!
	}
	
	public static void main(String[] args) {
		
		NestedEx n = new NestedEx();
		
		System.out.println("인스턴스 멤버 클래스 =======================================");
		// 1. 인스턴스 멤버 클래스
		System.out.println(A.cv); // 인스턴트 멤버 클래스의 정적 멤버변수 접근 가능
		A.method2();
		
		// 인스턴트 멤버 클래스의 인스턴스는 외부 클래스의 인스턴스를 통해서만 생성할 수 있다!
		A a = n.new A();  // NestedEx.A a = n.new A();
		System.out.println(a.iv);
		a.method1();
		
		System.out.println();
		System.out.println("정적 멤버 클래스 =======================================");
		// 2. 정적 멤버 클래스
		System.out.println(B.cv);
		B.method2();
		
		// 외부 클래스의 인스턴스 없이도 멤버 클래스의 인스턴스를 생성할 수 있음!
		B b = new B(); // B b = new NestedEx.B();
		System.out.println(b.iv);
		b.method1();
		
		System.out.println();
		System.out.println("로컬 멤버 클래스 =======================================");
		n.method();
		
		n.innerTest();
		
	}
}
