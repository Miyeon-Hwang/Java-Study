package mathExample;

public class MathEx {

	public static void main(String[] args) {
		
		// 가까운 정수의 실수값 리턴
		System.out.println(Math.rint(5.8));
		System.out.println(Math.rint(5.2));
		
		// 반올림은 소수 첫째자리만 반영
		System.out.println(Math.round(5.4999));
		
		// Math.round()로 소수 셋째자리에서 반올림하려면?
		double value = 12.3456;
		double temp1 = value * 100;
		double temp2 = Math.round(temp1);
		value = temp2 / 100.0;
		System.out.println(value);
	}
}
