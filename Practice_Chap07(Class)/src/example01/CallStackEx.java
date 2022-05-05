package example01;

public class CallStackEx {
	
	// 메모리 stack 영역에 method 실행 순서대로 쌓임. call stack => LIFO 후입선출 Last In First Out

	// 							third
	//					second	second	second
	//			first	first	first	first	first
	// main     main	main	main	main	main	main

	// stack 반대 개념 : Queue -> FIFO First In First Out
	
	public static void main(String[] args) {
		System.out.println("main start");
		CallStackEx.first();
		System.out.println("main end");
	}
	
	public static void first() {
		System.out.println("first start");
		CallStackEx.second();
		System.out.println("first end");
	}
	
	public static void second() {
		System.out.println("second start");
		third();
		System.out.println("second end");
	}
	
	public static void third() {
		System.out.println("third start");
		System.out.println("third end");
	}

}
