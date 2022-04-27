package example01;

public class VarEx01 {

	public static void main(String[] args) {
		// 1. 기본형 변수
		int number; // int형 4byte 만큼 스택 메모리에 변수 메모리를 할당함. 초기화를 안했으므로 dummy 값이 들어가있음
		number = 100;
		
		long num1 = 10; // 원칙대로라면 정수의 기본형은 int로 long으로 선언하려면 접미사 l을 붙여야 함. 지금은 없어도 컴파일러가 알아서 long으로 인식하긴 함
		float num2 = 1.1f; // 실수의 기본형은 double이므로 float은 접미사 f를 붙여줘야 함.
		
		// 2. 참조형 변수(기본형 변수 외)
		// 참조형 변수를 선언하면 주소값을 저장하기 위한 4byte 메모리가 스택영역에 할당되고
		// new를 하므로 heap 메모리에서 String class의 크기만큼 메모리가 할당된 후 "java"라는 값을 저장
		// 해당 heap 메모리의 주소값이 스택영역 참조형 변수에 16진수로 저장됨.
		String str = new String("java");
		System.out.println(str);
		System.out.println(str.toString());
		str = null; // 주소값을 저장하고 있던 스택영역의 변수에 null이 저장됨. 
		System.out.println(str);
		
		// 사용자정의클래스나 toString() 재정의를 하지 않은 클래스의 참조변수는 출력시에 "클래스타입@16진수주소값"으로 나옴
		Object obj1 = new Object();
		System.out.println(obj1); // out : java.lang.Object@1c4af82c <= "클래스타입@16진수주소값"
		
		// 3. 상수 : final keyword 사용!
		final int num3 = 100;
		//num3 = 200; // error
	}

}
