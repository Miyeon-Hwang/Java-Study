package example02;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrEx02 {
	
	public static void main(String[] args) {
		
		// �� ���� �л����� ������ �Է¹ް� �հ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int[][] scores; // stack ������ 2���� �迭 �ּҸ� ������ 4byte �޸� �Ҵ�
		
		System.out.println("�ݼ� �Է� : ");
		scores = new int[sc.nextInt()][]; // heap�� �ݼ���ŭ 1�����迭 �ּҸ� ������ �޸� �Ҵ�. scores�� �� �ּҹ迭�� ����Ŵ
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d���� �л� �� : ", i + 1); // c���� ������ ����
			scores[i] = new int[sc.nextInt()]; // score[i]�� ������ �Է¹��� ������ ��ŭ�� 1���� �迭�� �����ϱ� ���� �޸� ������ heap�� �Ҵ�
		
			for (int j = 0; j < scores[i].length; j++) {
				System.out.printf("%d�� %d�� �л��� ���� : ", i + 1, j + 1);
				scores[i][j] = sc.nextInt();
			}
		}
		
		// �Է� Ȯ��
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "���� ���� : " + Arrays.toString(scores[i]));
		}
		
		System.out.println("��\t�հ�\t���");
		System.out.println("=================================");
		
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			double avg = (double)sum / scores[i].length;
			System.out.printf("%d��\t%d��\t%.2f\n", i + 1, sum, avg);
		}
		
	}

}
