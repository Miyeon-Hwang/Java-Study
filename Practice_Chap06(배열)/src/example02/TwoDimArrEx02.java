package example02;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrEx02 {
	
	public static void main(String[] args) {
		
		// 반 별로 학생들의 점수를 입력받고 합계 구하기
		Scanner sc = new Scanner(System.in);
		int[][] scores; // stack 영역에 2차원 배열 주소를 저장한 4byte 메모리 할당
		
		System.out.println("반수 입력 : ");
		scores = new int[sc.nextInt()][]; // heap에 반수만큼 1차원배열 주소를 저장할 메모리 할당. scores가 이 주소배열을 가리킴
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d반의 학생 수 : ", i + 1); // c언어랑 동일한 포맷
			scores[i] = new int[sc.nextInt()]; // score[i]가 참조할 입력받은 사이즈 만큼의 1차원 배열을 저장하기 위한 메모리 영역을 heap에 할당
		
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("%d반 %d번 학생의 점수 : ", i + 1, j + 1);
				scores[i][j] = sc.nextInt();
			}
		}
		
		// 입력 확인
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "반의 점수 : " + Arrays.toString(scores[i]));
		}
		
		System.out.println("반\t합계\t평균");
		System.out.println("=================================");
		
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double avg = (double)sum / scores[i].length;
			System.out.printf("%d반\t%d점\t%.2f\n", i + 1, sum, avg);
		}
		
	}

}
