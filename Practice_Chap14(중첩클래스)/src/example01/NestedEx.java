package example01;

public class NestedEx {
	
	// 1. �ν��Ͻ� ��� Ŭ����
	class A {
		int iv = 100;
		// ���� �ν��Ͻ� ��øŬ���������� static�� ������ �� �����µ� Java SE 16���� ����������!
		// In this release, inner classes may declare members that are either explicitly or implicitly static.
		// This includes record class members, which are implicitly static.
		static int cv = 200; 
		
		public A() {
			System.out.println("A ������ ȣ��");
		}
		
		public void method1() {
			System.out.println("A Ŭ���� method1 ȣ��");
		}
	
		// static method ���� ��밡��!
		public static void method2() {
			System.out.println("A Ŭ���� static method2 ȣ��");
		}
	}
	
	// 2. ���� ��� Ŭ����
	static class B {
		int iv = 300;
		static int cv = 400; 
		
		public B() {
			System.out.println("B ������ ȣ��");
		}
		
		public void method1() {
			System.out.println("B Ŭ���� method1 ȣ��");
		}

		public static void method2() {
			System.out.println("B Ŭ���� static method2 ȣ��");
		}
	}
	
	public void method() {
		// 3. ���� ��� Ŭ���� : �ش� �޼��� �������� ��� ����
		// ���� Java SE 16���� static ��� ������ �� �ֵ��� �ٲ��!!
		class C {
			int iv = 500;
			static int cv = 600;
			
			public C() {
				System.out.println("C ������ ȣ��");
			}
			
			public void method1() {
				System.out.println("C Ŭ���� method1 ȣ��");
			}

			public static void method2() {
				System.out.println("C Ŭ���� static method2 ȣ��");
			}
		}
		
		// ���� ��� Ŭ���� static ����� ���� ����!
		System.out.println(C.cv);
		C.method2();
		
		C c = new C();
		System.out.println(c.iv);
		c.method1();
	}
	
	public void innerTest() {
		System.out.println();
		System.out.println("�ܺ�Ŭ���� ������ ��øŬ���� ���� Ȯ��=======================================");
		System.out.println("innerTest() ȣ��.");
		// �ܺ�Ŭ���� �������� ������øŬ���� ���� ��øŬ�������� ��� ���ٰ���
		A a = new A();
		System.out.println(a.iv);
		System.out.println(A.cv);
		
		System.out.println(B.cv);
		System.out.println(new B().iv);
		
		method();
		//C c = new C(); // ���� ��� Ŭ������ ������ �Լ� �ܿ����� ���� ��� Ŭ������ ������ �� ����!!
	}
	
	public static void main(String[] args) {
		
		NestedEx n = new NestedEx();
		
		System.out.println("�ν��Ͻ� ��� Ŭ���� =======================================");
		// 1. �ν��Ͻ� ��� Ŭ����
		System.out.println(A.cv); // �ν���Ʈ ��� Ŭ������ ���� ������� ���� ����
		A.method2();
		
		// �ν���Ʈ ��� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ �ν��Ͻ��� ���ؼ��� ������ �� �ִ�!
		A a = n.new A();  // NestedEx.A a = n.new A();
		System.out.println(a.iv);
		a.method1();
		
		System.out.println();
		System.out.println("���� ��� Ŭ���� =======================================");
		// 2. ���� ��� Ŭ����
		System.out.println(B.cv);
		B.method2();
		
		// �ܺ� Ŭ������ �ν��Ͻ� ���̵� ��� Ŭ������ �ν��Ͻ��� ������ �� ����!
		B b = new B(); // B b = new NestedEx.B();
		System.out.println(b.iv);
		b.method1();
		
		System.out.println();
		System.out.println("���� ��� Ŭ���� =======================================");
		n.method();
		
		n.innerTest();
		
	}
}
