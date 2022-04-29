package example01;

public class RandomEx {
	
	public static void main(String[] args) {
		//Math.random()은 0 <= x < 1 범위의 double 값 x를 리턴
		
		// 주사위 눈 랜덤 발생
		int num = (int)(Math.random() * 6) + 1;
		System.out.println(num);
		
		// 0 <= x < 10 인 정수 랜덤 발생
		int num2 = (int)(Math.random() * 10);
		System.out.println(num2);
	}
}
