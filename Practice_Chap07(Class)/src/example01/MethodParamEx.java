package example01;

class A {
	int data;
}

public class MethodParamEx {
	public static void main(String[] args) {
		A a = new A();
		a.data = 1;
		System.out.println("메서드 호출 전 클래스 객체의 주소 : " + a);
		System.out.println("메서드 호출 전 객체 내 data의 값 : " + a.data);
		primitiveParamTest(a.data);
		System.out.println("primitiveParamTest 호출 후 data 값 : " + a.data); // 메서드 내에서 data 값을 바꿔도 함수 밖에서는 영향없음
		System.out.println();
		
		referenceParamTest(a);
		System.out.println("메서드 호출 후 클래스 객체의 주소 : " + a);
		System.out.println("referenceParamTest 호출 후 data의 값 : " + a.data); // 매개변수로 주소를 넘겨준 것이기 때문에 메서드 내부에서의 수정이 영향을 끼침
	}
	
	// 1. Call by Value
	// 함수의 지역변수를 새로 생성하고 값을 복사하는 개념
	public static void primitiveParamTest(int data) {
		System.out.println("전달받은 param data의 값 : " + data);
		data = 5;
		System.out.println("전달받은 param data 변경 후의 값 : " + data);
	}
	
	// 2. Call by Reference
	// 배열, 클래스 객체 등의 참조변수 형태를 매개변수로 받을 때 주소로 받음.
	public static void referenceParamTest(A a) {
		System.out.println("전달받은 param class 객체의 주소 값 : " + a);
		System.out.println("전달받은 param class 객체 내 data 값 : " + a.data);
		a.data = 5;
		System.out.println("전달받은 param class 객체 변경 후의 주소 값 : " + a);
		System.out.println("전달받은 param class 객체 변경 후 data 값 : " + a.data);
	}
}
