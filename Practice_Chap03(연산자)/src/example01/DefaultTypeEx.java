package example01;

public class DefaultTypeEx {

	public static void main(String[] args) {
		
		// 1. 연산시에 int보다 작은 정수 타입은 int로 변환 후 연산을 함
		byte b1 = 127;
		byte b2 = 1;
		
		//byte b3 = b1 + b2; // int + int를 byte 값으로 대입하므로 에러남
		// int 형으로 받아주거나 연산 후 byte로 강제캐스팅
		byte b3 = (byte)(b1 + b2);
		System.out.println(b1 + " + " + b2 + " = " + b3);
		
		// char도 int와 연산시에는 int로 변환 (ASCII CODE)
		char c = 'A';
		System.out.println("3 + " + c + " = " + (3 + c));

		// 2. 정수형, 실수형 연산 시에는 표현 범위가 넓은 쪽으로 형변환
		float f = b1 - 10.22f; // byte + float => float + float
		System.out.println(f);
		
		//float f2 = b1 + 10.55; // 에러!! byte + double 이므로 double로 받아줘야 함
	}

}
