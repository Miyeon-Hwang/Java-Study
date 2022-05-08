package example02;

public class Main {
	
	public static void main(String[] args) {
		A outer = new A();
		System.out.println();
		System.out.println("Main--------------------------");
		

		A.B inner = outer.new B();
		inner.method1();
		
		System.out.println();
		A.C staticInner = new A.C();
		staticInner.method1();
	}

}
