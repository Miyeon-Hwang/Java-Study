package example01;

public class VarEx02 {
	// 1. class 영역에서 선언되는 멤버변수는 default값으로 초기화가 된다. 그치만 초기화는 해주자.
	static boolean b; // default는 false
	public static void main(String[] args) {
		System.out.println(b);
		// 지역변수(메서드 내에 선언되어있는 변수)는 사용전에 초기화 필수!
		
		// 2. 문자열 + anytype => 문자열
		System.out.println(7 + 8 + ""); // "15"가 출력됨
		
		// 3.  정수의 오버플로우
		// byte type => 2^8 => -2^7 ~ (2^7 - 1) 맨 앞 1bit는 부호
		byte b1 = 127;
		//byte b2 = 128; // 에러가 남, 오버플로우
		byte b2 = (byte)(b1 + 1); // looping
		byte b3 = (byte)(-128 - 1);
		System.out.println("b1 : " + b1 + ", b2 : " + b2 + ", b3 : " + b3);
		
		// 4. 형 변환(Casting)
		//boolean 제외한 기본형은 서로 형변환 가능
		byte b = 10;
		int i = b;// 작은 크기에서 큰 크기로의 형변환은 생략 가능. 자동 형변환 (auto casting) => int i =(int)b;
		System.out.println("자동캐스팅 : " + i);
		
		int i1 = 65;
		char c1 = (char)i1;// 큰 크기에서 작은 크기로의 형변환 및 정수 <-> 실수 간 형변환은 생략 불가. 강제 형변환
		System.out.println("강제캐스팅1 정수 -> 문자: " + i1 + " -> " + c1); // ASCII code
		
		int i2 = 129;
		byte b4 = (byte)i2;
		float f1 = (float)i2;
		System.out.println("강제캐스팅2 int -> byte: " + i2 + " -> " + b4); // 큰 크기에서 작은 크기로 강제형변환을 하면 값의 손실이 일어남! => looping
		System.out.println("강제캐스팅3 정수 -> 실수 : " + i2 + " -> " + f1); // 정수 -> 실수
		
		float f2 = 10.55f;
		int i3 = (int)f2;
		System.out.println("강제캐스팅4 실수 -> 정수 : " + f2 + " -> " + i3);
		
		// 5. 2의 보수 : CPU가 보는 음수값
		int x = -10;
		System.out.println(x + " -> " + Integer.toBinaryString(x)); // int라서 32비트 -> 32자리로 앞에는 다 1로 채워준거
	}
}
