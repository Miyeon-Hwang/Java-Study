package example01;

public class AccuracyEx {
	public static void main(String[] args) {
		// CPU 연산의 오차를 확인해보자
		
		int apple = 1;
		double unit = 0.1;
		int num = 7;
		
		double result = apple - (unit * num);
		System.out.println(result);
		
		// 왜 0.3이 안나오지??
		
		System.out.println(unit * num);
		// 이 값이 0.7이 아니고 0.7000000000000001 이 나옴
		// 연산시에 double로 자동캐스팅되면서 실수 표현 범위를 넓게 가져가면서 사람이 생각하는거랑 다르게 오차가 생긴다..? 
	}

}
