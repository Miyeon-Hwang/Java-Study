package example02;

// ���� Ŭ������ �ܺ�Ŭ���� ���� ���� ���� �ǽ�
public class A {
	
	int a = 10;
	static int sa = 100;
	
	String str = "outer class";
	
	public void method() {
		System.out.println("�ܺ�Ŭ���� method ȣ��");
	}
	
	public static void smethod() {
		System.out.println("�ܺ�Ŭ���� static method ȣ��");
	}
	
	// 1. �ν��Ͻ� ��� Ŭ���������� �ܺ�Ŭ������ ��� ����� �����Ӱ� ���� �����ϴ�!
	// �ν��Ͻ� ����� "�ܺ�Ŭ������.this.�ܺ�Ŭ����������"
	// ���� ����� "�ܺ�Ŭ������.�������������"
	// ���� ��� Ŭ������ �ν��Ͻ� ��� Ŭ������ ����
	class B {
		String str = "inner class";
		public B() {
			System.out.println("�ν��Ͻ� ���Ŭ���� B ������");
		}
		
		public void method1() {
			System.out.println("�ν��Ͻ� ���Ŭ���� B method1 ����");
			System.out.println(a);
			System.out.println(A.this.a); // ��������δ� �̷��� ����
			System.out.println(sa);  // System.out.println(A.sa);
			method();
			A.this.method();
			smethod();
			A.smethod();
			
			// ����Ŭ����, �ܺ�Ŭ������ ���� �̸��� �ʵ尡 ������?
			System.out.println("inner class�� str : " + str); // inner class�� str (this.str)
			System.out.println("outer class�� str : " + A.this.str); // outer class�� str
			System.out.println("�ν��Ͻ� ���Ŭ���� B method1 ��");
		}
	}
	
	// 2. ���� ���Ŭ������ �ܺ�Ŭ������ ����������� ������ �� ����.
	static class C {
		
		public C() {
			System.out.println("static ���Ŭ���� C ������");
		}
		
		public void method1() {
			System.out.println("static ���Ŭ���� C method1 ����");
			//System.out.println(a); // ���� ���Ŭ���������� �ܺ�Ŭ������ ������� �ܿ��� ������ �� ����
			//method();
			
			System.out.println(sa);
			smethod();
			System.out.println("static ���Ŭ���� C method1 ��");
		}
	}
	
	//static B innerB = new B(); // �ν��Ͻ� ��� Ŭ������ static���� �����Ϸ��ϸ� ������.
	B innerB = new B();
	static C innerC = new C();
}
