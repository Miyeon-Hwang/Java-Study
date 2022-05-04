package example02;

public class TwoDimArrEx01 {
	
	public static void main(String[] args) {
		
		int[][] score = new int[][] { 
										{100, 100, 100}, 
										{50, 50, 50}, 
										{10, 20, 30},
										{1, 2, 3}
									};
									
		
		// 1. 2차원 배열에서는 2차원 배열명도 주소, 1차원 배열명도 주소를 리턴함!!!
		System.out.println("2차원 배열이 주소 : " + score);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(i +"행 1차원 배열의 주소 : " + score[i]); // 각 행의 주소값
		}
		
		
		// 2. 향상된 for 문
		// collection framework 객체에 접근할 때 유용하게 사용
		for (int[] arr : score) {
			System.out.println(arr);
		}
		
		for (int val : score[2]) {
			System.out.println(val);
		}
									
	}

}
