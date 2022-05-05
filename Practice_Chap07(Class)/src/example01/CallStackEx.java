package example01;

public class CallStackEx {
	
	// �޸� stack ������ method ���� ������� ����. call stack => LIFO ���Լ��� Last In First Out

	// 							third
	//					second	second	second
	//			first	first	first	first	first
	// main     main	main	main	main	main	main

	// stack �ݴ� ���� : Queue -> FIFO First In First Out
	
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
