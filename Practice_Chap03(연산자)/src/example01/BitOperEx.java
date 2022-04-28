package example01;

public class BitOperEx {

	public static void main(String[] args) {
		// &, |, ^ 비트 연산자
		int x = 8;
		int y = 10;
		
		// & => 둘다 1일때만 1
		System.out.println(x + "을 2진수 변환 : " + Integer.toBinaryString(x));
		
		// | : 둘 중 하나만 1이어도 1
		System.out.println(y + "을 2진수 변환 : " + Integer.toBinaryString(y));
		
		System.out.println(x + "와 " + y + "를 비트 & 연산하면? " + (x & y));
		System.out.println(x + "와 " + y + "를 비트 | 연산하면? " + (x | y));
		
		// ^ => exclusive or (배타적 논리합) : 서로 다를 때 1
		System.out.println(x + "와 " + y + "를 비트 ^ 연산하면? " + (x ^ y));
	}

}
