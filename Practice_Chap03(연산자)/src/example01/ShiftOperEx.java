package example01;

public class ShiftOperEx {
	
	public static void main(String[] args) {
		
		// shift 연산자 : <<(left shift), >>(right shift) => 처리속도가 빠름!(그래픽 분야에서 많이 사용)
		int a = 7;
		int b = 3;
		
		System.out.println(a + " << " + b + " : " + (a << b)); // 2^b 곱하는 거
		System.out.println(a + " >> " + b + " : " + (a >> b)); // 2^b으로 나누는 거 => 몫이 나옴
		
		// 알고리즘 강의 들을 때 shift 연산이랑 비트 연산으로 부분집합 구하는거 있었는데...
		
	}
}
